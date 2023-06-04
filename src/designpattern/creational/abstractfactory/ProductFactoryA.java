package designpattern.creational.abstractfactory;

public class ProductFactoryA implements AbstractFactory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
