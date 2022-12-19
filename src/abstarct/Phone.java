package abstarct;

public abstract class Phone {

    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("전원 켜기");
    }

    public void turnOff() {
        System.out.println("전원 끄기");
    }

}
