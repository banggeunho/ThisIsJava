package designpattern.structural.adapter;

public class Main {
    public static void main(String[] args) {
        // 현재 상황
        // 기존 mp3 만 지원하던 미디어 플레이어에 호환되지 않는 인터페이스를 사용중인 다른 미디어 플레이어를 호환시켜야 한다.
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("avi", "movie.avi");
    }
}
