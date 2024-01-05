package com.green.day68.ch14;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(i + 10);
        }
        for(Integer val : list){
            System.out.println(val);
        }
        System.out.println("-----------");

        list.forEach(new MyConsumer<Integer>());

        System.out.println("-----------");

        // 익명클래스 방법으로 작성
        list.forEach(new MyConsumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println("MyConsumer(2) : " + o);
            }
        });
        System.out.println("-----------");
        list.forEach(i -> System.out.println("MyConsumer(3) : " + i )); // List에 있는 forEach 메서드 호출


//        predicate 타입으로 하려면 test 메서드 타입을 boolean으로 해줘야 함
//        list.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer v) {
//                return v % 2 == 0;
//            }
//        });
        list.removeIf(i -> i % 2 == 0); // {} 생략하면 결과를 return 해줌 // { return i % 2 == 0 }
        System.out.println(list);
        list.replaceAll(v -> v <= 15 ? v * 2 : v); // 15 이하는 *2 처리, 나머지는 그대로
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("age", "23세");
        map.put("height", "172cm");
        map.forEach( (k, v) -> System.out.printf("%s: %s\n", k, v) ); // 파라미터 값 두 개 일 때 ( ) 생략 불가로 (k, v) 적어야 함

    }
}


class MyConsumer<T> implements Consumer<T> { // Integer가 <T>에 주입 : Generic
    @Override
    public void accept(T o) {
        System.out.println("MyConsumer(1) : " + o);
    }
}