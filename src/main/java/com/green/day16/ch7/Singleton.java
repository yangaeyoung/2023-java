package com.green.day16.ch7;


public class Singleton {
    private Singleton(){}

    private static Singleton singleton; //객체화 필요하지만(static없을 때 static 넣어서 맞춰줌)
    public static Singleton getInstance(){//객체 필요 없음(static)
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}

class SingletonTest{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();//대문자 S로 static메소드
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);//ture 객체를 마치 static처럼 하나만 만들어서 주소값이 같음

//        Singleton s1 = new Singleton(); // private이 붙어서 객체 생성 불가
    }
}
