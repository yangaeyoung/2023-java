package com.green.day68.ch14;

@FunctionalInterface // 람다식 인터페이스는 메서드가 하나여야 함
interface MyFunction {
    void run(int n1, int n2); // (public abstract) void run();
}

public class LambdaEx1 {
    public static void main(String[] args) {

        MyFunction mf0 = (i, i2) -> System.out.println("mf0 - run !!"); // 람다식: 메서드가 하나뿐이기 때문에 public void run() 안 적어줘도 됨
        // 파라미터가 하나라면 () 생략 가능 예) i ->, 이외에는 () 생략 불가
        // print문의 문장이 하나일 경우 {} 생략 가능, return문일 경우 {} 생략 불가

        MyFunction mf1 = new MyFunction() { // 객체화한 게 X, 익명 클래스, implements  // 장점: 이름을 적지 않아서 짧아짐, 내용 변경 수월
            public void run(int i, int i2) { // implements할 내용을 아래에 기입
                System.out.println("fm1 - run !! ");
            }
        };

        MyFunction mf2 = new MyFunctionClass();
        mf0.run(1, 2);
        mf1.run(1, 2);
        mf2.run(1, 2);
    }
}

class MyFunctionClass implements MyFunction { // 단점: 내용 변경하려면 새 클래스 작성, 장점: 똑같은 내용을 객체를 여러 개 만들고 싶을 때 사용하기 좋음
    public void run(int a, int b) {
        System.out.println("class name - run !! ");
    }
}