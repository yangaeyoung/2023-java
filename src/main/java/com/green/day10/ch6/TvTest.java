package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
        //( ↓ ) = tv객체의 변수를 담을 수 있는 변수
        Tv tv1 = new Tv();//대문자는 변수가 선언할 때 담을 수 있는 //new는 Tv(클레스명)를 객체화
        tv1.channel = 10;//주소값 "." = 객체한테 접근
        tv1.power = true;
        tv1.color = "빨간색";

        Tv tv2 = new Tv();
        tv2.channel = 20;

        System.out.println("tv1 == tv2 >>" + (tv1 == tv2));//주소값이 다름 new 각각 새로운 존재

        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv1.channel : " + tv1.power);
        System.out.println("tv1.channel : " + tv1.color);
        System.out.println("-------------------------");
        System.out.println("tv2.channel : " + tv2.channel);//디폴트 값이 0
        System.out.println("tv2.channel : " + tv2.power);//값을 주입하지 않아도 출력되는데 디폴트값이 있다
        System.out.println("tv2.channel : " + tv2.color);//디폴트값은 null=주소값을 갖고 있지 않음
    }
}
