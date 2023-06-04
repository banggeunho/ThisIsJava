package designpattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .name("geunho")
                .job("se")
                .build();

        System.out.println(person.toString());
    }
}
