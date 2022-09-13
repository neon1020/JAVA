
public class Ex1 {

	public static void main(String[] args) {
		// java.lang.Math 클래스
		
		// Math 클래스의 상수
		System.out.println("PI 값 : " + Math.PI);
		
		// Math 클래스의 static 메소드
		int num = -10;
		System.out.println("num의 절댓값 : " + Math.abs(num));
		System.out.println("num 과 20 중 큰 값 : " + Math.max(num, 20));
		System.out.println("num 과 20 중 작은 값 : " + Math.min(num, 20));
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		System.out.println("--------------------------------------------------------");
		
		double dNum = 3.141592;
		System.out.println("실수 dNum의 소수점 첫 째자리 반올림값 : " + Math.round(dNum));
		// round() 메소드는 항상 소수점 첫 째자리에서 반올림이 일어나므로 X번째 자리 반올림을 위해서는
		// 반올림할 숫자의 반올림 자리 수를 첫 번째 자리에 위치하도록 변형해야한다!
		
		// ex) 실수 3.141592의 소수점 4번째 자리 숫자(5)를 반올림하기 위해서는
		//		해당 숫자를 소수점 첫번째 자리로 이동시키기 위한 값을 직접 곱하거나
		// 		해당 숫자에 10^(x-1) 값을 곱해야함
		// 		=> 3.141592 * 1000 또는 3.141592 * 10^(4-1)
		// 		원래 자리로 숫자를 되돌리기 위해 다시 곱한 값만큼 나눗셈 수행
		System.out.println("실수 dNum의 소수점 넷 째자리 반올림값 : " + Math.round(dNum * 1000) / 1000.0);
		
		System.out.println("--------------------------------------------------------");
		
		// Math.random() : 난수 발생을 위한 메소드
		// 0.0 <= x < 1.0 범위의 double 타입 난수 발생
		
		// < 난수 발생 기본 공식 >
		// 1. (int)(Math.random() * 상한값) : 0 <= x < 상한값
		// 2. (int)(Math.random() * 상한값) + 1 : 1 <= x <= 상한값
		// 3. 복합 공식 (확률적으로 난수 중복을 최소화하기 위한 공식)
		//	  (int)(Math.random() * (상한값 - 하한값 + 1) + 하한값)
		
		System.out.println(Math.random());
		
		System.out.println("--------------------------------------------------------");
		
		// 정수 1자리 범위의 난수 발생시키기 위해서는
		// Math.random() 결과를 원하는 자릿수 만큼 정수로 이동시키고 남은 자리 숫자들을 제거
		// System.out.println((int)(Math.random() * 10));	// 0 <= x < 10
		
		for(int i = 0; i < 10; i++) {
			System.out.print((int)(Math.random() * 10) + 1 + " "); // 1 <= x < 11
		}
		System.out.println();
		
		System.out.println("--------------------------------------------------------");
		
		// 복합 공식 적용
		int upperNum = 10; // 상한값
		int lowerNum = 1; // 하한값
		
		for(int i = 0; i < 10; i++) {
			// (정수화)(Math.random() * (상한값 - 하한값 + 1)) + 하한값)
			System.out.print((int)(Math.random() * (upperNum - lowerNum + 1) + lowerNum) + " ");
		}
	}

}
