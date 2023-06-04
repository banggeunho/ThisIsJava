package designpattern.creational.factorymethod.factory;

import designpattern.creational.factorymethod.Rectangle;
import designpattern.creational.factorymethod.Shape;

public class RectangleFactory extends ShapeFactory{

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
