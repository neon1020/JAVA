package static_;

public class Ex5 {
	
	// 실행 순서 : 1 -> 3 -> main 메소드 -> 2
	
	int b = check(2);
	
	static int a = check(1);

	public static int check(int i) {
		System.out.println("call : " + i);
		return i;
	}
	
	public static void main(String[] args) {
		System.out.println("main() 메소드");
		Ex5 ex = new Ex5();
	}
	
	static int c = check(3);

}
