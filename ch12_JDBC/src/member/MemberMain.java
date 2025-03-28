package member;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberDAO mDao = new MemberDAO();
        MemberDTO mDto = null;
        ConsoleUtil util = new ConsoleUtil();
        boolean run = true;
        while (run) {
            System.out.println("================== Member ====================");
            System.out.println("1. Member 추가");
            System.out.println("2. Member 수정");
            System.out.println("3. Member 삭제");
            System.out.println("4. Member 조회");
            System.out.println("5. Member 전체 조회");
            System.out.println("6. Member 프로그램 종료");
            System.out.println("=============================================");

            System.out.print("메뉴 선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    MemberDTO dto = util.memberInsertInfo(sc);
                    int result = mDao.insert(dto);
                    util.printSuccessMessage(result);
                    break;
                case 2:
                    mDto = util.memberUpdateMenu(sc);
                    if (mDto != null) {
                        result = mDao.update(mDto);
                        // 출력문 호출
                        util.printUpdateSuccessMessage(result, mDto.getId());
                    }
                    break;
                case 3:
                    String id = util.memberDeleteInfo(sc);
                    result = mDao.delete(id);
                    // 삭제 성공 메세지 출력 메소드 호출
                    util.printDeleteSuccessMessage(result);
                    break;
                case 4:
                    String input = util.memberGetInfo(sc);

                    // regex(정규식)
                    // input.matches("^[A-Za-z].*") : 정규식과 일치하면 true

                    // 아이디는 영어로 시작 => getRow()
                    if (input.matches("^[A-Za-z].*")) {
                        MemberDTO row = mDao.getRow(input);
                        if (row != null) {
                            // 출력 메소드
                            util.memberPrint(row);
                        }
                    } else {
                        // 이름은 한글로 시작 => getNameList()
                        List<MemberDTO> list = mDao.getNameList(input);
                        if (!list.isEmpty()) {
                            util.memberAllPrint(list);
                        }
                    }
                    break;
                case 5:
                    // mDao.getList() => 받은 결과 출력
                    List<MemberDTO> list = mDao.getList();
                    util.memberAllPrint(list);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
