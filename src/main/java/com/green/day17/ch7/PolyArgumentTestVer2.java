package com.green.day17.ch7;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p = new Product2("Tv", 100);
        System.out.println(p);
    }
}

class PolyArgumentTestVer2_2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        System.out.println(tv);//name: Tv, price: 100, bonusPoint: 10
        Computer2 com = new Computer2();
        System.out.println(com);//name: Computer, price : 200, bonusPoint : 20
        Audio2 audio = new Audio2();
        System.out.println(audio);//name: Audio, price : 500, bonusPoint : 50
    }
}

class PolyArgumentTestVer2_3 {
    public static void main(String[] args) {
        Buyer2 buyer = new Buyer2();
        buyer.buy(new Tv2());//0
        buyer.buy(new Computer2());//1
        buyer.buy(new Computer2());//1
        buyer.buy(new Computer2());//1
        buyer.buy(new Computer2());//1
        buyer.buy(new Computer2());//1
        buyer.buy(new Computer2());//1
        buyer.buy(new Computer2());//1
        buyer.buy(new Computer2());//1
        buyer.buy(new Computer2());//1
        buyer.buy(new Computer2());//1
        buyer.buy(new Computer2());//1


//        for (int i = 0; i < buyer.productArr.length; i++) {
//            Product2 p = buyer.productArr[i];
//            System.out.printf("arr[%d] : %s\n", i, p);
//        }
    }
}


    class Buyer2 {
        //money(정수) 저장 가능
        //bonusPoint (정수) 저장 가능
        //Product2 객체의 주소값 10 저장 가능
        private int money;
        private int bonusPoint;
        Product2[] productArr;
        private int i = 0;

        public Buyer2() {
            this.money = 1000;
            this.bonusPoint = 0;
            productArr = new Product2[10];
        }

        public void buy(Product2 p) {
            if (i == productArr.length) {
                System.out.println("더 이상 구매 불가");
                return;
            }if(money < p.getPrice()){
                System.out.println("금액이 부족합니다.");
                return;
            }
            money -= p.getPrice();
            bonusPoint += p.getBonusPoint();
            productArr[i++] = p;
            System.out.printf("name : %s, price : %d, bonusPoint : %d\n", p.getName(), money, bonusPoint);
        }
    }

    class Tv2 extends Product2 {
        public Tv2() {//기본 생성자
            super("TV", 100);//조상 Product2(String name, int price) 호출을 하기 때문에 타입에 맞게 적기
        }

        @Override
        public String toString() {
            return String.format("name : %s, price : %d, bonusPoint : %d", getName(), getPrice(), getBonusPoint());
        }
    }

    class Computer2 extends Product2 {//Product2 조상을 상속 받아서 toString 없어도 Product2의 toString을 호출

        public Computer2() {
            super("Computer", 200);
        }
    }

    class Audio2 extends Product2 {
        public Audio2() {
            super("Audio", 500);
        }
    }

    class Product2 {
        private String name;
        private int price;
        private int bonusPoint;

        Product2(String name, int price) {
            this.name = name;
            this.price = price;
            this.bonusPoint = (int) (price * 0.1);
        }

        public Product2() {

        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public int getBonusPoint() {
            return bonusPoint;
        }

        @Override
        public String toString() {
            return String.format("name : %s, price : %d, bonusPoint : %d", name, price, bonusPoint);
        }
    }
