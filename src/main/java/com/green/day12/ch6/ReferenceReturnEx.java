package com.green.day12.ch6;

class Data2 {
    int x;
    double d;
}

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data2 d = new Data2(); //
        d.x = 10;
        d.d = 100.5;

        Data2 d2 = copyObj(d);
        System.out.println("d == d2 : " + (d == d2));//false 주소값이 달라서
        System.out.println("d.x == d2.x : " + (d.x == d2.x));//true 값이 같아서
        System.out.println("d.d == d2.d : " + (d.d == d2.d));//true
    }

    public static Data2 copyObj(Data2 n) {
        Data2 tmp = new Data2(); //n과 tmp 이름은 달라야 함
        tmp.x = n.x;//값만 담는 것
        tmp.d = n.d;
        return tmp;
    }
}