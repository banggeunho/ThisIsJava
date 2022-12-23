package api.clone;

import java.util.Arrays;

public class Member implements Cloneable{

    public String name;
    public int age;
    public int[] scores;
    public Car car;

    public Member(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    // clone 재정의
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 먼저 얕은 복사를 통해 name, age 복제 (기본타입)
        Member cloned = (Member) super.clone();

        // scores 복제
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);

        // car 복제
        cloned.car = new Car(this.car.model);

        return  cloned;
    }

    public Member getMember() {
        Member cloned = null;

        try {
            cloned =  (Member) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }

}
