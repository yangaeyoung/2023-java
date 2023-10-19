package com.green.day16.ch7;

import java.sql.SQLOutput;

public class Animal {
    public void crying(){
        System.out.println("동물이 운다.");
    }
}

class AnimalTest{
    public static void main(String[] args) {
        //부모 타입은 자식 객체 주소값 담을 수 있음
        Dog d1 = new Bulldog();
        Animal ani1 = new Bulldog();
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();

        //자식 타입은 부모 객체 주소값 담을 수 없음
        //Bulldog bull1 = new Dog();

        //타입은 알고 있는 메소드만 호출할 수 있고, 호출이 된다면 객체 기준임
        Bulldog bull3 = new Bulldog();
        bull3.jump();
        bull3.crying();

        Dog dog2 = new Bulldog();
        //dog2.jump();// Dog 메소드 안에 없어서 모르는 것
        dog2.crying();

        System.out.println("끝");
    }
}

class AnimalTest3{
    public static void main(String[] args) {
        Animal ani = new Cat();
        System.out.println(ani instanceof Dog);//false   (ani instanceof Dog) boolean타입
        //Dog dog = (Dog)ani; 에러
        System.out.println(ani instanceof Cat);//true
        Cat cat = (Cat)ani;
        System.out.println("끝");

    }
}

class AnimalTest2{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();

        System.out.println(bulldog instanceof Dog);//형변환이 가능한지
        Dog dog2 = bulldog;

        System.out.println(bulldog instanceof Bulldog);
        System.out.println(bulldog instanceof Animal);
        Animal ani = bulldog;
        System.out.println(ani instanceof Cat);
        //Cat cat2 = (Cat)ani; 강제로 형변환해도 에러




        callCrying(dog);
        callCrying(cat);
        callCrying(bulldog);


    }
    private static void callCrying(Animal ani){
        ani.crying();
        if(ani instanceof Bulldog){
            Bulldog bulldog = (Bulldog) ani;
            bulldog.jump();
//            ((Bulldog) ani).jump();
        }

    }
//    private static void callCrying(Dog dog){
//        dog.crying();
//    }
//    private static void callCrying(Cat cat){
//        cat.crying();
//    }
//    private static void callCrying(Bulldog bulldog){
//        bulldog.crying();
//    }
}

class Dog extends Animal{
    @Override
    public void crying(){
        System.out.println("멍! 멍!");
    }
}

class Bulldog extends Dog{

    public void jump(){
        System.out.println("불독이 점프! 점프!");
    }

    @Override
    public void crying(){
        System.out.println("불독이 왈! 왈!");
    }
}

class Cat extends Animal{
    @Override
    public void crying(){
        System.out.println("야옹~ 야옹~");
    }
}