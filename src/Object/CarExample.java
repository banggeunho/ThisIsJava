package Object;

public class CarExample {

    public static void main (String[] args){

        Car myCar = new Car();
        System.out.println(myCar.company);

        Car car2 = new Car("자가용");
        System.out.println(car2.model);

        Car car3 = new Car("자가용", "빨강");
        System.out.println(car3.model + " "+ car3.color);

        Car car4 = new Car("택시", "검정", 200);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);

    }

}
