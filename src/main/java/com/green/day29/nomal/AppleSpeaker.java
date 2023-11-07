package com.green.day29.nomal;

import com.green.day29.Speaker;
import com.green.day29.nomal2.Woofer;

public class AppleSpeaker implements Speaker {
    private Woofer woofer;

    public AppleSpeaker(){
        woofer = new HansungWooFer(); // 인터페이스. 이 부분만 교체하면 됨
    }

    public void sound(){
        System.out.println("애플 스피커: 소리 소리 소리");
        woofer.soundBase();
    }
}
