package nested;

public class A {

    A() {
        System.out.println("A객체가 생성 됨.");
    }

    class B {
      B () {
          System.out.println("B 객체가 생성됨");
      }
      int field1;
      void method1() {};
    }

    void method() {
        class D {
            D() {
                System.out.println("D 객체가 생성됨");
            }
            int field1;
            void method1(){
                System.out.println(this.field1);
            }
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }

    static class C {
        C() {
            System.out.println("c객체가 생서됨");
        }

        int field1;
        static int field2;
        void method1() {
            System.out.println(this.field1);
        }
        static void method2() {
            System.out.println(C.field2);
        }
    }

}
