package op;

// 비교연산자 : 결과는 true or false
// 대소비교 : <. >, <=, >=
// 등가비교 : ==(equal), !=(not equal)

// 문자열 : "a", "abc"

public class CompareEx3 {
    public static void main(String[] args) {
        // 변수 선언 : 기본 타입
        // 문자열은 기본 타입으로 선언하지 않는다. 객체타입
        String str1 = "abc";
        String str2 = "abc";        
        String str3 = new String("abc");    
    
        
        //str1(str2) 을 저장하는 공간과 str3을 저장하는 공간이 다름
        //같은 공간에서 저장된 문자열 비교시 == 을 사용(값 비교)하면 true
        // 다른 공간에서 저장된 문자열 비교시 == 사용(주소 비교)  

        System.out.printf("str1 == str2 = %b\n",(str1 == str2)); // true
        System.out.printf("str1 == str3 = %b\n",(str1 == str3)); // false
        // 문자열 비교 == 대신에, euqals(), equalsIgnoreCase() 사용
        // abc == ABC : false
        System.out.printf("str1.equals(str3) = %b\n",(str1.equals(str3))); // true
        System.out.printf("str1.equals(ABC) = %b\n",(str1.equals("ABC"))); // false
        System.out.printf("str1.equalsIgnoreCase(str3) = %b\n",(str1.equalsIgnoreCase(str3))); // true 
        System.out.printf("str1.equalsIgnoreCase(ABC) = %b\n",(str1.equalsIgnoreCase("ABC"))); // true 
    }
}
