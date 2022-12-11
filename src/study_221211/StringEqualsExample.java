package study_221211;

public class StringEqualsExample {
    public static void main ( String[] args) {

        String str1 = "방근호";
        String str2 = "방근호";
        String str3 = new String("방근호");

        // == 연산자는 변수에 저장된 객체의 값을 비교 함.
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false

        // 어디에 저장되어 있건 같은 값을 비교하기 위해서는 equals 함수를 사용해여 함.
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
    }
}
