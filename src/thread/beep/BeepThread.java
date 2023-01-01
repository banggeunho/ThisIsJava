package thread.beep;

import java.awt.*;

public class BeepThread extends Thread{

    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) { // 메인 쓰레드 실행
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception ignored) { }
        }
    }
}
