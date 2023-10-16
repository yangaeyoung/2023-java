package com.green.day13.ch6;

import com.green.day12.ch6.Card;

class Card0 {
    String pattern1;
    String denomination1;
}

public class CardMySelf {
    public static void main(String[] args) {
        Card0[] tmp = maCard();//52개의 카드 배열

        for(Card0 a : tmp){
            System.out.println(a);
        }

    }



    static Card0[] maCard() {
        Card0[] arr = new Card0[52];
        int cnt = 0;
        String[] patt = {"spade", "Heart", "Diamond", "Club"};

        for (int i = 0; i < patt.length; i++) {
            for (int z = 1; z <= arr.length / 4; z++) {
                Card0 r = new Card0();

                if (z == 1) {
                    r.denomination1 = "A";
                } else if (z == 11) {
                    r.denomination1 = "J";
                } else if (z == 12) {
                    r.denomination1 = "Q";
                } else if (z == 13) {
                    r.denomination1 = "K";
                } else {
                    r.denomination1 = Integer.toString(z);
                }
                r.pattern1 = patt[i];
                arr[cnt++] = r;
            }
        }
        return arr;
    }
}
