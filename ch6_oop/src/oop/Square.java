package oop;

public class Square {
    // 정사각형
    // 속성 : 길이(sideLength)
    int sideLength;

    // 생성자, toString

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public Square() {
    }

    // 기능 : 면적 구하기
    int getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square [sideLength=" + sideLength + "]";
    }
}
