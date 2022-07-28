package practice;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 마방진 (magic square) 이란 가로, 세로, 대각선의 합이 같은 사각형을 말한다.
		 * 홀수 n을 입력으로 받아 n * n 마방진을 만들어보자
		 * 
		 * 구현방법:
		 * 1. 시작은 첫 행, 한가운데 열에 1을 둔다.
		 * 2. 행을 감소, 열을 증가하면서 순차적으로 수를 넣어갑니다.
		 * 3. 행은 감소하므로 첫행보다 작아지는 경우에는 마지막 행으로 넘어간다
		 * 4. 열을 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어간다.
		 * 5. 넣은 수가 n의 배수이면 행만 증가한다. 열은 변화없음
		 * 
		 * n = 3일 경우
		 * 
		 * 8 1 6
		 * 3 5 7
		 * 4 9 2
		 * */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] square = new int [n][n];
		int row = 0;
		int col = n/2; // 첫 행 가운데 열 인덱스
		
		for(int i = 0; i < (n*n); i++) {
			square[row][col] = i + 1;
			
			if((i + 1) % n == 0) {
				row++;
			} else {
				row--;
				col++;
			}
			
			if(row < 0) {
				row = n - 1;
			}
			
			if(col > n - 1) {
				col = 0;
			}
		}
		
		// 마방진 출력
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
	}

}
