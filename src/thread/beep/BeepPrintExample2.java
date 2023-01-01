package thread.beep;


import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {


        // Runnable 구현 객체 생성해서 멀티쓰레드 실행
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start(); // 자식 쓰레드 실행


        // 익명 객체 이용
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(700);
                    } catch (Exception ignored) {}
                }
            }
        });
        thread1.start();


        // 람다식 이용
        Thread thread2 = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) { // 메인 쓰레드 실행
                toolkit.beep();
                try {
                    Thread.sleep(200);
                } catch (Exception ignored) { }
            }
        });
        thread2.start();

        for (int i = 0; i < 5; i++) { // 메인 쓰레드 실행
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }
    }
}
