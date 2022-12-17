package Object;

public class Caculator3Example {
    public static void main (String[] args){

        Calculator3 c = new Calculator3();

        double result1 = c.areaRectangle(10);
        System.out.println(result1);

        double result2 = c.areaRectangle(20, 30);
        System.out.println(result2);
    }
}
