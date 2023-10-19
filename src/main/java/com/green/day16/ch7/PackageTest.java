package com.green.day16.ch7;

import com.green.day13.ch6.MyMath2;
import com.green.day15.ch7.Parent;
//import static com.green.day13.ch6.MyMath2.staticAbs; public이 되어 있지 않다면 MyMath2.staticAbs을 이렇게 써줌
//import com.green.day15.ch7.*; 패키지 안에 있는 것들 전부 다 import하는 효과가 있음

public class PackageTest {
    public static void main(String[] args) {
        Parent parent;
//        com.green.day15.ch7.Parent parent1; import를 쓰지 않을 때 이렇게 적어야 함
        MyMath2.staticAbs(10);
    }
}
