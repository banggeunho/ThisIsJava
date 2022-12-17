package Object;

public class SingletonExample {
    public static void main(String[] args){

//        Singleton obj1 = new Singleton();

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("same object");
        } else {
            System.out.println("different object");
        }
    }
}
