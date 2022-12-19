package Inheritance;


class A {}
class B extends A {}
class C extends A {}
class D extends  B {}
class E extends C {}

public class PromotionExample {
    public static void main (String[] args ){
        // Promotion (자동타입변환)
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = c;
        A a4 = d;

        B b1 = d;
        C c1 = e;
        // 컴파일 에러 (상송관계에 있지 않음)
//        B b3 = e;
//        C c2 = d;



    }
}
