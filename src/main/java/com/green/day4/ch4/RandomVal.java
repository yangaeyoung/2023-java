package com.green.day4.ch4;

public class RandomVal {
    public static void main(String[] args) {
        double doubleVal = Math.random(); //0.000~0.9999 절대 1이 나오지 않음
        System.out.println("val : " + doubleVal);

        int intVal = (int)(doubleVal * 10); //int로 실수 날림 0.8955213
        System.out.println("intVal : " + intVal); //int * 10 해서 실수 날리고 8이 나옴

        int rVal = (int)(Math.random() * 20); //0~19
        System.out.println("rVal : " + rVal);

    }
}
