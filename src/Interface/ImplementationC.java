package Interface;

public class ImplementationC implements InterfaceC{

    @Override
    public void methodA() {
        System.out.println("a - methodA");
    }

    @Override
    public void methodB() {
        System.out.println("b - methodB");
    }

    @Override
    public void methodC() {
        System.out.println("c - methodC");
    }
}
