package practice;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		// 기억력 테스트
		// N 개의 숫자를 먼저 말해준다.
		// M 개의 질문을 받아 그 숫자가 있었는지 판별하시오.
		// 있으면 1 없으면 0을 출력
		// 입력예시)
		//			5
		//			2 52 23 55 100
		//			4
		//			5 2 55 99
		// 출력예시)
		//			0 1 1 0
		
		// 값 입력 받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] numbers = new int[N];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		int M = sc.nextInt();
		int[] question = new int[M];

		for (int i = 0; i < question.length; i++) {
			question[i] = sc.nextInt();
		}

		
		
		
		// 질문과 답 비교
		int[] answer = new int[M];
		int max, min;

		if (numbers.length >= question.length) {
			max = numbers.length;
			min = question.length;
			
			for (int i = 0; i < min; i++) { // question 수 (min)만큼 반복
				for (int j = 0; j < max; j++) {
					if (numbers[j] == question[i]) {
						answer[i] = 1; break;
					} else {
						answer[i] = 0;
					}
				}
			}
			
		} else {
			min = numbers.length;
			max = question.length;
			
			for (int i = 0; i < max; i++) { // question 수 (max)만큼 반복
				for (int j = 0; j < min; j++) {
					if (numbers[j] == question[i]) {
						answer[i] = 1; break;
					} else {
						answer[i] = 0;
					}
				}
			}
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}

	}

}
