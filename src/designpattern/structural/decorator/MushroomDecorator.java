package designpattern.structural.decorator;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }


}
