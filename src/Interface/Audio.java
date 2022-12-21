package Interface;

public class Audio implements RemoteControl{

    private int volume;

    public void turnOn(){
        System.out.println("오디오를 킵니다.");
    }
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {

        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else this.volume = Math.max(volume, RemoteControl.MIN_VOLUME);
        System.out.println("현재 오디오 볼륨 : " + this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        if(mute) {
            System.out.println("AUDIO 무음 처리");
        } else {
            System.out.println("AUDIO 무음 해제");
        }
    }
}
