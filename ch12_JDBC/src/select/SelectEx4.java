package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectEx4 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);

        try {
            // 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // connection 객체 생성
            // jdbc:oracle:thin => Oracle 연결문자열
            // @
            // localhost => 내 컴퓨터(== 127.0.0.1)
            // 1521 => 오라클 서버 포트번호
            // xe => 오라클 DB명
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                // System.out.println("연결되었습니다.");

                // System.out.print("조회할 사원번호 입력 : ");
                // int empno = Integer.parseInt(sc.nextLine());

                // emp 테이블 : empno = 7369 조회

                String sql = "SELECT e.EMPNO, e.DEPTNO, e.SAL, d.DNAME, d.LOC ";
                sql += "FROM EMP e, DEPT d ";
                sql += "WHERE e.DEPTNO = d.DEPTNO AND e.SAL <= 2500 AND e.EMPNO <= 9999";

                // Statement 객체 생성
                pstmt = con.prepareStatement(sql);
                // pstmt.setInt(1, empno);
                // Query 수행
                rs = pstmt.executeQuery();

                // ResultSet 객체로부터 데이터 추출
                while (rs.next()) {
                    // number => int
                    int empno = rs.getInt(1);
                    // varchar => String
                    int deptno = rs.getInt("deptno");
                    int sal = rs.getInt("sal");
                    String dname = rs.getString("dname");
                    String loc = rs.getString("loc");

                    System.out.printf("%d  %d  %d  %s  %s\n", empno, deptno, sal, dname, loc);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
