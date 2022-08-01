package method;

class OverloadingMethod {
	
	// int형 정수 2개 전달 받아 덧셈 결과 출력
	public void add(int num1, int num2) {
		System.out.println("add(int, int) 호출됨!");
		System.out.println(num1 + num2);
	}
	
	// double형 실수 2개 전달 받아 덧셈 결과 출력
	public void add(double num1, double num2) {
		System.out.println("add(double, double) 호출됨!");
		System.out.println(num1 + num2);
	}
	
	// long형 정수 2개 전달 받아 덧셈 결과 출력
	public void add(long num1, long num2) {
		System.out.println("add(long, long) 호출됨!");
		System.out.println(num1 + num2);
	}
}



public class Test2 {

	public static void main(String[] args) {
		OverloadingMethod ol = new OverloadingMethod();
		
		ol.add(10, 20);
		ol.add(1.2, 2.5);
		ol.add(100L, 50L);
		System.out.println("-----------------------------");
		
		// 자동형변환
		ol.add(10, 2.2);
		ol.add(3.14, 100L);
		ol.add(100L, 2);
		ol.add(10, (int)1.5);
		
		
	}

}
