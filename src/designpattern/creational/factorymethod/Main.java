package designpattern.creational.factorymethod;

import designpattern.creational.factorymethod.factory.CircleFactory;
import designpattern.creational.factorymethod.factory.RectangleFactory;
import designpattern.creational.factorymethod.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {

        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.drawShape(); // 부모 클래스에 메소드 존재

        ShapeFactory rectangleFactory = new RectangleFactory();
        rectangleFactory.drawShape();
    }
}
