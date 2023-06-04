package designpattern.creational.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        NonSingleton nonSingleton1 = new NonSingleton();
        NonSingleton nonSingleton2 = new NonSingleton();


        System.out.println((singleton1 == singleton2) ? "equal" : "differ");
        System.out.println((nonSingleton1 == nonSingleton2) ? "equal" : "differ");
    }
}

class NonSingleton {
}