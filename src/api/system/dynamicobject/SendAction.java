package api.system.dynamicobject;

public class SendAction implements Action{

    @Override
    public void execute() {
        System.out.println("데이터 보내기");
    }
}
