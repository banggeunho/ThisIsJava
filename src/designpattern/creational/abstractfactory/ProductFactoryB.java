package designpattern.creational.abstractfactory;

public class ProductFactoryB implements AbstractFactory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
