package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEx2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {

            // 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // connection 객체 생성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            System.out.print("삭제 부서 입력 >> ");
            int no = Integer.parseInt(sc.nextLine());

            // 삭제대상 부서 동적일 때
            String sql = "delete from dept_temp where deptno = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, no);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("삭제 성공");
            }

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
