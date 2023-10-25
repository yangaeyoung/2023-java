package com.green.day19.ch7;

public interface PlayingCard {
    public static final int SPADE = 4;//public static fina 인터페이스는 생략해도 해당
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber();//public abstract 역시 인터페이스에서 생략 가능
    String getCardKind();
}

interface PlayingChess extends PlayingCard{
    void moveHorse(int x, int y);
}

class Chess implements PlayingChess{


    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }

    @Override
    public void moveHorse(int x, int y) {

    }
}


class Card implements PlayingCard{//abstract으로 오버라이딩 강제성 있음  구현부가 없는 부분울 구현하기 위해서

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}

class PlayingCardTest{
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}
