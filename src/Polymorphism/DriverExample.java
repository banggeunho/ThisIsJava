package Polymorphism;

public class DriverExample {
    public static void main(String[] args){

        Driver driver = new Driver();
        Vehicle vehicle = new Vehicle();

        driver.drive(vehicle);

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // 자동 타입 변환과 메소드 오버라이딩을 이용하여 매개변수의 다양성 구현
        driver.drive(bus);
        driver.drive(taxi);
    }
}
