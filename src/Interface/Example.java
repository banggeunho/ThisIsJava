package Interface;

public class Example {
    public static void main(String[] args){

        ImplementationC impl = new ImplementationC();

        // a의 메소드만 실행 가능
        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        // b의 메소드만 실행 가능
        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        // a, b를 상속 받았기 때문에 a, b, c의 메소드 모두 실행 가능
        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
        System.out.println();
    }
}
