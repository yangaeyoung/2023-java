package com.green.day10.ch6;

public class Tv {
    //속성 명사 담당 (멤버필드, property, 전역변수)-변수 O, 값을 저장하는 것이 목적
    String color;//레퍼런스(참조형)의 기본값은 null
    boolean power;
    int channel;

    //메소드 동사 담당 (멤버메소드) //(리턴타입, 메소드명, 파라미터(매개변수))
    void power()         { power = !power; } //void는 리턴타입, 전체를 정의했다라고 표현
    //메소드의 선언부(필수) /  구현부
    void channelUp() {channel++;}
    void channelDown() {channel--;}
}
