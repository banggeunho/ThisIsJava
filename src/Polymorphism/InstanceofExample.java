package Polymorphism;

public class InstanceofExample {
    public static void method1(Parent parent){
        if(parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("metho1 - Child로 강제변환 성공");
        } else {
            System.out.println("Child로 강제변환 실패");
        }

    }

    // java.lang.ClassCastException 발생 가능성 존재
    public static void method2(Parent parent) {
        Child child = (Child) parent;
        System.out.println("method2 - Child로 강제변환 성공");
    }

    public static void main(String[] args) {
        Parent parentA = new Child();

        method1(parentA);
        method2(parentA);

        Parent parentB = new Parent();

        method1(parentB);
        method2(parentB);
    }
}
