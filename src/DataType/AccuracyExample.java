package DataType;


/*
데이터 타입 = 기본(primitive type) + 참조 (reference type)

기본 타입에는 정수타입(byte, char, short, int, long)
            실수타입(float, double)
            논리타입(boolean)

참조 타입 배열타입, 열거타입, 클래스, 인터페이스

위 둘의 차이점은 저장되는 값이 무엇이냐이다.
기본 타입으로 선언된 변수는 실제 값을 변수 안에 저장하지만,
참조 타입으로 선언된 변수는 메모리의 번지를 값으로 찾는다.

변수는 스택 영역에 생성되고, 객체는 힙 영역에 생선된다.

 */

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
