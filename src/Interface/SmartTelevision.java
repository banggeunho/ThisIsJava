package Interface;

public class SmartTelevision implements RemoteControl{

    private int volume;

    public void turnOn(){
        System.out.println("티비를 킵니다.");
    }
    public void turnOff() {
        System.out.println("티비를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {

        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else this.volume = Math.max(volume, RemoteControl.MIN_VOLUME);
        System.out.println("현재 텔레비전 볼륨 " + this.volume);
    }

}
