package study_221211;

public class FloatDoubleExample {
    public static void main ( String[] args) {

        double var1 = 3.14;
        float var3 = 3.14F; // float을 사용하기 위해선 뒤에 F를 붙여 줭야 함.

        double var4 = 0.1234567890123456789; // bit 수가 2배 이상 절미해서 2배 정도 더 정밀하게 표현 되어짐.
        float var5 = 0.1234567890123456789F;

        System.out.println(var1);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

        //e 사용하기

        int var6 = 3000000;
        double var7 = 3e6;
        float var8 = 3e6F;
        double var9 = 2e-3;

        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
        System.out.println(var9);
    }
}
