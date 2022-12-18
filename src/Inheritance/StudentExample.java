package Inheritance;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "21313123", 1);
        // 부모 필드
        System.out.println(student.name);
        System.out.println(student.ssn);

        // 자식 필드
        System.out.println(student.studentNo);
    }
}
