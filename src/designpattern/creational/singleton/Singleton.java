package designpattern.creational.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // key point
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
