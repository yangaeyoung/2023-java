package com.green.day11.ch6;

public class StarPrint {

    void line(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void square(int n) {//위와 겹치는 내용 있음
        for (int i = 0; i < n; i++) {
            for (int z = 0; z < n; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            line(i);
        }
    }

    String chkGenderById(String n) {
        char i = n.charAt(7);
        switch (i) {
            case '2', '4':
                return "여성";
            case '1', '3':
                return "남성";
        }
        return "유효하지 않는 주민번호";
    }

    int sumFromTo(int n, int n1) {
        int sum = 0;
        for (int i = n; i <= n1; i++) {
            sum += i;
        }
        return sum;
    }
}
