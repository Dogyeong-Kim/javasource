package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dto.DeptDTO;

public class InsertEx2 {

    private static Scanner scanner = new Scanner(System.in);

    public static DeptDTO data(Scanner scanner) {
        // 테이블에 저장 데이터 입력받기
        System.out.println("------ dept 테이블 데이터 입력 ---------");
        System.out.print("deptno >> ");
        int deptno = Integer.parseInt(scanner.nextLine());
        System.out.print("dname >> ");
        String dname = scanner.nextLine();
        System.out.print("loc >> ");
        String loc = scanner.nextLine();

        DeptDTO dto = new DeptDTO(deptno, dname, loc);
        return dto;
    }

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

            DeptDTO dto = data(scanner);

            String sql = "insert into dept_temp(deptno, dname, loc) values(?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            // ? 세팅
            pstmt.setInt(1, dto.getDeptno());
            pstmt.setString(2, dto.getDname());
            pstmt.setString(3, dto.getLoc());

            int result = pstmt.executeUpdate();

            System.out.println(result > 0 ? "입력성공" : "입력실패");

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
