package com.green.day16.ch7;

public class Time {
    public final int MIN_HOUR = 0;
    public final int MAX_HOUR = 23;
    private int hour, minute, second;


    //1.생성자
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //2.메소드 setter
    public void setHour(final int hour) {
        if (hour < MIN_HOUR) {
            this.hour = MIN_HOUR;
            return;
        }//return을 줘서 종료되게
        if (hour > MAX_HOUR) {
            this.hour = MAX_HOUR;
            return;
        }
        this.hour = hour;
//        this.hour = hour > 23 ? 23 : ( hour < 0 ? 0 : hour);
//        if(hour > 23){
//            this.hour = 23;
//        }else if(hour < 0) {
//            this.hour = 0;
//        }
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {//어떤 타입이든 문자열로 출력하기 위해서 String toString
//        String strHour = String.valueOf(hour < 10 ? "0" + hour : hour);
//        return strHour;
        return String.format("%02d시 %02d분 %02d초", hour, minute, second);
    }

    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
}


class TimeTest{
    public static void main(String[] args) {
        Time time = new Time(11, 20, 30);
//        time.setHour(10);
//        time.setMinute(30);//setter메소드를 이용하여 값 변경\

        time.setHour(-2);//0~23, 만약 23초과값이 들어오면 23이, 0미만 값이 0이 들어가도록
        System.out.println();

        System.out.println(time);
//        time.hour = 10; private 클래스 내에서 벗어나서 빨간줄 생성됨
    }
}
