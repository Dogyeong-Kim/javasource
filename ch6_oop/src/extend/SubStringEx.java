package extend;

public class SubStringEx {
    public static void main(String[] args) {
        SubString obj = new SubString();
        // 본인 멤버 변수가 우선됨
        System.out.println("이름 " + obj.name);
        obj.list(); // 성춘향 하위 클래스 이름 출력을 원한다면?

    }
}
