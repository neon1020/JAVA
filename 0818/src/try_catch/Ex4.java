package try_catch;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Exception 객체의 정보 활용
		 * - 예외 발생 시 해당 예외를 처리할 수 있는 예외 객체를 생성하여 전달됨
		 *   => 이때, catch 블록에서 해당 예외 객체를 전달받을 수 있다!
		 * - 전달받은 객체의 여러 메소드를 통해 객체 정보를 활용 가능
		 * 
		 * 1. void printStackTrace()
		 * 		=> 예외 발생 코드 출력
		 * 
		 * 2. String getMessage()
		 * 		=> 예외 발생 시 전달되는 원인메세지를 문자열로 리턴해준다.
		 * 		ex) ArithmeticException 발생 시 원인 메세지인 "/ by zero" 문자열을 리턴
		 * 
		 * 3. String getLocalizedMessage()
		 * 		=> 기본적으로 getMessage() 메소드와 기능은 동일하나
		 * 			주로 예외 원인 메세지를 수정하기 위해 오버라이딩하여
		 * 			수정된 메세지를 출력하기 위해 사용하는 메소드
		 * 			(오버라이딩 하지 않을 경우 getMessage() 메소드와 동일함)
		 * */
		
		try {
			
			int num1 = 3;
			int num2 = 0;
			
			System.out.println(num1 / num2); // 예외(ArithmeticException) 가 발생하는 코드
			
		} catch (Exception e) { // Exception 예외를 전달받은 catch문 e를 활용
//			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}
	}
}
