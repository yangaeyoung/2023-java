package com.green.day15.ch7;

public class Parent {
    int age;
}

class Child extends Parent {//부모 age를 상속받아 이용할 수 있음

    void play() {
        System.out.println("놀자~");
    }
}

class Child2 extends Parent {
    void jump() {
        System.out.printf("%d살의 아이가 점프를 하였다.", age);
    }
}

class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10;
        c1.play();


        Child2 c2 = new Child2();
        c2.age = 7;
        c2.jump();
    }
}
