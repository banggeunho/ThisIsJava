package abstarct;

public class Child extends Parent{

    private String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() test");
    }

    public Child(String name){
        this.name = name;
        System.out.println("Child(String name) call");
    }

    public static void main(String[] args){
        Child child = new Child();
    }
}
