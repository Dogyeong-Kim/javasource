package basic;

public class BoardMain {

    public static void main(String[] args) {
        BoardDAO dao = new BoardDAO();

        BoardDTO dto = BoardDTO.builder()
                .title("두번째")
                .content("두번째 내용")
                .writer("user2")
                .build();
        int result = dao.insert(dto);
        System.out.println(result > 0 ? "삽입성공" : "삽입실패");
    }

}
