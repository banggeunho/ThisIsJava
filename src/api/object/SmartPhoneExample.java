package api.object;

import java.util.Date;

public class SmartPhoneExample {
    public static void main(String[] args)
    {
        SmartPhone smartPhone = new SmartPhone("구글", "안드로이드");

        String strObj = smartPhone.toString();
        System.out.println(strObj);


    }
}
