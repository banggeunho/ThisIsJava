package Object;

public class ComputerExample {

    public static void main (String[] args) {

        Computer c = new Computer();

        int[] values1 = {1, 2, 3, 4};
        int result = c.sum1(values1);
        System.out.println(result);

        int result2 = c.sum1(new int[] {1, 2, 3, 4});
        System.out.println(result2);

        int result3 = c.sum2(1, 2, 3, 4);
        System.out.println(result3);

        int result4 = c. sum2(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(result4);
    }
}
