package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    static {
        try {
            // 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";

        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // DML + Select
    // insert, delete, update : int 리턴
    // select : ~~ DTO(where pk 지정) or List<~~DTO>
    // select * from member where name like '%홍%'

    public List<MemberDTO> getNameList(String name) {

        List<MemberDTO> list = new ArrayList<>();

        try {
            con = getConnection();

            String sql = "SELECT * FROM MEMBER WHERE NAME LIKE ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();

            // rs => dto 옮기기
            while (rs.next()) {
                MemberDTO memberDTO = new MemberDTO();
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
                list.add(memberDTO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    public List<MemberDTO> getList() {

        List<MemberDTO> list = new ArrayList<>();

        try {
            con = getConnection();

            String sql = "SELECT * FROM MEMBER";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // rs => dto 옮기기
            while (rs.next()) {
                MemberDTO memberDTO = new MemberDTO();
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
                list.add(memberDTO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    public MemberDTO getRow(String id) {

        MemberDTO memberDTO = null;

        try {
            con = getConnection();

            String sql = "SELECT * FROM MEMBER WHERE id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);

            rs = pstmt.executeQuery();
            // rs => dto 옮기기
            if (rs.next()) {
                memberDTO = new MemberDTO();
                // rs 꺼내기 get()
                // String name = rs.getString("name");
                // 담기 set()~~
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return memberDTO;
    }

    // delete : 전달인자 - pk 사용함
    public int delete(String id) {
        int result = 0;
        try {

            con = getConnection();
            String sql = "DELETE FROM member WHERE id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    // insert, update : 전달인자 ~~DTO 설정
    public int update(MemberDTO memberDTO) {
        // member DTO
        // 1. id, addr
        // 2. id, email

        int result = 0;

        try {
            con = getConnection();

            String sql = "UPDATE MEMBER ";

            if (memberDTO.getAddr() != null) {
                sql += "SET addr = ? ";
                sql += "WHERE id = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getAddr());
                pstmt.setString(2, memberDTO.getId());
            } else {
                sql += "SET email = ? ";
                sql += "WHERE id = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getEmail());
                pstmt.setString(2, memberDTO.getId());
            }

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;
    }

    public int insert(MemberDTO memberDTO) {
        int result = 0;

        try {
            con = getConnection();

            String sql = "INSERT INTO MEMBER(no, id, name, addr, email, age) ";
            sql += "VALUES(member_seq.nextval, ?, ?, ?, ?, ?)";

            pstmt = con.prepareStatement(sql);
            // 물음표 해결
            pstmt.setString(1, memberDTO.getId());
            pstmt.setString(2, memberDTO.getName());
            pstmt.setString(3, memberDTO.getAddr());
            pstmt.setString(4, memberDTO.getEmail());
            pstmt.setInt(5, memberDTO.getAge());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;
    }
}
