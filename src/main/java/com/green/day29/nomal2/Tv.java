package com.green.day29.nomal2;

import com.green.day29.Speaker;

public abstract class Tv {
    protected boolean isMute;
    protected Speaker speaker;


    public void sound() {
        if (isMute) {
            return;
        }
        speaker.sound();
    }

    public void toggleMute(){
        isMute = !isMute;
    }
}
