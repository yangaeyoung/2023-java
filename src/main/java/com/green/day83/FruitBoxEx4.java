package com.green.day83;

import java.util.List;

public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBoxV2<Apple> appleFruitBoxEx2 = new FruitBoxV2<>();
        appleFruitBoxEx2.add(new Apple());
        appleFruitBoxEx2.add(new Apple());

        String strMix = appleFruitBoxEx2.mix(new Toy(), new Toy()); // mix 클래스와 관련이 없어서 Toy임에도 에러 안터짐
        System.out.println("strMix: " + strMix);
    }
}

class FruitBoxV2<T extends Fruit> extends GBoxList<T> {
    List<T> getList() { return list; }

    static <T> String mix (T var1, T var2) { // 위의 제네릭과는 전혀 다른 것이기 때문에 T가 아닌 A를 해도 상관없음
        return var1.toString() + var2.toString();
    }
}


