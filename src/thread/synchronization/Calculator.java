package thread.synchronization;

public class Calculator {

    private int memory;

    public int getMemory() {
        return memory;
    }

//    public synchronized void setMemory(int memory) {
//        this.memory = memory;
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {}
//        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//    }

    // synchronized 블록을 이용하여 cs 영역 만들기 * this 는 자기 자신을 뜻함.
    public  void setMemory(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }

}
