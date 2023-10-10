package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};//length는 3

//        String s1 = "ddd";
//        names[2] = "dfd";

        for(int i=0; i<names.length; i++){
            System.out.printf("names[%d]: %s\n", i, names[i]);
        }
        names[1] = "Woo";
        System.out.println(Arrays.toString(names));

        int z=0;
        for(String str : names){ //foreach문 향상된 for문 =index를 사용 못함
            //names의 0번째의 방을 str에 넣어줌
            //for(int i=0; i<name.length; i++)
            //String str = names[i];
            //System.out.println(str);
            System.out.printf("names[%d]: %s\n", z++, str); //인덱스를 넣고 싶다면 z++
        }
    }
}
