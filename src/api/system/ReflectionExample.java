package api.system;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

    public  static  void  main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("api.system.Car");

        System.out.println(clazz.getName());
        System.out.println();

        System.out.println("[Constructor]");

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }

        System.out.println();

        System.out.println("[field]");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }

        System.out.println();
        System.out.println("[Method]");

        Method[] methods = clazz.getDeclaredMethods();
        for ( Method method : methods) {
            System.out.print(method.getName() + "(");
            Class[] parameters = method.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }

    }

    private static void printParameters(Class[] parameters) {
        for ( int i = 0; i < parameters.length; i ++) {
            System.out.print(parameters[i].getName());
            if (i < (parameters.length - 1)) {
                System.out.println(",");
            }
        }
    }


}


class Car {
    int num;
    String vendor;
    String name;

    public Car(int num, String vendor, String name) {
        this.num = num;
        this.vendor = vendor;
        this.name = name;
    }
    public Car(){}
    public Car(int name, String asd) {}

    public void adasadd(int name, String asd, long asdsad){}
    public void asdada(Car asdad, int asdaad, String asds) {}
}
