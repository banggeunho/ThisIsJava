package Object;

public class Computer {

    int sum1(int[] values){
        int sum = 0;
        for(int val : values){
            sum += val;
        }
        return sum;
    }

    int sum2(int ... values){
        int sum = 0;
        for (int val: values){
            sum += val;
        }
        return sum;
    }
}
