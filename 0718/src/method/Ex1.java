package method;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 메소드 (Method)
		 * - 객체의 동작을 나타내는 최소 단위
		 * - 정의 후에는 반드시 호출되어야만 사용가능
		 * - 이때, 호출하는 메소드를 Caller, 호출 당하는 메소드를 Worker 라고함
		 * - main() 메소드도 메소드의 일종
		 * => JVM에 의해 자동으로 호출되는 메소드 = 프로그램의 시작점
		 * - 메소드를 호출할 때 전달하는 값을 전달인자(Argument) 라고 하며
		 *   이 값을 메서드에서 전달받기 위해 선언하는 변수를 매개변수(Parameter)라고 함
		 *   => 이때, 메소드 호출 시 전달하는 값이 없을 수도 있다!
		 *   => 메소드를 호출 할때 반드시 선언부의 매개변수 타입과 갯수에 맞게
		 *      데이터를 전달하여 호출해야한다!
		 * - 메소드 수행이 끝날 때 호출한 곳으로 전달할(되돌려줄) 값을 리턴값이라고 하며
		 *   리턴값에 해당하는 데이터타입을 리턴타입 부분에 명시 해야함
		 *   => 메소드 수행 후 리턴값이 없을 수도 있다!
		 *      만약, 리턴값이 없을 경우 리턴타입에 반드시 void 라는 타입을 명시 해야한다!
		 *   => 한번에 리턴 가능한 데이터는 한 개!   
		 * - 메소드 수행이 종료되면, 반드시 메소드를 호출한 곳으로 돌아옴
		 *   이때, 리턴값이 존재한다면 호출한 곳으로 돌아올 때 가지고 옴
		 * 
		 * < 메소드 정의 방법(형태)에 따른 분류 >
		 * 1. 매개변수 (X), 리턴 (X)
		 * 2. 매개변수 (X), 리턴 (O)
		 * 3. 매개변수 (O), 리턴 (X)
		 * 4. 매개변수 (O), 리턴 (O)
		 * 
		 * */
		
		// 1. 매개변수 (X), 리턴 (X)
		// => 매개변수가 없으므로 메소드 호출시 소괄호() 안에 아무 데이터도 전달하지 않음
		// => 리턴값이 없으므로 메소드 호출결과를 저장할 변수를 선언하거나
		//    출력문 등의 내부에서 메서드 호출 불가능하며, 단독으로 호출해야한다!
		System.out.println("동생아! 불 좀 꺼라");
//		System.out.println(sister_1()); // 리턴타입이 void 이므로 출력문안에서 호출 불가!
		sister_1();
		System.out.println("동생이 불을 껐다!");
		
		System.out.println("------------------------------");
		// 2. 매개변수 (X), 리턴 (O)
		System.out.println("동생아! 물 좀 떠줘!");
//		String result = sister_2();
//		String result = "물"; 과 동일한 코드로 사용됨.
//		System.out.println("동생이 갖다준것 : " + result);
		System.out.println("동생이 갖다준것 : " + sister_2()); // 출력문 안에서 바로 사용 가능
//		System.out.println("동생이 갖다준것 : " + "물"); 과 동일한 코드로 사용됨.
		
		System.out.println("------------------------------");
		
		// 3. 매개변수 (O), 리턴 (X)
		System.out.println("동생아! 500원 줄테니 과자 사먹어라!");
//		sister_3(500);
		int money = 500;
		sister_3(money);
		
		System.out.println("------------------------------");
		
		// 4. 매개변수 (O), 리턴 (O)
		System.out.println("동생아! 1000원 줄테니 새우깡 좀 사다줘!");
//		String snack = sister_4(1000);
//		String snack = "새우깡"; 과 동일한 코드로 사용됨.
//		System.out.println("동생이 사다준것 : " + snack);
		System.out.println("동생이 사다준것 : " + sister_4(1000));
//		System.out.println("동생이 사다준것 : " + "새우깡"); 과 동일한 코드로 사용됨.
	}
	
	// -----------------------------------------------------------------------------------
	// 메소드 선언 위치는 Main 메소드 바깥!
	
	// 1. 매개변수 (X), 리턴 (X)
	// => 리턴값이 없으므로 리턴타입에 void 타입 명시 (생략불가!)
	// => 매개변수가 없으므로 메소드 선언부 소괄호() 안에 아무것도 기술하지 않음
	public static void sister_1() {
		System.out.println("동생: 언니가 불 끄라고 시켜서 불을 껐다!");
	}
	
	// 2. 매개변수 (X), 리턴 (O)
	public static String sister_2() {
		System.out.println("동생 : 언니가 물을 떠오라고 시켰다!");
		// 리턴타입을 기술한 경우 반드시 return문 뒤에 return할 데이터를 기술해야한다!
		String result = "물";
		return result; // 또는 return = "물" 도 가능
	}
	
	// 3. 매개변수 (O), 리턴 (X)
	public static void sister_3(int money) {
		System.out.println("동생 : 언니가 과자 사먹으라고 " + money + "원을 줬다!");
		money -= 200;
		System.out.println("동생 : 새우깡 사먹고 " + money + "원이 남았다!");
	}
	
	
	// 4. 매개변수 (O), 리턴 (O)
	public static String sister_4(int money) {
		System.out.println("동생 : 언니가 과자 사오라고 " + money + "원을 줬다!");
		money -= 200;
		System.out.println("동생 : 과자 사고 " + money + "원이 남았다!");
		return "새우깡";
	}
	
	
	
	
	
	
	

}
