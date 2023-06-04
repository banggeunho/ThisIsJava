package designpattern.creational.prototype;

public class Main {
    public static void main(String[] args) {

        Prototype prototypeA = new PrototypeA();
        Prototype cloneA = prototypeA.clone();
        System.out.println(cloneA.toString());

        Prototype prototypeB = new PrototypeB();
        Prototype cloneB = prototypeB.clone();
        System.out.println(cloneB.toString());

    }
}
