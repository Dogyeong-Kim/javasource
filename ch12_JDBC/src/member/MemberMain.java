package member;

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

                    break;
                case 4:

                    break;
                case 5:

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
