package designpattern.structural.decorator;

public class Main {
    public static void main(String[] args) {

        Pizza plainPizza = new PlainPizza();
        Pizza cheesePizza = new CheeseDecorator(plainPizza);
        Pizza mushroomCheesePizza = new MushroomDecorator(cheesePizza);

        System.out.println(plainPizza.getDescription() + ", Cost: $" + plainPizza.getCost());
        System.out.println(cheesePizza.getDescription() + ", Cost: $" + cheesePizza.getCost());
        System.out.println(mushroomCheesePizza.getDescription() + ", Cost: $" + mushroomCheesePizza.getCost());

    }
}
