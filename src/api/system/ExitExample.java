package api.system;

public class ExitExample {
    public static void main(String[] args) {

        // statusㄱㅏ 5일 경우에만 정상 종료, 그 외에는 종료 방지를 위한 예외 발생
        System.setSecurityManager(new SecurityManager() {
           @Override
           public void checkExit(int status) {
               if (status != 5) {
                   throw new SecurityException("종료 안되지롱~");
               }
           }
        });

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            try{
                System.exit(i);
            } catch (SecurityException e) {
                System.out.println(e.getMessage());}
        }


    }
}
