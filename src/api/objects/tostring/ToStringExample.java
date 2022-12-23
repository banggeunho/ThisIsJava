package api.objects.tostring;

import java.util.Objects;

public class ToStringExample {
    public static  void main(String[] args) {

        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.toString(str1));
        System.out.println(Objects.toString(str2));
        // null일 경우 출력할 메세지도 설정
        System.out.println(Objects.toString(str2, "이름이 없습니다."));
    }
}
