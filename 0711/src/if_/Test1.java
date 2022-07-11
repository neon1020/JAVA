package if_;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 1. 정수형 변수 num1에 대한 양수, 음수, 0을 판별
			int num1 = -3;
			
			if (num1 > 0) {
				System.out.println(num1 + "은 양수!");
			} else if (num1 < 0) {
				System.out.println(num1 + "은 음수!");
			} else {
				System.out.println(num1 + "은 0!");
			}
			System.out.println("==========================");
			
			
			// 2. 정수형 변수 num2에 대한 홀수, 짝수, 0을 판별
			int num2 = 0;
			
			if (num2 % 2 == 0 && num2 > 0) { // 주의! 0도 나머지가 0이므로 조건 하나 더 달아주거나 0을 맨처음 판별해도 됨
				System.out.println(num2 + "은 짝수!");
			} else if (num2 % 2 == 1) {
				System.out.println(num2 + "은 홀수!");
			} else {
				System.out.println(num2 + "은 0!");
			}
			System.out.println("==========================");
			
			
			// 3. 문자 ch가 대문자면 소문자로, 소문자면 대문자로, 나머지 문자는 "ch는 영문자가 아닙니다" 출력
			char ch = 'e';
			
			if (ch >= 'A' && ch <= 'Z') {
				System.out.println(ch + " -> " + (ch+=32));
			} else if (ch >= 'a' && ch <= 'z') {
				System.out.println(ch + " -> " + (ch-=32));
			} else {
				System.out.println("ch는 영문자가 아닙니다.");
			}
			System.out.println("==========================");
			
			
			/* 4. 학생 점수(score)에 대한 학점(grade) 판별
			 *  A학점 : 90 ~ 100
			 *  B학점 : 80 ~ 89
			 *  C학점 : 70 ~ 79
			 *  D학점 : 60 ~ 69
			 *  F학점 : 0 ~ 59
			 *  
			 *  "X학점" 이라고 출력
			 * */
			
			int score = 95;
			String grade;
			
			if (score >= 90) {
				grade = "A학점";
			} else if (score >= 80) {
				grade = "B학점";
			} else if (score >= 70) {
				grade = "C학점";
			} else if (score >= 60) {
				grade = "D학점";
			} else {
				grade = "F학점";
			}
			
			System.out.println(grade);
			
			
			// 삼항연산자
			grade = score >= 90 ? "A" :
					score >= 80 ? "B" :
					score >= 80 ? "C" :
					score >= 80 ? "D" : "F";
						
			System.out.println(grade += "학점");
			
			
			// Scanner로 값 입력 받기
			Scanner sc = new Scanner(System.in);
			int score2 = sc.nextInt();
			String grade2;
			
			grade2 = score2 >= 90 ? "A" :
					 score2 >= 80 ? "B" :
					 score2 >= 80 ? "C" :
					 score2 >= 80 ? "D" : "F";
					
		System.out.println(grade2 += "학점");

	}

}
