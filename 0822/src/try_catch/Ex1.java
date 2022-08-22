package try_catch;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 예외 처리에 대한 위임 (예외 던지기 = throws)
		 * - 예외 발생 시 예외가 발생한 메소드(자신)에서 직접 처리(try ~ catch) 하지 않고
		 *   메소드를 호출한 곳으로 예외 처리를 위임할 수 있음
		 *   
		 * - 메소드 선언부 마지막에 throws 키워드를 사용하여 발생 가능성이 있는
		 *   예외 클래스 이름을 명시하여 해당 예외가 발생했을 때 예외를 던짐(throws)
		 *   
		 * - 주로 메소드 내의 특정 코드에서 예외가 발생할 것으로 예상되는 경우,
		 *   외부에서 해당 메소드를 호출하는 시점에서 미리 알 수 있도록
		 *   내부 예외를 외부로 던진 후 외부에서 해당 예외를 탐지하고 처리하도록 할 때 사용
		 *   
		 * - throws 키워드를 통해 예외를 위임하는 경우 예외가 발생한 위치에서는
		 *   예외 처리를 수행하지 않아도 컴파일 에러가 발생하지 않으며,
		 *   예외 처리를 위임 받은 곳에서 반드시 예외를 처리하는 코드 (try ~ catch)를 기술해야함
		 *   => 만약, 위임받은 예외를 직접 처리하지 않으려면 자신의 메소드에서도
		 *      throws 키워드를 통해 호출한곳으로 위임할 수 있음
		 *      
		 * - throws 키워드 뒤에 기술되는 예외클래스는 catch 블록과 마찬가지로
		 *   각각의 예외클래스를 따로 기술하거나 상위 타입 예외클래스 하나만으로 대체 가능
		 * 
		 * ex) throws ArithmeticException, NullPointerException
		 *     두 개의 예외만 외부로 던져지고, 나머지 예외는 직접 처리해야한다!
		 *     
		 * ex2) throws RuntimeException
		 *      RuntimeException 계열 예외는 외부로 던져지고, 나머지 예외는 직접 처리
		 *      
		 * ex3) throws Exception 모든예외를 외부로 던짐           
		 * 
		 * < 기본 문법 >
		 * [제한자] 리턴타입 메소드명([매개변수...]) throws 예외클래스1, 예외클래스2 ... {}
		 * 
		 * */
		
		
		// 호출한 곳에서 예외 처리
//		try {
//			사원1();
//		} catch (ArithmeticException e) {
//			System.out.println("대리가 예외를 처리!");
//		}
		
//		사원2();
		
//		try {
//			사원3();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			사원4();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// 이렇게도 가능
//		try {
//			사원3();
//			사원4();
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
		
//		대리1(); // Runtime 계열이 아니므로 컴파일에러 발생 안 함!
//		대리2();
		
		try {
			팀장();
		} catch (Exception e) {
			System.out.println("main() 메소드에서 최종적으로 모든 예외 처리!");
		}
		
	} // main 메소드 끝
	
	public static void 팀장() throws Exception {
		
		// 1) 직접 처리
//		try {
//			대리2();
//			대리1();
//		} catch (RuntimeException e) {
//			System.out.println("팀장이 ArithmeticException, NullPointerException 예외를 모두 처리!");
//		} catch (Exception e) {
//			System.out.println("팀장이 나머지 모든 예외를 모두 처리!");
//		}
		
		// 2) 예외 위임
		대리1();
		대리2();
	}
	
	public static void 대리1() throws ArithmeticException, NullPointerException { // 또는 RuntimeException
//		try {
//			사원1();
//			사원2();
//		} catch (ArithmeticException e) {
//			System.out.println("사원1로부터 위임받은 ArithmeticException 예외를 대리1이 직접 처리");
//		} catch (NullPointerException e) {
//			System.out.println("사원2로부터 위임받은 NullPointerException 예외를 대리1이 직접 처리");
//		}
		
		사원1();
		사원2();
	}
	
	public static void 대리2() throws Exception {
//		try {
//			사원3();
//			사원4();
//		} catch (ClassNotFoundException e) {
//			System.out.println("사원3으로부터 위임받은 ClassNotFoundException 예외를 대리2가 직접 처리");
//		} catch (SQLException e) {
//			System.out.println("사원4로부터 위임받은 SQLException 예외를 대리2가 직접 처리");
//		}
		
		사원3();
		사원4();
	}

	
	public static void 사원1() throws ArithmeticException {
		// 1) 직접 예외를 처리하는 경우 : try ~ catch문 사용
//		try {
//			System.out.println(3/0);
//		} catch (Exception e) {
//			System.out.println("사원1에서 예외 직접 처리!");
//		}
		
		// 2) 예외를 위임하는 경우 : throws 키워드 사용
		System.out.println(3/0);
	}
	
	public static void 사원2() throws NullPointerException {
		String str = null;
		System.out.println(str.length());
	}
	
	public static void 사원3() throws ClassNotFoundException {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		// 예외 처리를 위임하는 경우
		Class.forName("com.mysql.jdbc.Driver");
	}
	
	public static void 사원4() throws SQLException {
		// 예외 처리 위임하는 경우
		DriverManager.getConnection("");
	}
}
