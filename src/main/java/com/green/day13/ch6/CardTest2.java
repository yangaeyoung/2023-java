package com.green.day13.ch6;

import com.green.day12.ch6.Card;

public class CardTest2 {
    public static void main(String[] args) {
        Card[] cards = makeCard();//52개의 카드 배열
//        int[] arr = new Card[10]; int 타입의 주소값만 담겠다는 뜻
        System.out.println(cards.length);//52

        for (Card c : cards) {
            c.printYourSelf(); //Spade(A), Heart(2)
        }
    }



    public static String getNumberFromInt(int num) {
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(num);
    }

    public static Card[] makeCard() {// Card[] cards = makeCard(); 을 보면 Card[]이 리턴타입
        Card[] tmp = new Card[52];
        //spade, Heart, Diamond, Club
        //A, 2~10, J, Q, K
        String[] kinds = {"spade", "Heart", "Diamond", "Club"};
        int cnt = 0;
        for (int i = 0; i < kinds.length; i++) {

            for (int z = 1; z <= 13; z++) {
                String number = getNumberFromInt(z);//1>"A", 2>"2"
                Card c = new Card();//
                c.kind = kinds[i];
                c.number = number;
                //tmp[(i*13)+(z-1)] = c;
                tmp[cnt++] = c;
            }
        }
            return tmp;
    }
}

