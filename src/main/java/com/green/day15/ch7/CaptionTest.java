package com.green.day15.ch7;

class Tv{
    boolean power;//속성, 메소드, 멤버필드, 전역변수
    int channel;

    void power() { power = !power; }//토글
    void ChannelUp() { channel++; }
    void channelDown() { channel--; }

}

class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }

    @Override //부모클래스를 새로 정의해서 씀, 애노테이션annotation
    void ChannelUp(){
        channel += 2;
    }
}


public class CaptionTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        System.out.printf("cTv.power : %b\n", cTv.power);//false
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);//true
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);//false
        cTv.channel = 10;
        cTv.ChannelUp();
        System.out.printf("cTv.channel : %d\n",cTv.channel);
        cTv.displayCaption("반갑다 친구들!!!");//if문의 false가 뜨기 때문에 출력이 안 됨
        cTv.caption = true;//if문을 출력시키기 위해서 if문의 값을 true로 변경시켜서 출력하게 만듦
        cTv.displayCaption("anhfq!!!");
    }
}