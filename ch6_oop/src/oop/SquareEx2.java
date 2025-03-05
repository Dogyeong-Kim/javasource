package oop;

import java.util.Arrays;

public class SquareEx2 {
    public static void main(String[] args) {

        // 타입 배열명[] = new 타입[5];
        // 타입 배열명[] = {};
        // 객체 배열
        // 객체(클래스)명 배열명[] = new 객체(클래스)명[5];
        Square squareArr[] = new Square[5];
        System.out.println(Arrays.toString(squareArr)); // [null, null, null, null, null]

        // 객체 배열 초기화
        // squareArr[0] = new Square(); // sideLength = 0
        // squareArr[1] = new Square();
        // squareArr[2] = new Square();
        // squareArr[3] = new Square();
        // squareArr[4] = new Square();

        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i] = new Square();
        }

        // sideLength 값 부여
        squareArr[0].sideLength = 35;
        squareArr[1].sideLength = 15;
        squareArr[2].sideLength = 12;
        squareArr[3].sideLength = 5;
        squareArr[4].sideLength = 4;

        for (int i = 0; i < squareArr.length; i++) {
            System.out.printf("%d 번째 면적: %d\n", (i + 1), squareArr[i].getArea());
        }

    }
}
