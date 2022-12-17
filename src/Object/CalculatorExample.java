package Object;

public class CalculatorExample {
    public static void main(String[] args){

        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result = myCalc.plus(3, 5);
        System.out.println(result);

        double result2 = myCalc.divide(10, 4);
        System.out.println(result2);

        myCalc.powerOff();
    }
}
