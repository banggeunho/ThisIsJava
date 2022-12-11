package 변수_조건_반복;

public class CheckOverflowExample {
    public static void main ( String[] args) {

        try{
            int result = safeAdd(2000000000, 2000000000);
            System.out.println(result);
        } catch(ArithmeticException e){
            System.out.println("오버플로우가 발생");
        }
    }

    public static int safeAdd(int left, int right){

        if(right > 0){
            if(left > (Integer.MAX_VALUE - right)) { // left + right가 Max_value를 초과 할 경우
                throw new ArithmeticException("오버플로우 발생");
            }
        } else {
            if(left < (Integer.MIN_VALUE - right)) { // left + right가 MIN-VALUE보다 낮을 경우
                throw new ArithmeticException("오버플로우 발생");
            }
        }

        return left + right;
    }

}
