package designpattern.creational.prototype;

public class PrototypeA extends Prototype{
    @Override
    public Prototype clone() {
        return new PrototypeA();
    }

    @Override
    public String toString() {
        return "PrototypeA";
    }
}
