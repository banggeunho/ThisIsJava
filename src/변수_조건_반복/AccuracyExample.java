package 변수_조건_반복;

public class AccuracyExample {
    public static void main ( String[] args) {

        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;

        System.out.println(result);
        // 이진 포맷의 가수를 사용하는 부동소수점 타입은 0.1을 정확히 표현할 수 없어 근사치로 처리하기 때문입니다.
    }
}
