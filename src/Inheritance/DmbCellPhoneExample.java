package Inheritance;

public class DmbCellPhoneExample {
    public static void main(String[] args) {

        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "black", 10);

        // 상속 받은 필드
        System.out.println(dmbCellPhone.model);

        // 상속
        System.out.println(dmbCellPhone.color);
        System.out.println(dmbCellPhone.channel);

        // 상속 받은 메소드
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice(" 여보 세 요");
        dmbCellPhone.receiveVoice("안녕하세요");
        dmbCellPhone.hangUp();


        // dmbCellPhone의 메소드
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
