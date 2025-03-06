package oop;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath math = new MyMath();

        System.out.println(math.add(15, 25));
        System.out.println(math.add(15L, 25));
        System.out.println(math.add(15, 25L));

        int arr[] = { 3, 4, 5 };
        System.out.println(math.add(arr));
    }
}
