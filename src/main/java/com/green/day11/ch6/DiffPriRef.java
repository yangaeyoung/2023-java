package com.green.day11.ch6;

public class DiffPriRef {
    public static void main(String[] args) {
        int num = 30; //30이 num에 복사되어
        changeVal(num);//30
        System.out.println("num : " + num);

        NumBox nb = new NumBox();
        nb.num = 30;//0이 있었던 값이 30으로 변경됨
        changeVal(nb);//같은 타입의 changeVal를 찾아 실행됨// nb2한테 복사해준 게 0x10이라는 주소값
        System.out.println("nb.num : " + nb.num);
    }

    public static void changeVal(int num) {//30이 num에 복사되어 int val에 들어옴
        System.out.println("changeVal - int");
        num = 10;
    }

    public static void changeVal(NumBox nb2) {//주소값을 복사해오기 때문에 nb.num과 nb2.num과 같은 것과 같다
        System.out.println("changeVal - NumBox");
        nb2.num = 10;//기존값은 지워지고 10이 들어가게 됨
        System.out.println("nb2 : " + nb2.num);
    }
}
    class NumBox {
        int num;
    }
