package Interface;

public class RemoteControlExample {
    public static  void main (String[] args) {

        RemoteControl.changeBattery();
        RemoteControl rc = null;
        rc = new Television();
        System.out.println(rc);
        rc.turnOn();
        rc.turnOff();
        rc.setMute(true);

        rc = new Audio();
        System.out.println(rc);
        rc.turnOn();
        rc.turnOff();
        rc.setMute(true);

    }
}
