package api.finalize;

public class FinalizeExample {

    public static void main(String[] args) {

        Counter counter = null;
        for (int i = 1 ; i < 50; i ++) {
            counter = new Counter(i);
            counter = null; // 객체가 참조하는 것을 없애버림 -> 쓰레기로 만듦.
            System.gc(); // gc 실행 요청
        }


    }
}
