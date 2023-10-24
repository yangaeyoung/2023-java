package com.green.day18.ch7;

import com.green.day12.ch6.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();//이름이 달라서 상속이란 것을 알 수 있음
        list.add(10);
        list.add(10.3f);
        list.add(10.3d);
        list.add(103l);
        list.add("ddd");
        list.add(new Card());

        Object val1 = list.get(0);
        int intVal = (int)val1;

        float floatVal2 = (float)list.get(1);

        Object obj = 10;
        obj = 10.3f;
        obj = 10.3d;
        obj = 103l;
        obj = "ddd";
        obj = new Card();
    }
}

class ArrayListTest2{
    public static void main(String[] args) {
        int v1 = 10;
        Integer v2 = 10;// 래퍼 타입
        List<Integer> list = new ArrayList();//arrylist를 객체화 해서 정수형 객체값만 담겠단 뜻
        list.add(10);//값 넣을 때 add   boolean 타입
        list.add(20);//값 넣을 때 add   boolean 타입
        list.add(30);//값 넣을 때 add   boolean 타입
        list.add(45);//값 넣을 때 add   boolean 타입
//        list.add(10.3f); 위에서 타입을 int로 정했기 때문에 다른 타입을 넣을 수 없음
//        list.add(10.3d);
//        list.add(103l);
        int val1 = list.get(0);//정수로 넣었으니 정수로 빼내기
        System.out.println(list.get(0));//add 값을 1번 넣었기 때문에 0번 방만 있기 때문에 1번 방을 출력하려면 오류
        System.out.println("size : " + list.size());

        //[0]: 10
        //[1]: 20
        //[2]: 30
        //[3]: 45

        for (int i=0; i< list.size(); i++){
            System.out.printf("[%d]: %d\n", i, list.get(i));
        }
        for(int val : list){
            System.out.println(val);
        }
    }
}

class ArrayListTest3{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);//toString 오버라이딩으로 출력값이 배열처럼 나옴
        list.add(1, 100);//1번방에 100을 넣어줌
        System.out.println(list);
        list.add(3, 200);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}

