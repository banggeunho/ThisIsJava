package exception;

// 실행 예외(컴파일러) class 는 일반적으로 Exception을 상속 받는다.
public class BalanceInsufficientException extends Exception{

    // 일반적으로 생성자는 2개 생성
    public BalanceInsufficientException() {}
    //얘는 catch문에서 에러내용을 알려주기 위한 용도
    public BalanceInsufficientException(String message) { super(message); }

}
