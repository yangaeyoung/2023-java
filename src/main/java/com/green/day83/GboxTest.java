package com.green.day83;

import java.util.ArrayList;
import java.util.List;

public class GboxTest {
    public static void main(String[] args) {
        Gbox g1 = new Gbox();
        g1.setItem(1);
        g1.setItem("우우우");


        // 형변환 필요 없게 됨
        Gbox<Integer> g2 = new Gbox<>(); // 실행할 당시 Gbox 클래스의 <T>가 모두 Integer로 바뀌게 됨
        g2.setItem(1);
        g2.setItem(2);
        int intVal = g2.getItem();

        Gbox<String> g3 = new Gbox<>();
        g3.setItem("몽총이");
        g3.setItem("멍충이");
        String strVal = g3.getItem();

        List<Integer> list =new ArrayList<>();
    }
}
