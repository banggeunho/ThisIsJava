package designpattern.creational.factorymethod.factory;

import designpattern.creational.factorymethod.Circle;
import designpattern.creational.factorymethod.Shape;

public class CircleFactory extends ShapeFactory{

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
