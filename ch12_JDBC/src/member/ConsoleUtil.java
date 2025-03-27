package member;

import java.util.Scanner;

public class ConsoleUtil {

    public MemberDTO memberInsertInfo(Scanner sc) {
        System.out.println();
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("====== 회원정보 입력화면 ======");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("이름 >> ");
        memberDTO.setName(sc.nextLine());
        System.out.print("주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        System.out.print("이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        System.out.print("나이 >> ");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));

        return memberDTO;
    }

    // 성공시 출력 메소드
    public void printSuccessMessage(int result) {
        // result 여부에 따라 입력 성공 / 입력 실패 출력
        System.out.println(result > 0 ? "입력 성공" : "입력 실패");
    }

    // 업데이트 성공시 출력 메소드
    public void printUpdateSuccessMessage(int result, String id) {
        // result 여부에 따라 수정 성공 / 수정 실패 출력
        System.out.println(result > 0 ? id + "님의 정보를 수정하였습니다." : id + "님의 정보 수정에 실패하였습니다.");
    }

    public MemberDTO memberUpdateMenu(Scanner sc) {

        System.out.println("====== 회원 정보 수정 ======");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("============================");
        System.out.print("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());

        // no == 1 memberUpdateAddr() 호출
        // no == 2 memberUpdateEmail() 호출
        if (no == 1)
            return memberUpdateAddr(sc);
        else if (no == 2)
            return memberUpdateEmail(sc);
        // 리턴 받은 DTO 리턴
        return null;
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        // 수정할 값 입력(id, 변경할 addr) => DTO에 담은 후 리턴
        System.out.println("===== 수정 정보 입력 =====");
        System.out.print("아이디 >> ");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());
        System.out.print("변경 주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        return memberDTO;
    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        // 수정할 값 입력(id, 변경할 email) => DTO에 담은 후 리턴
        System.out.println("===== 수정 정보 입력 =====");
        System.out.print("아이디 >> ");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());
        System.out.print("변경 이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        return memberDTO;
    }
}
