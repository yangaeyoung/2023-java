package com.green.day14.ch6;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
//        cd.printAll();
        /*
        Spade (A)
        Spade (2)
        Spade (3)
        ...
        Club (K)
         */

//        Card c1 = cd.getCard();

        for(int i=0; i<52; i++){
            System.out.println(i);
            Card c = cd.getCard();
            c.printMySelf();
        }
        //cd.printAll();
    }

}
