package oop;

public class TvEx {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.size = 50;
        tv.color = "black";

        Tv2 tv2 = new Tv2(60, "white");
        // The field Tv.size is not visible
        // tv2.size = 60;
        // tv 켜기
        tv2.power();
        // 채널 변경
        tv2.changeChannel(7);

        Tv2 tv3 = new Tv2();
        tv3.power();
        tv3.changeChannel(11);

        Tv3 obj1 = new Tv3();
        System.out.println("처음 상태");
        System.out.println(obj1.toString()); // [size=0, color=null, channel=0, volume=0, power=false]

        obj1.setSize(60);
        obj1.setColor("Green");
        System.out.println("색상 : " + obj1.getColor());
        System.out.println("사이즈 : " + obj1.getSize());

    }
}
