package com.green.day14.ch6;

public class CardDeck {
    Card[] cards;//전역변수: 지역 변수쪽에 적으면 호출되고 나면 죽기 때문에 위에 적어야 함

    public void printAll() {
//        for (int i = 0; i < cards.length; i++) {
//            System.out.printf("%s (%s)\n", cards[i].pattern, cards[i].denomination);
        for (Card c : cards) {
            c.printMySelf();
        }
    }

    public Card getCard() {
        Card c = null;//return c를 위해서 위에서 선언해줌
        while (true) {
            int rIdx = (int) (Math.random() * cards.length);
            c = cards[rIdx];//랜덤 5가 나왔다, 다시 5가 나왔을때는 c가 null
            if(c != null){
            cards[rIdx] = null;// 그러면 5는 이제 null
                break;
            }
        }
            return c;
    }


    public CardDeck() {
        cards = new Card[52];

        String[] patterns = {"spade", "Heart", "Diamond", "Club"};
        int idx = 0;
        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            for (int z = 1; z <= 13; z++) {
                String denomination = this.getNumberFromInt(z);
                cards[idx++] = new Card(pattern, denomination);//생성자 호출
//                cards[idx++] = c; 줄여서 윗줄로 완성
            }
        }
    }

    private String getNumberFromInt(int num) {//private 이 클래스에서만 사용 가능
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
}