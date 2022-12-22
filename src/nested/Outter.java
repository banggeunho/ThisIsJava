package nested;

public class Outter {
    // Java 7 까지
    public void method1(final int arg) {
        final int localVariable = 1;

        class Inner {
            public void method() {
                int result = arg + localVariable;
            }

        }

    }
    // Java 8 이후 Final 명시 x, 그러나 값은 수정 불가능
    public void method2(int arg){
        int localVariable = 1;

        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }


    }


}
