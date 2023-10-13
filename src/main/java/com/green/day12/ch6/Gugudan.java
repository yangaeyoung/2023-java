package com.green.day12.ch6;

public class Gugudan {
    void print(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }

    void printFromTo(int n, int n1) {
        for (int i = n; i <= n1; i++) {
            print(i);
        }
    }

    void printFromTo(int n, int n1, String n2) {
        for (int i = n; i <= n1; i++) {
            print(i);
            System.out.println(n2);
        }
    }
}

