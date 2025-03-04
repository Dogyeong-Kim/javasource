package oop;

import java.time.LocalDate;

public class ProductEx {
    public static void main(String[] args) {

        // 인스턴스 생성
        // 생성자 호출
        Product product1 = new Product();
        // 초기화
        product1.pCode = "p10214";
        product1.pName = "운동화";
        product1.price = 124000;
        product1.regiDate = LocalDate.now();

        System.out.println(product1);

    }
}
