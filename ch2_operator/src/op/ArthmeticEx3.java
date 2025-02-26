package op;

public class ArthmeticEx3 {
    public static void main(String[] args) {
       char c1 = 'a';
       char c2 = c1;
       char c3 = ' ';
       // byte, short, char 연산 수행 시 연산의 결과가 int 형으로 변경 됨
       // c3 = c1 + 1;
       
       // 해결책 1
       int result = c1 + 1;
       
       // 해결책 2
       c3 = (char)(c1 + 1);

       c2++; // c2 = c2 + 1;
       c2++; // c2 = c2 + 1;
       
       System.out.println("c1 = "+c1);
       System.out.println("c2 = "+c2);
       System.out.println("result = "+result); // 98
       System.out.println("c3 = "+c3); // b


    }
}
