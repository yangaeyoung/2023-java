package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run = new RunRobot();
        Runnable2 run2 = new Runnable2() {//객체화가 아님 == 익명 클래스
            @Override
            public void run() {
                System.out.println("하하하");
            }
        };
    }
}

interface Runnable2 {
    void run();//public abs 생략되어 있는 추상 메소드기 때문에 오버라이딩 해야 함
}

class RunRobot implements Runnable2{

    @Override
    public void run() {
        System.out.println("로봇이 달린다.");
    }
}
