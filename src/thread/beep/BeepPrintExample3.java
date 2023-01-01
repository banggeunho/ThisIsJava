package thread.beep;

import java.awt.*;

public class BeepPrintExample3 {
    public static void main(String[] args) {
//        Thread thread = new BeepThread();
//        thread.start();

        // 익명 객체
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) { // 메인 쓰레드 실행
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception ignored) {
                    }
                }
            }
        };
        thread1.start();

        for (int i=0; i<5; i ++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }

    }
}
