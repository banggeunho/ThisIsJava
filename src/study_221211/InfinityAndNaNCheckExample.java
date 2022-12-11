package study_221211;

public class InfinityAndNaNCheckExample {
    public static void main ( String[] args) {

        int x =  5;
        double y = 0.0;

//        double z = x / y;
        double z = x % y;

        System.out.println(Double.isInfinite(z)); //0.0(실수형)으로 나누면 infinite가 된다.
        System.out.println(Double.isNaN(z)); // 0.0(실수형)으로 mod하면 Nan이 된다.

        System.out.println(z + 2); // inf + 2 = inf, NaN + 2 = NaN
    }
}
