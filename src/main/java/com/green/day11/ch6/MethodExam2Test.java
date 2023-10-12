package com.green.day11.ch6;

import com.green.day10.ch6.MethodExam;

public class MethodExam2Test {
    public static void main(String[] args) {
        MethodExam2 me2 = new MethodExam2();
        String r1 = me2.scoreResultOpt(79);
        System.out.println("r1 : " + r1);

        /*
        100초과 0미만은 "점수를 확인해주세요"return
        A학점 8점이상 +, 3점 이하 -, 나머지 0
        B학점 8점이상 +, 3점 이하 -, 나머지 0
        C학점 8점이상 +, 3점 이하 -, 나머지 0
        D학점 +-0없음
         */

        String season = me2.getSeason(0);
        System.out.println("계절 : " + season);
    }
}
