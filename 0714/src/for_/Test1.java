package for_;

public class Test1 {

	public static void main(String[] args) {
		// 구구단 출력
		// alt + shift + r : 변수명 한 번에 고치기

		for (int m = 2; m <= 9; m++) {
			System.out.println("< " + m + "단 >");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " * " + n + " = " + (m * n));
			}
			System.out.println();
		}

	}

}
