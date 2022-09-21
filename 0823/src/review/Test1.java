package review;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 파스칼에 삼각형
		// 크기 N을 입력받고 N크기의 파스칼 삼각형을 출력 하시오
		
		// 입력 예시) 6
		// 출력 예시)
		// 1
		// 1 1
		// 1 2 1
		// 1 3 3 1
		// 1 4 6 4 1
		// 1 5 10 10 5 1
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 배열 생성
		int[][] arr = new int[num][];
		for(int i = 0; i < num; i++) {
			arr[i] = new int[i + 1];
			arr[i][0] = 1;
			arr[i][i] = 1;
		}
		
		// 숫자 넣기
		for(int i = 2; i < arr.length; i++) {
			for(int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}
		
		// 배열 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
