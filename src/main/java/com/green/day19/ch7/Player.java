package com.green.day19.ch7;

public abstract class Player {
    public abstract void play(int pos);//구현부가 없어서 객체화 안 됨

}
class PlayerTest{
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap;
        player.play(30);
        player = vp;
        player.play(40);
    }
}

class AudioPlayer extends Player {

    @Override
    public void play(int pos) {
        System.out.println("Audio Play 위치 : " + pos);
    }
}

class VideoPlayer extends Player {

    @Override
    public void play(int pos) {
        System.out.println("Video Play 위치 : " + pos);
    }
}

abstract class DvdPlayer extends Player{//앞에 abstract을 붙이면 오버라이딩을 하지 않아도 됨

}

