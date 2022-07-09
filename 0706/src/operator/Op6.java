package operator;

public class Op6 {

	public static void main(String[] args) {
		/*
		 * (& Ampersend) (| Vertical Bar) (^ Caret)
		 * 
		 * 논리연산자 (&&, ||, !, ^)
		 * - 두 피연산자 간의 논리적인 판별을 수행하는 연산자
		 * - 피연산자는 모두 boolean 타입 데이터만 사용 가능하며,
		 *   결과값도 boolean 타입으로 리턴
		 *   
		 * < AND 연산자 (& 또는 &&) - 논리곱 >  
		 * - 두 피연산자 모두 true일 경우에만 결과가 true이고,
		 *   하나라도 false일 경우 결과값이 false
		 *   - F AND F = F, F AND T = F, T AND F = F, T AND T = T
		 *   
		 * < OR 연산자 (| 또는 ||) - 논리합 >
		 * - 두 피연산자 중 하나라도 true일 경우 결과값이 true이고
		 *   모두 false일 경우에만 false
		 *   - F OR F = F, F OR T = T, T OR F = T, T OR T = T
		 *   
		 * < NOT 연산자(!) - 논리부정 >
		 * - 단항 연산자로, 현재 값을 반대로 반전
		 *   !T = F, !F = T
		 *   
		 * < XOR 연산자(^) - 배타적 논리합 >
		 * - 두 피연산자가 서로 다를 때 true, 같으면 false
		 *   F XOR F = F
		 *   T XOR T = F     
		 * 
		 * 	 F XOR T = T
		 *   T XOR F = T
		 * 
		 * */
		
		boolean a = false;
		boolean b = true;
		
		// AND 연산자 (&&) : 둘다 만족(true)할 경우에만 true
		System.out.println("a(false) && a(false) = " + (a && a)); // f
		System.out.println("a(false) && b(true) = " + (a && b)); // f
		System.out.println("b(true) && a(false) = " + (b && a)); // f
		System.out.println("b(true) && b(true) = " + (b && b)); // t
		System.out.println();
		
		// OR 연산자 (||) : 하나라도 만족(true)할 경우에 true
		System.out.println("a(false) || a(false) = " + (a || a)); // f
		System.out.println("a(false) || b(true) = " + (a || b)); // t
		System.out.println("b(true) || a(false) = " + (b || a)); // t
		System.out.println("b(true) || b(true) = " + (b || b)); // t
		System.out.println();
		
		// NOT 연산자 (!)
		System.out.println("!a(false) = " + (!a)); // t
		System.out.println("!b(true) = " + (!b)); // f
		System.out.println();
		
		// XOR 연산자 (^)
		System.out.println("a(false) ^ a(false) = " + (a ^ a)); // f
		System.out.println("a(false) ^ b(true) = " + (a ^ b)); // t
		System.out.println("b(true) ^ a(false) = " + (b ^ a)); // t
		System.out.println("b(true) ^ b(true) = " + (b ^ b)); // f
		
		// &&, || : lazy Evaluation 에 의해 불필요한 연산은 하지 않는다.
		int i = 10;
		boolean result = i > 5 || i++ > 5;
		System.out.println(i); // 10
		

	}

}
