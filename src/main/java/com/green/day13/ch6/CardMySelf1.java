package com.green.day13.ch6;

class Card1 {
    String pat;
    String deno;

    void printYourSelf1() {
        System.out.printf("%s (%s)\n", pat, deno);
    }
}

public class CardMySelf1 {
    public static void main(String[] args) {
        Card1[] tmp = mayCard();
        for (Card1 b : tmp)
            b.printYourSelf1();
    }


    public static String getDeno(int deno) {
        switch (deno) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return Integer.toString(deno);
    }

    static Card1[] mayCard() {
        Card1[] arr1 = new Card1[52];
        String[] pat = {"spade", "Heart", "Diamond", "Club"};
        int cnt = 0;
        for (int i = 0; i < pat.length; i++) {
            for (int z = 1; z <= arr1.length / 4; z++) {
                String deno1 = getDeno(z);
                Card1 u = new Card1();
                u.pat = pat[i];
                u.deno = deno1;
                arr1[cnt++] = u;
            }
        }
        return arr1;
    }
}

