package com.green.day14.ch6;

public class Card {//계속 살아 있음
    String pattern;
    String denomination;

    void printMySelf() {
        System.out.printf("%s (%s)\n", pattern, denomination);
    }

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }
}
