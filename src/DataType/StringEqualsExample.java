package DataType;

public class StringEqualsExample {
    public static void main ( String[] args) {

        String strVar1 = "방근호";
        String strVar2 = "방근호";

        if (strVar1 == strVar2){
            System.out.println("참조가 같음");
        } else{
            System.out.println("참조가 다름");
        }

        if (strVar1.equals(strVar2)){
            System.out.println("문자열이 같음");
        }

        String strVar3 = new String("방근호");
        String strVar4 = new String("방근호");

        if (strVar3 == strVar4){
            System.out.println("str3, str4, 참조가 같음");
        } else {
            System.out.println("str3, str4, 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("3, 4 는 문자열이 같음");
        }
    }
}
