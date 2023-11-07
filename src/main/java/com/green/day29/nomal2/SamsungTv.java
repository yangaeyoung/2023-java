package com.green.day29.nomal2;

public class SamsungTv {
    private boolean isMute;
    private HarmanSpeaker speaker;

    public SamsungTv() {
        speaker = new HarmanSpeaker();
    }

    public void sound() {
        if (isMute) { // 반대로 할 때 !isMute
            return;
        }
        speaker.speak();
    }

    public void toggleMute(){
        isMute = !isMute;
    }
}
