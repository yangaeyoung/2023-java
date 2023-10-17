package com.green.day14.ch6;

public class Data1 {
    int value;
    int value2;
    int value3;


    public Data1() {//data1 기본 생성자(파라미터가 없는 것) 생성자가 하나도 없을 때 기본 생성자 자동으로 설정 이 줄 없어도 됨
//        value = 100;
//        value2 = 200;
//        value3 = 300;
        this(100, 200 ,300);// public Data1(int a, int b, int c)을 호출한 것
    }


    public Data1(int a, int b, int c) {//data1_2
        value = a;
        value2 = b;
        value3 = c;
    }

    public void printMySelf(){
        System.out.printf("value: %d, value2: %d, value3: %d\n", value, value2, value3);
    }

    public Data1(int a){
        value = a;
    }

}


class ConstructorTest {

    public static void main(String[] args) {
        Data1 data1 = new Data1();//객체 생성, 생성자 호출
        data1.printMySelf();//출력값을 수정하고 싶으면 기본 생성자를 찾아가서 입력하기

        Data1 data1_2 = new Data1(10, 20, 30);// 위와 같이 쓰고 싶으면 각각의 기본 생성자를 작성해줘야 함
        data1_2.printMySelf();
    }
}

