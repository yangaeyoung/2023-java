package com.green.day11.ch6;

import java.util.Scanner;

public class MethodExam2 {
    String scoreResultOpt(int n) {
        if (n < 0 || n > 100) {
            return "점수를 확인해주세요.";
        }

        String grade = "D";
        if (n == 100) {
            return "A++학점";
        } else if (n >= 90) {
            grade = "A";
        } else if (n >= 80) {
            grade = "B";
        } else if (n >= 70) {
            grade = "C";
        } else {
            return grade;
        }
        int s = n % 10;
        String msg = "0";
        if (s >= 8) {
            msg = "+";
        } else if (s <= 3) {
            msg = "-";
        }
//        String result = String.format("%s%s학점", grade, msg);
        return String.format("%s%s학점", grade, msg);
//        return grade + msg + "학점";
    }

    String getSeason(int n) {
        switch (n) {
            case 3, 4, 5:
                return "봄";
            case 6, 7, 8:
                return "여름";
            case 9, 10, 11:
                return "가을";
            case 12, 1, 2:
                return "겨울";
        }
        return "없음";
    }
    String getSeason2(int n) {

        if(n < 1 || n >12){
            return "없음";
        }
        switch (n){
            case 12, 1, 2:
                return "겨울";
        }
        if(n >= 9){
            return "가을";
        } else if(n >=6){
            return "여름";
        }
        return "봄";
    }

}
