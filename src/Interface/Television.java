package Interface;

public class Television implements RemoteControl, Searchable{


    /*
       RemoteControl Interface
     */
    private int volume;

    @Override
    public void turnOn(){
        System.out.println("티비를 킵니다.");
    }

    @Override
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

    @Override
    public void setMute(boolean mute) {
        if(mute) {
            System.out.println("TV 무음 처리");
        } else {
            System.out.println("TV 무음 해제");
        }
    }

    /*
       Searchable Interface
     */
    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
