package api.system.dynamicobject;

public class ReceiveAction implements Action{

    @Override
    public void execute() {
        System.out.println("데이터 받기");
    }
}
