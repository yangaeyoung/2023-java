package com.green.day29.nomal2;

import com.green.day29.nomal.SamsungTv;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new SamsungTv(); // Tv명 바꿔서 출력 확인하기
        tv.toggleMute();
        tv.toggleMute();
        tv.sound();
    }
}
