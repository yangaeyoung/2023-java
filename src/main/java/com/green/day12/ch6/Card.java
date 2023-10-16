package com.green.day12.ch6;

public class Card {//속성
    public String kind;
    public String number;

    public void printYourSelf (){//메소드
        System.out.printf("%s (%s)\n", kind, number);
    }

    public int getScore() {
        switch (number) {
            case "A":
                return 1;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;

        }
        return Integer.parseInt(number);
    }
}

