package oop;

import java.util.Arrays;

public class MethodEx {
    public static void main(String[] args) {
        // Method 인스턴스 생성
        Method method = new Method();

        // 메소드 호출
        int result = method.add(15, 25);
        System.out.println("result = " + result);

        float result2 = method.add2(35, 45.2f);
        System.out.println("result2 = " + result2);

        System.out.println(method.add(45, 55));

        method.print("홍길동", "s123");

        //
        int arr[] = { 1, 2, 3 };
        int arr2[] = method.arr(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
