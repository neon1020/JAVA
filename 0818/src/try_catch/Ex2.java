package try_catch;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 예외 (Exception)
		 * - 오류(Error)와 달리 심각도가 낮으며 예외 처리 (Exception Handling)를 통해
		 *   예외 발생 시 해결책을 기술하여 프로그램이 정상적으로 종료되도록 처리 가능
		 *   (=> 오류는 JVM등의 문제로 인한 것으로 개발자가 처리 불가능)
		 *   
		 * - 예외 처리를 위해 try ~ catch 문을 사용하여 처리 작업 수행
		 *   => try 블록 내에서 예외 발생 가능성이 있는 코드들을 감시하고
		 *      예외가 발생했을 경우 JVM이 던지는 예외 객체를 전달받아
		 *      catch 블록 중 해당 객체 타입과 일치하는 catch블록을 실행하여 예외를 처리
		 *   => 예외가 발생하지 않으면 catch 블록은 실행되지 않는다!
		 *        
		 * < 기본 문법 >
		 * try {
		 * 		// 일반적인 코드 및
		 *		// 예외 발생 가능성이 있는 코드들
		 * } catch (예외클래스명 변수명){
		 * 		// 예외클래스에 해당하는 예외가 발생할 경우 처리할 코드를 기술
		 * } catch (예외클래스명 변수명){
		 * 
		 * }
		 * */
		
		System.out.println("프로그램 시작!");
		
		try {
			System.out.println("try 블록 시작!");
			int num1 = 3;
			int num2 = 0;
			
			System.out.println(num1 / num2); // 예외(ArithmeticException) 가 발생하는 코드
			// 현재 예외가 발생한 코드의 아래쪽 나머지 코드들(try블록 내의 코드들)은
			// 실행되지 못하고, catch 블록으로 가서 예외 객체에 해당하는 클래스를 찾아
			// 해당 catch 블록 내의 코드들을 실행하게 된다!
			
			System.out.println("try 블록 끝!"); // 예외 발생 시 실행되지 못하는 코드
			
		} catch(ArithmeticException e) {
			
			// ArithmeticException 예외가 try 블록 내에서 발생하면
			// JVM에 의해 ArithmeticException 예외 객체가 생성되고 던져짐
			// 따라서, catch 블록의 소괄호 안에 해당 예외 클래스와 일치하는 참조변수를 선언하여
			// 던져지는 예외 객체를 전달 받아야 한다 (catch)
			// => catch 블록 중괄호 내에서 예외 발생 시 수행할 작업들을 명시
			System.out.println("ArithmeticException 예외발생! - 0으로 나눌 수 없습니다!");
		}
		
		System.out.println("프로그램 종료!");
		
		System.out.println("=====================================");
		
		System.out.println("프로그램 시작!");
		
		try {
			System.out.println("try 블록 시작!");
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); // ArrayIndexOutOfBoundsException 예외 발생!
			System.out.println("try 블록 끝!");
		} catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException 예외가 발생했을 경우 수행할 코드
			System.out.println("ArrayIndexOutOfBoundsException 예외 발생!");
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료!"); // try문과 무관하게 실행되는 코드
		
		System.out.println("==========================================");
		
		System.out.println("프로그램 시작!");
		
		try {
			System.out.println("try 블록 시작!");
			String str = null;	// NullPointerException 예외 발생!
			System.out.println(str.length());
			
			System.out.println("try 블록 끝!");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 예외 발생!");	
		}
		
		System.out.println("프로그램 종료!");
	}
}
