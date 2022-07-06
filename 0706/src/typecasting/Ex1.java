package typecasting;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 형 변환 = 타입 변환 (Type Casting)
		 * - 데이터 타입 간의 변환이 일어나는 것
		 * - 기본형끼리의 형 변환과 참조형끼리의 형 변환으로 구분
		 * 
		 * 1. 묵시적 형 변환 (= 자동 형 변환, 암시적 형 변환)
		 * - 작은 데이터타입에서 큰 데이터타입으로 변환하는 경우
		 *   별도의 형 변환 연산자를 사용하지 않아도 "자동"으로 변한됨
		 * - 따라서, 오류가 발생하지 않으면 원본 데이터 그대로 변환됨  
		 * 
		 * 2. 명시적 형 변환 (= 강제 형 변환)
		 * - 큰 데이터타입에서 작은 데이터타입으로 변환하는 경우
		 *   반드시 형 변환 연산자(casting, () )를 사용하여 우변의 데이터 앞에 작은데이터타입을 명시
		 * - 이때, 강제 변환 과정에서 원본데이터의 넘침(Overflow, 오버플로우)
		 *   이 발생하여 원본데이터가 아닌 다른 데이터가 저장될 수 있다.
		 * 
		 * */
		
		int a1 = 128;
		byte a2 = 127;
		
		System.out.println("변환 전 a1(int) : " + a1 + ", a2(byte) : " + a2);
		
		// 묵시적 형변환 : 작은 데이터타입 -> 큰 데이터타입으로 변환 (자동)
		a1 = a2;
//		a1 = (int)a2;	// 형변환 연산자를 사용해도 되지만, 자동으로 수행하기 때문에 생략 가능!
		System.out.println("변환 후 a1(int) : " + a1 + ", a2(byte) : " + a2);
		
		System.out.println("=========================");
		
		int b1 = 130;
		byte b2 = 127;
		System.out.println("변환 전 b1(int) : " + b1 + ", b2(byte) : " + b2);
		
		b2 = (byte) b1;
		// 변환에 성공하더라도 오버플로우(overflow)에 의해
		// 원본데이터가 아닌 다른 데이터로 변형될 수 있다!
		System.out.println("변환 후 b1(int) : " + b1 + ", b2(byte) : " + b2);
		
		System.out.println("======================");
		
		// 강제 형변환 후에도 오버플로우가 발생하지 않는 경우
		// => 작은 데이터타입에 저장 가능한 데이터 범위인 경우 오버플로우 발생 X
		int c1 = 10;
		byte c2 = 0;
		System.out.println("변환 전 c1(int) : " + c1 + ", c2(byte) : " + c2);
		c2 = (byte)c1;
		System.out.println("변환 후 c1(int) : " + c1 + ", c2(byte) : " + c2);
		
		
		
		
	}

}
