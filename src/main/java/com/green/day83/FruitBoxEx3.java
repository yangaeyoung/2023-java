package com.green.day83;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitFruitBox = new FruitBox<>();
        fruitFruitBox.add(new Apple());
        fruitFruitBox.add(new Apple());
        fruitFruitBox.add(new Grape());

        Juice j1 = Juicer.makeJuice(fruitFruitBox);
        System.out.println(j1);

        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        appleFruitBox.add(new Apple());
        appleFruitBox.add(new Apple());

        Juice j3 = Juicer.makeJuice(appleFruitBox);
        System.out.println("j3: " + j3);

//        FruitBox<Toy> toyFruitBox = new FruitBox<>(); // FruitBoxEx2 에서 Fruit 상속 지우면 toy 객체 생성 가능하지만 Juicer에서 Fruit을 상속하고 있기 때문에 걸림
//        toyFruitBox.add(new Toy());
//        toyFruitBox.add(new Toy());
    }
}

class Juice {
    private String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return this.name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) { // static이 붙었기 때문에 class Juicer<T>에 있는 제네릭이랑 전혀 상관이 없게 됨
        String temp = "";
        for(Fruit f : box.getList()) {
            temp += f + " ";
        }
        return new Juice(temp);
    }
}