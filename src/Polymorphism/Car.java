package Polymorphism;

public class Car {

    // 필드

    Tire[] tires = {
            new Tire("앞왼쪽", 6),
            new Tire("앞오르쪽", 2),
            new Tire("뒤왼쪽", 3),
            new Tire("뒤오른쪽", 4)
    };

    //생성자
    //메소드
    int run() {
        System.out.println("자동차가 달립니다.");
        int index = 1;
        for (Tire tire : tires){
            if(!tire.roll()) {
                stop();
                return index;
            }
            index++;
        }
        return 0;
    }

    void stop() {
        System.out.println("자동차가 멈춥니다.");
    }

}
