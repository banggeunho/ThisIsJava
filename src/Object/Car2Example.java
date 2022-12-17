package Object;

public class Car2Example {

    public static void main (String[] args){

        Car2 myCar = new Car2();

        myCar.setSpeed(-50);
        System.out.println(myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println(myCar.getSpeed());

        if(!myCar.isStop()){
            myCar.setStop(true);
        }

        System.out.println(myCar.isStop());
        System.out.println(myCar.getSpeed());

    }
}
