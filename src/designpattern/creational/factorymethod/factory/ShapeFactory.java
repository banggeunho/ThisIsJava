package designpattern.creational.factorymethod.factory;

import designpattern.creational.factorymethod.Shape;

public abstract class ShapeFactory {

    public abstract Shape createShape();

    public void drawShape() {
        Shape shape = createShape();
        shape.draw();
    }
}
