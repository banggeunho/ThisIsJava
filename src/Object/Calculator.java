package Object;

public class Calculator {

    void powerOn() {
        System.out.println("줜원 켜기");
    }

    int plus(int x, int y){
        return x + y;
    }

    double divide(int x, int y){
        return (double) x / y;
    }

    void powerOff(){
        System.out.println("전원 끄기");
    }
}
