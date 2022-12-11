package 변수_조건_반복;

public class ConditionalOperationExample {
    public static void main(String[] args){

        int score = 85;

        char grade;


//        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');

        // 삼항 연산자로 만들면 아래 코드를 위 처럼 한 줄로 작성 가능
        if (score > 90){
            grade = 'A';
        }else {
            if ( score > 80){
                grade = 'B';
            } else{
                grade = 'C';
            }
        }

        System.out.println(score + "   " +grade);
    }
}
