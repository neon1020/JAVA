package method;

public class Test1 {

	public static void main(String[] args) {
		// 1. 매개변수 x, 리턴 x : hello() 호출
		hello();
		System.out.println("----------------------------------");
		
		// 2. 매개변수 o, 리턴 x : hello2() 호출
		hello2("안녕하세요", 3);
		System.out.println("----------------------------------");
		
		// 3. 매개변수 x, 리턴 o : sum() 호출 후 결과 출력
		System.out.println(sum());
		System.out.println("----------------------------------");
		
		// 4. 매개변수 o, 리턴 o : sum2() 호출 후 결과 출력
		System.out.println(sum2(5));
		System.out.println("----------------------------------");
		
		// 5. 번외. 리턴 타입이 없는 return문
		sum3(10);
	}
	
	public static void hello() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hello, World!");
		}
	}
	
	public static void hello2(String m, int num) {
		for(int i = 1; i <= num; i++) {
			System.out.println(m);
		}
	}
	
	public static int sum() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int sum2(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void sum3(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("return 전 sum 값 : " + sum);
		
		if(sum > 100) return; // break문과 같은 역할
		
		System.out.println("return 후 sum 값 : " + sum);
		
	}
	
	
	

}
