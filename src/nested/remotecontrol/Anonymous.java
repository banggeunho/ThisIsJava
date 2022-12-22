package nested.remotecontrol;

public class Anonymous {

    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV ON");
        }

        @Override
        public void turnOff() {
            System.out.println("TV OFF");
        }
    };

    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("AUDIO ON");
            }

            @Override
            public void turnOff() {
                System.out.println("AUDIO OFF");
            }
        };

        localVar.turnOn();

    }

    void method2(RemoteControl rc) {
        rc.turnOn();
    }


}
