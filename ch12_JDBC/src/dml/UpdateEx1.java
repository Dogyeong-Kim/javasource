package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEx1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {

            // 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // connection 객체 생성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            // 삭제대상 부서 동적일 때
            String sql = "UPDATE dept_temp SET loc = 'SEOUL' where deptno = 10";
            pstmt = con.prepareStatement(sql);

            System.out.println(pstmt.executeUpdate() > 0 ? "수정성공" : "수정실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
