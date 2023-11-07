package com.green.day29.ioc;

import com.green.day29.Speaker;
import com.green.day29.Woofer;

public class AppleSpeaker implements Speaker {
    private Woofer woofer;

    public AppleSpeaker(Woofer woofer) {// 외부에서 우퍼로 들어오는 값을 전역변수로 바로 값 대입
        this.woofer = woofer;//외부에서 들어오는 주소값 담기
    }

    public void sound() {
        System.out.println("애플 스피커 : 소리 소리 소리");
        woofer.soundBase();
    }
}