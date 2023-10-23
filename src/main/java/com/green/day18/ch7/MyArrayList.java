package com.green.day18.ch7;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Objects;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    void add(int val) {
        int[] tmp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = val;
        arr = tmp;
    }

    void add(int n, int n1) {
        int[] tmp = new int[arr.length + 1];
        tmp[n] = n1;
//        for(int i=0; i<arr.length; i++){
//            tmp[ i < n ? i : i + 1 ] = arr[i];
        for (int i = 0; i < n; i++) {
            tmp[i] = arr[i];
        }
        for (int i = n; i < arr.length; i++) {
            tmp[i+1] = arr[i];
        }
        arr = tmp;
    }

    @Override
    public String toString() {
        if (arr.length == 0) {
            return "[]";
        }
        String r = String.format("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            r += String.format(", %d", arr[i]);
        }
        r += "]";
        return r;
    }
}

class MyArrayListTEST {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);//0: 10
        list.add(20);//1: 20
        list.add(30);//2: 30
        System.out.println(list);//[]
        list.add(1, 40);
        System.out.println(list);//[10, 40, 20, 30]

    }
}
