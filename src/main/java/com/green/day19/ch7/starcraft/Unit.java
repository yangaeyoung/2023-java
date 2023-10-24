package com.green.day19.ch7.starcraft;

import com.green.day18.ch7.ArrayListTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.move;

class StarcraftGame {
    public static void main(String[] args) {
        Unit unit = new Marine();
        unit.move(10, 20);

        Unit unit2 = new Tank();
        unit2.move(10, 20);

        List<Unit> units = new ArrayList<>();
        units.add(unit);
        units.add(unit2);
        units.add(new Marine());
    }
}

class StarcraftGame2 {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());

        moveAll(units, 30, 50);

//        Unit unit1 = units.get(4);
        Unit unit1 = units.get(units.size()-1);//Tank주소값이 unit1에 담겨있음
        Tank tank = (Tank)unit1;//다형성 changemode를 알고 있는 tank로 형변환을 해줘야 함
        //unit1.changeMode(); 로 하게 되면 다른 캐릭터들도 시즈모드에 닿을 수 있음
        tank.changeMode();
        tank.changeMode();
    }

    static void moveAll(List<Unit> units, int x, int y) {
//        for (int i = 0; i < units.size(); i++) {
//            units.get(i).move(x, y);
//        }
        for(Unit unit : units){
            unit.move(x,y);
        }
    }
}

public abstract class Unit {
    protected int x;
    protected int y;

    public abstract void move(int x, int y);//static을 붙일 수 없음  == 추상 메소드

    public void stop() {
        System.out.println("현재 위치에 정지");
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }
}

class Marine extends Unit {

    @Override
    public void move(int x, int y) {
        setX(x);
        setY(y);
        System.out.printf("마린이 좌표 %d, %d로 이동\n", x, y);
    }

    public void steamPack() {//마린만 갖고 있는 메소드
        System.out.println("스팀팩 시전!!!");
    }
}

class Tank extends Unit {
    private boolean siegeMode;

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("탱크가 좌표 %d, %d로 이동\n", x, y);
    }
    //siegeMode = false는 시즈모드가 아님
    //이 상태에서 changeMode 메소드가 호출이 되면 > 시즈모드
    //siegeMode = true; 들어가야 되고 콘솔에는 "시즈모드가 되었습니다."

    //siegeMode = true; 는 시즈모드
    //이 상태에서 changeMode 메소드가 호출이 되면 > 시즈모드가 풀려야 함
    //siegeMode = false 가 들어가야 되고 콘솔에는 "시즈모드가 풀렸습니다."
    public void changeMode() {
//        if(siegeMode){
//            siegeMode = false;
//            System.out.println("siegeMode가 풀렸습니다.");
//        } else {
//            siegeMode = true;
//            System.out.println("siegeMode가 되었습니다.");
//        }
        siegeMode = !siegeMode;
        System.out.println(siegeMode ? "시즈 모드가 되었습니다." : "시즈 모드가 풀렸습니다.");
    }
}