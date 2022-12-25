package api.system.dynamicobject;

public class NewInstanceExample {
    public static void main (String[] args) {

        try {
//            Class clazz = Class.forName("api.system.dynamicobject.SendAction");
            Class clazz = Class.forName("api.system.dynamicobject.ReceiveAction");
            Action action = (Action) clazz.newInstance();
            action.execute();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
