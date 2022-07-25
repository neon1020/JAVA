package array;

public class Test1 {

	public static void main(String[] args) {
		int[] score = {40, 50, 100, 30, 20};
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.println((i+1) + "번 학생 : " + score[i] + "점");
			sum += score[i];
		}
		
		double avg = (double) sum / score.length;
		
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println("---------------------------");
		
		String[] names = {"홍길동", "이순신", "강감찬", "김태희", "전지현"};
		int max = score[score.length -1];
		int min = score[score.length -1];
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(names[i] + " : " + score[i] + "점");
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		// 삼항연산자
		
//		for(int i = 0; i < score.length; i++) {
//			int num = score[i]; 변수에 저장해서 코드 줄여주기
//			max = max < num ? num : max;
//			min = min > num ? num : min;
//			
//		}
		
		// 향상된 for문
//		for(int num : score) {
//			max = max < num ? num : max;
//			min = min > num ? num : min;
//		}
		
		System.out.println("최고 점수 : " + max + "점");
		System.out.println("최저 점수 : " + min + "점");
		System.out.println("---------------------------");
		
		
		// 기본 for문
		String[] class1 = {"홍길동", "이순신", "강감찬"};
		for (int i = 0; i < class1.length; i++) {
			String name = class1[i];
			System.out.println(name + "이 상담받았습니다.");
		}
		System.out.println("---------------------------");
		
		// 향상된 for문 (for-each문)
		for(String name : class1) {
			System.out.println(name + "이 상담받았습니다.");
		}
		
	}

}
