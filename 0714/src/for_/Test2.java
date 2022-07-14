package for_;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 별 계단 찍기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력 받은 정수

		// 공백 : 1층 = 0, 2층 = 1, 3층 = 2 ...

		for (int i = 0; i < n; i++) { // 줄
			for (int j = 0; j <= (i - 1); j++) { // 공백
				System.out.print(" ");
			}
			System.out.println("**");
		}

	}

}
