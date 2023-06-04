package designpattern.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playting vlc file : " + fileName);
    }

    @Override
    public void playVlc(String fileName) {
        // None
    }
}
