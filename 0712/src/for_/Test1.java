package for_;

public class Test1 {

	public static void main(String[] args) {
		// 구구단 특정 단 출력
		
		int dan = 2;
		System.out.println("< " + dan + "단 >");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}

	}

}
