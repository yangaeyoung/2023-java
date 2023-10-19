package com.green.day15.ch7;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.function.DoubleFunction;

class Card {
    static final int KIND_MAX = 4; //카드 무늬의 수
    static final int NUM_MAX = 13; //무늬별 카드 수


    static final int SPADE = 4; //무늬별 카드 수
    static final int DIAMOND = 3; //무늬별 카드 수
    static final int HEART = 2; //무늬별 카드 수
    static final int CLOVER = 1; //무늬별 카드 수
    int kind;//1~4
    int number;//1~13


    public Card() {
//        kind = SPADE;
//        number = 1;
        this(SPADE, 1);
    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;

    }

    @Override
    public String toString() {//오브젝트로 toString
//        return "kind: " + kind + " number: " + number;
        return String.format("kind: %d, number: %d", kind, number);
    }

}

class Deck {
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int r = (int) (Math.random() * CARD_NUM);
            Card tmp = cardArr[i];//Card tmp = pick(i); 같음
            cardArr[i] = cardArr[r];
            cardArr[r] = tmp;
        }
//        for (Card a : cardArr) {
//            System.out.printf("kind: %d, number: %d\n", a.kind, a.number);
//            System.out.println(a);
//        }
    }


    Deck() {
        int cnt = 0;
        for (int i = 1; i <= Card.KIND_MAX; i++) {
            for (int z = 1; z <= Card.NUM_MAX; z++) {
                cardArr[cnt++] = new Card(i, z);
//                Card co = new Card();//카드
//                co.kind = i;
//                co.number = z;
//                cardArr[cnt++] = co;//카드상자에 카드를 넣는 작업
//                System.out.printf("kind: %d, number: %d\n", co.kind, co.number);
            }
        }

        for (Card a : cardArr) {
//            System.out.printf("kind: %d, number: %d\n", a.kind, a.number);
            System.out.println(a);
        }
    }

    Card pick(int n) {
        return cardArr[n];//카드 인덱스 안에 있는 n번째 카드 하나 뽑기
    }

    Card pick() {
        return cardArr[(int) (Math.random() * CARD_NUM)];
    }//0<(Math.random() * CARD_NUM )<52 배열
}


public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();


//        System.out.println(Card.KIND_MAX);//클레스 멤버필드

//        Deck deck = new Deck();
//        Card c1 = deck.pick(0);
//        System.out.println("pick: " + c1);
//        Card c2 = deck.pick();
//        System.out.println("random: " + c2);

//        Card c = new Card(4, 2);
//        Card c2 = new Card(1, 10);

//        System.out.printf("c.kind: %d, number: %d\n", c.kind, c.number);// 4와 1 출력
//
//        Card c2 = new Card(Card.HEART, 3);
//        System.out.printf("c.kind: %d, number: %d\n", c2.kind, c2.number);// 2와 3 출력
//
//        System.out.println(c2.toString());//아래와 출력이 같은 이유: println 찍었을 때 String 타입
//        System.out.println(c2);// 얘는 object
//
//        String str = new String("DDD");
//        System.out.println(str);
//
//        System.out.println(str.toString());
    }
}

