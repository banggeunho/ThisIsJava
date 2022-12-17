package Object;

public class Car2 {

    private int speed;
    private boolean stop;

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = Math.max(speed, 0);
    }

    public boolean isStop(){
        return stop;
    }

    public void setStop(boolean stop){
        this.stop = stop;
        this.speed = 0;
    }
}
