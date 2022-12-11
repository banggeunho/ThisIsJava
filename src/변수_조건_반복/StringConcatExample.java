package 변수_조건_반복;

public class StringConcatExample {
    public static void main ( String[] args) {

        String str1 = "JDK" + 6.0;
        String str2 = str1 +  " 특징";
        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0;
        String str4 = 3 + 3.0 + "JDK";
        System.out.println(str3);
        System.out.println(str4);

        // 순서에 따라 결과가 달라짐
        /*
        JDK6.0 특징
        JDK33.0
        6.0JDK
         */
    }
}
