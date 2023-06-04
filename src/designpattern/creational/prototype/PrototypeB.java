package designpattern.creational.prototype;

public class PrototypeB extends Prototype{
    @Override
    public Prototype clone() {
        return new PrototypeB();
    }

    @Override
    public String toString() {
        return "PrototypeB";
    }
}
