package op;

// 증감연산자 : +1, -1 간단하게 처리
// ++, -- : 변수 앞(전위), 변수 뒤(후위)
// 전위, 후위든 단독으로 사용되는 경우는 결과가 동일하다
// 다른 수식에 포함되거나 메서드의 매개변수에 사용되는 경우, 단독으로 
// 사용되지 않는 경우는 겨로가가 다르다. 

public class IncDecOperEx1 {
    public static void main(String[] args) {
        int num = 10;

        // num = num + 1;
        // num++;
        ++num;
        System.out.println("num = "+num);

        // num = num - 1;
        // num--;
        --num;
        System.out.println("num = "+num);

        int num2 = 20;
        // ++num2
        // ① num2 + 1 을 먼저 한 후 사용
        // num2++
        // ①num2 사용
        // ②num2 + 1 을 함
        System.out.println("num2 = "+ (++num2));
    }
}
