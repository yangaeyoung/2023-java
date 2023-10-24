package com.green.day19.ch7.starcraft2;

public interface Fighterble extends Movable, Attackable{ }//extends 확장하다 interface 구현하다

interface Movable{
    void move(int x, int y);
}

interface Attackable{
    void attack(Unit u);
}

class Unit{
    private int currentHp;
    private int x;
    private int y;
}

class Fighter extends Unit implements Fighterble{

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}

class FighterTest{
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10, 20);

        Fighter fighter = (Fighter) movable;//자식타입은 부모 객체 타입을 담을 수 없음
        fighter.attack(null);
    }
}