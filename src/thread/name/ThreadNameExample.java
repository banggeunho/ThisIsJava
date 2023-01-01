package thread.name;

public class ThreadNameExample {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("시작 쓰레드 이름 : " + mainThread);

        ThreadA threadA = new ThreadA();
        System.out.println("작업A 쓰레드 이름 : " + threadA.getName());
        threadA.start();

        System.out.println("현재 쓰레드 이름 : " + Thread.currentThread().getName());

        ThreadB threadB = new ThreadB();
        System.out.println("작업B 쓰레드 이름 : " + threadB.getName());
        threadB.start();

        System.out.println("현재 쓰레드 이름 : " + Thread.currentThread().getName());
    }
}
