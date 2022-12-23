package api.clone;

import api.object.Key;

import java.util.HashMap;

public class MemberExample {
    public static void main(String[] args) {

        Member original = new Member("홍길동", 25, new int[]{90, 90}, new Car("소나타"));

        // 복제 객체를 얻은 후 값 변경
        Member cloned  = original.getMember();
        cloned.scores[0] = 100;
        cloned.car.model = "그랜져";

        System.out.println("복제 객체");
        System.out.println(cloned.name);
        System.out.println(cloned.age);
        for (int i : cloned.scores) System.out.print(i + ", ");
        System.out.println(cloned.car.model);


        System.out.println("오리지널 객체");
        System.out.println(original.name);
        System.out.println(original.age);
        for (int i : original.scores) System.out.print(i + ", ");
        System.out.println(original.car.model);

    }
}
