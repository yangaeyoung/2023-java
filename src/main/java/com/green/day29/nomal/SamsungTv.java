package com.green.day29.nomal;

import com.green.day29.Speaker;
import com.green.day29.nomal2.Tv;

public class SamsungTv extends Tv {
    public SamsungTv(){
        speaker = new HarmanSpeaker();
    }

}
