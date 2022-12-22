package nested.remotecontrol;

public class AnonymousExample {
    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous();

        anonymous.field.turnOn();
        anonymous.method1();
        anonymous.method2(
                new RemoteControl() {
                    @Override
                    public void turnOn() {
                        System.out.println("smart TV ON");
                    }

                    @Override
                    public void turnOff() {
                        System.out.println("SMART TV OFF");
                    }
                }
        );
    }
}
