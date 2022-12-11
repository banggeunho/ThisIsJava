package 변수_조건_반복;

public class SwitchExample {
    public static void main ( String[] args) {

        char grade = 'B';
        // 대소문자 구분 하기 위해서는 두개씩
        switch (grade) {

            case 'A':
            case 'a':
                System.out.println("a 입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("b 입니다.");
                break;
            case 'C':
            case 'c':
                System.out.println("c 입니다.");
                break;
            default:
                System.out.println("default 입니다.");
        }
    }
}
