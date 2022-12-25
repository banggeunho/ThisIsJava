package api.system;

public class SystemTimeExample {
    public static void main (String[] args) {
        long time1 = System.currentTimeMillis();

        long sum = 0;
        for(long i=0; i<= 100000000; i++) {
            sum += 1;
        }

        long time2 = System.currentTimeMillis();

        System.out.println("1~1000000까지의 합: "+ sum);
        System.out.println("계산에 " + (double) (time2-time1)/1000+ "초가 소요 되었음.");
    }
}
