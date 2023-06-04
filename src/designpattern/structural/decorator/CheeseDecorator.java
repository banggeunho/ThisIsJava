package designpattern.structural.decorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }


}
