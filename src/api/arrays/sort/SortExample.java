package api.arrays.sort;


import java.util.Arrays;

public class SortExample {
    public static void  main (String[] args) {
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }

        System.out.println();

        String[] names = {"이정명", "신동재", "김연수"};

        Arrays.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        Member m1 = new Member("김연수");
        Member m2 = new Member("신동재");
        Member m3 = new Member("방근호");
        Member[] members = {m1, m2, m3};

        Arrays.sort(members);
        for (Member member : members) {
            System.out.println(member.name);
        }


    }
}
