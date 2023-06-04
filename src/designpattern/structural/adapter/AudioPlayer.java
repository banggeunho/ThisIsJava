package designpattern.structural.adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // 기본적으로 지원되는 형식인 mp3일 경우
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
        // 다른 형식일 경우 어댑터를 통해 재생
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        // 지원되지 않는 형식일 경우 에러 메시지 출력
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
