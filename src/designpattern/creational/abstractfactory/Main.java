package designpattern.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {

        AbstractFactory factoryA = new ProductFactoryA();
        Product productA = factoryA.createProduct();
        productA.use();


        AbstractFactory factoryB = new ProductFactoryB();
        Product productB = factoryB.createProduct();
        productB.use();

    }
}
