package designpattern.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing mp4 file : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //None
    }
}
