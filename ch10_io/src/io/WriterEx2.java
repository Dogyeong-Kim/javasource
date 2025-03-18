package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriterEx2 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아들여
        // 사용자가 q 입력하면 입력 받는걸 중지 그 내용을 파일에 작성

        System.out.println("파일에 작성할 데이터를 입력해 주세요");
        System.out.println("중지하려명 q 를 입력해 주세요");

        try (Scanner sc = new Scanner(System.in);
                FileWriter fw = new FileWriter("c:/temp/output2.txt");
                BufferedWriter bw = new BufferedWriter(fw);) {

            String data = "";

            do {
                System.out.print(">> ");
                data = sc.nextLine();

                if (!data.equals("q")) {
                    bw.write(data);
                    bw.newLine();
                }
            } while (!data.equals("q"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
