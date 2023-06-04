package designpattern.structural.decorator;

public class PlainPizza implements Pizza {
    private String description;
    private double cost;

    public PlainPizza() {
        this.description = "Plain Pizza";
        this.cost = 5.0;
    }
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

}
