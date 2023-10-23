package com.green.day17.ch7;

import javax.management.openmbean.CompositeType;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer c = new Computer();
//        System.out.println(computer);//computer, price:200, bonusPirce: 20
        int price = c.getPrice();
        int bonusPoint = c.getBonusPoint();
        System.out.println(price);
        System.out.println(bonusPoint);
//        Tv tv = new Tv();
//        System.out.println(tv);//Tv, price : 100, bonusPoint: 10;

//        Product p = new Product();//안 되어야 함
//        Product p2 = new Product(100);//Price에 100이 저장되어야 하고 bonusPoint의 10%인 10이 저장되어야 함
//        System.out.println(p2);
//
//        Product p3 = new Product(200);//Price에 200이 저장되어야 하고 bonusPoint의 10%인 20이 저장되어야 함
//        System.out.println(p3);
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer);//money: 1000, bonusPoint:0
        buyer.buy(new Tv());//price :100
        buyer.buy(new Computer());//price : 200
        buyer.buy(new Computer());//price : 200
        buyer.buy(new Computer());//price : 200
        buyer.buy(new Computer());//price : 200
        buyer.buy(new Computer());//price : 200
        buyer.buy(new Computer());//price : 200
        //buyer의 money가 부족하면 "잔액부족" money값 마이너스 처리 x
        //잔액이 부족하지 않으면 Tv을/를 구입하셨습니다.
        //>money 마이너스 처리, bonusPoint 플러스 처리
    }
}

class Buyer {
    private int money;
    private int bonusPoint;

    Buyer() {
        money = 1050;//Buyer()에 파라미터 값이 없기 때문에 앞에 this 생략 가능
        bonusPoint = 0;// 0일 경우 주석 처리 가능
    }

    public void buy(Product product) {//Product에 있는 getter setter 호출 가능
        System.out.printf("제품명: %s", product);
        System.out.printf(" price : %d", product.getPrice());
        System.out.printf(" bonusPoint : %d\n", product.getBonusPoint());

        if (money < product.getPrice()) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
            money -= product.getPrice();
            bonusPoint += product.getBonusPoint();
            System.out.printf("남은 잔액은 %d 입니다.\n", money);
            System.out.printf("%s을/를 구입하셨습니다.\n", product);
            System.out.printf("bonusPoint %d 입니다.\n", bonusPoint);
    }
//         public void buy(Tv tv) {
//        System.out.println("price : " + tv.getPrice());//get으로 Tv객체의 100을 읽어옴
//    }
//    public void buy(Computer computer){
//        System.out.println("price : " + computer.getPrice());//200
//    }

    @Override
    public String toString() {
        return String.format("money : %d, bonusPoint : %d", money, bonusPoint);
    }
}


class Product {// Product는 오브젝트를 상속받음 임의로 적지 않아도 자동으로 extend Object가 있기 때문
    private int price;
    private int bonusPoint;
    Product(int price) {//생성자가 이미 있기 때문에 기본생성자 자동으로 생성 X
        this.price = price;
        this.bonusPoint = price / 10;
//        this.bonusPoint = (int)(price * 0.1);
    }

    public void setPrice(int price) {
    }

    public void setBonusPoint(int bonusPoint) {
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("price : %d, bonusPoint : %d", price, bonusPoint);
    }
}

class Tv extends Product {
    public Tv() {
        super(100);
    }

    @Override
    public String toString() {
//            return "Computer, " + super.toString();//오버라이딩의 오버라이딩
        return "Tv";
    }
}

class Computer extends Product {
    public Computer() {
        super(200);//기본 생성자를 호출하든가 super로 기존에 있는 생성자 호출하여 사용하면 됨
    }

    @Override
    public String toString() {
//            return "Computer, " + super.toString();//오버라이딩의 오버라이딩
        return "Computer";
    }
}


