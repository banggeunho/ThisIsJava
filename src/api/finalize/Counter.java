package api.finalize;

public class Counter {
    private int no;

    public Counter(int no) {
        this.no = no;
    }

    // gc가 해당 객체를 소멸하기 직전에 마지막으로 finalize를 실행 시킴.
    @Override
    protected void finalize() throws Throwable {
        System.out.println(no + "번 객체의 finalize()가 실행됨.");
    }
}
