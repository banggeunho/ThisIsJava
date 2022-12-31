package api.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        // 선택번호
        int[] selectNumber = new int[6];
        Random random = new Random(30101);
        System.out.println("선택 번호: ");

        for (int i = 0; i < selectNumber.length; i ++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.println(selectNumber[i]);
        }
    }
}
