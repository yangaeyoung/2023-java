package com.green.day13.ch6;

public class MyMath2 {
    public static void main(String[] args) {
        MyMath2 myMath2 = new MyMath2();
        myMath2.instanceAbs();
        staticAbs(1);
    }

    int num;// 인스턴스 : 객체화를 해야 int num이 있을 거야~
    static int staticNum;//여기에 접근할 때 MyMath2에 접근 //static하나로 공간 하나 생성인 것
    //static  객체를 새로 생성하지 않아도 사용 가능

    void instanceAbs(){//인스턴스 변수
        System.out.println(num < 0 ? -num : num);
    }

    public  static void staticAbs(int n){
        System.out.println(n < 0 ? -n : n);
    }


    static void print(){
        // print2();는 안 됨 왜냐면 얘는 종이와도 같기 때문
        System.out.printf("staticNum : %d\n", MyMath2.staticNum);//static 때문에 num 못 씀
    }

    void print2(){
        print(); // 이미 static으로 위의 내용이 올라가 있기 때문에
        System.out.printf("staticNum : %d, num : %d\n", staticNum, num);//같은 공간에 있으면 MyMath2.을 생략 가능
    }
}
