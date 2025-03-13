package api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        // 요소 추가
        list.add("사과");
        list.add("바나나");
        list.add("수박");
        list.add("자몽");
        list.add("포도");
        list.add("감");
        list.add("귤");

        // 제거
        System.out.println("index를 이용한 제거 " + list.remove(1));
        System.out.println("아이템 제거 " + list.remove("감"));

        // for
        // 배열 : length, 리스트 : size()
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s\t", list.get(i));
        }
        System.out.println();

        for (String str : list) {
            System.out.printf("%s\t", str);
        }

        System.out.println();

        System.out.println("리스트에 특정 단어 포함 여부 " + list.contains("키위"));
        System.out.println("리스트에 특정 단어 포함 위치 " + list.indexOf("자몽"));

        // int[] arr = {}
        // 배열 => 리스트 변환(조회용)
        // Arrays : 배열에 필요한 유용한 메소드 제공
        String strArr[] = { "사과", "포도", "멜론", "수박", "참외", "바나나", "자두" };
        List<String> list2 = Arrays.asList(strArr);
        System.out.println("조회 " + list2.get(3));
        // UmsopportedOperationException : 변경
        // System.out.println("삭제 " + list2.remove(3));
        // list.add("딸기");

        // 배열 => 리스트 변환(조회 + 변경)
        List<String> list3 = new ArrayList<>(Arrays.asList(strArr));
        list3.add("딸기");
        list3.remove(3);

        // 리스트 => 배열
        Object[] arrs = list3.toArray();
        System.out.println(Arrays.toString(arrs));
    }
}
