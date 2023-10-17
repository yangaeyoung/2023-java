package com.green.day13.ch6;

class Card {
    String pattern; //Spade, Heart
    String denomination;// 2~10, A, J, Q, K

    void printYourSelf() {
        System.out.printf("%s - %s\n", pattern, denomination);
    }
}

public class CardTest3 {
    public static void main(String[] args) {
        Card[] cards = makeCards();
        System.out.println(cards.length);
        for (Card t : cards)
            t.printYourSelf();
    }

    static String getdenomination(int num1) {
        switch (num1) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(num1);
    }

    static Card[] makeCards() {
        Card[] cards2 = new Card[52];
        String[] patterns = {"spade", "Heart", "Diamond", "Club"};

//        for (int i = 0; i < cards2.length; i++) {
//            String pattern = patterns[i / 13];
//            String denomination = getdenomination(i % 13);
//            cards2[i] = new Card();
//            cards2[i].pattern = pattern;
//            cards2[i].denomination = denomination;


        String[] pattern = {"spade", "Heart", "Diamond", "Club"};
        int cnt = 0;
        for (int i = 0; i < pattern.length; i++) {
            for (int z = 1; z <= 13; z++) {
                Card s = new Card();
                String num1 = getdenomination(z);
                s.pattern = pattern[i];

                s.denomination = num1;
                cards2[cnt++] = s; //cards2[0~51] = s; 배열 복사할 때와 똑같음
            }
        }
        return cards2;
    }
}
