package array;

public class Ex1 {

	public static void main(String[] args) {
		// 배열 선언
		int[] score;
		
		// 배열 생성
		score= new int[5]; // int의 기본값 0으로 저장됨
		System.out.println(score.length);
		System.out.println("0번 인덱스 요소 : " + score[0]);
		System.out.println("1번 인덱스 요소 : " + score[1]);
		System.out.println("2번 인덱스 요소 : " + score[2]);
		System.out.println("3번 인덱스 요소 : " + score[3]);
		System.out.println("4번 인덱스 요소 : " + score[4]);
		System.out.println("----------------------------------");
		
		// 배열 초기화
		int score1[] = {80,100, 50, 90 ,77};
		System.out.println("0번 인덱스 요소 : " + score1[0]);
		System.out.println("1번 인덱스 요소 : " + score1[1]);
		System.out.println("2번 인덱스 요소 : " + score1[2]);
		System.out.println("3번 인덱스 요소 : " + score1[3]);
		System.out.println("4번 인덱스 요소 : " + score1[4]);
		System.out.println("----------------------------------");
		
		// 반복문 사용하여 출력하기
		
		for(int i = 0; i < score1.length; i++) {
			System.out.println(i + "번 인덱스 요소 : " + score1[i]);
		}
		System.out.println("----------------------------------");
		
		// 배열 선언 및 생성을 동시에 선언
		int[] arr = new int[10];
		
		// 배열 선언, 생성, 초기화 동시에 수행
		int[] arr2 = {10, 20, 30};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("----------------------------------");
		
		// 배열 생성과 초기화 문법을 결합하여 사용
		// 배열 크기 지정 생략 해야함!!
		int[] arr3;
		arr3 = new int[] {10, 20, 30};
		
		System.out.println("배열 arr3의 크기 : " + arr3.length);
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(i + "번 인덱스 데이터 : " + arr3[i]);
		}
	}

}
