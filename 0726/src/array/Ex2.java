package array;

public class Ex2 {

	public static void main(String[] args) {
		// 다차원 배열 (2차원 배열) : 행, 열의 구조로 이루어짐
		// 열 : 실제 데이터가 저장되는 공간 ( 크기 : 배열명[행인덱스].length )
		// 행 : 열 공간의 주소를 저장하는 공간 ( 크기 : 배열명.length )

		// 접근 방법 : 변수명[행인덱스][열인덱스]

		int[][] arr;
		arr = new int[2][3];

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		System.out.println(arr[0][0] + " " + arr[0][1] + " " + arr[0][2]);
		System.out.println(arr[1][0] + " " + arr[1][1] + " " + arr[1][2]);
		System.out.println("--------------");

		for (int i = 0; i < arr.length; i++) { // 행만큼 반복

			for (int j = 0; j < arr[i].length; j++) { // 열만큼 반복
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");

		// 배열의 크기
		System.out.println("배열 arr의 행크기 : " + arr.length);
		System.out.println("배열 arr의 0번 행의 열크기 : " + arr[0].length);
		System.out.println("배열 arr의 1번 행의 열크기 : " + arr[1].length);
		System.out.println("------------------------------------------------");

		// 이런 식으로 많이 선언함
		int[][] arr2 = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 } };

		for (int i = 0; i < arr2.length; i++) { // 행만큼 반복

			for (int j = 0; j < arr2[i].length; j++) { // 열만큼 반복
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		
		// 2차원 배열에서 각 행의 열 갯수가 다를 수 있음
		// 1. 데이터 한꺼번에 초기화
		int[][] arr3 = {
				{1, 2, 3},
				{4, 5},
				{6, 7, 8, 9, 10}
		};
		
		for (int i = 0; i < arr3.length; i++) { // 행만큼 반복

			for (int j = 0; j < arr3[i].length; j++) { // 열만큼 반복
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		// 2. 배열 생성 후 초기화
		
		int[][] arr4 = new int[3][];
		
		arr4[0] = new int[3];
		arr4[1] = new int[2];
		arr4[2] = new int[5];
		
		// arr4[0] = {1, 2, 3}; 오류!
		// 배열 변수 선언 & 생성 & 초기화 한꺼번에 할 때만 {} 사용 가능
		
		 arr4[0] = new int[] {1, 2, 3}; // 이렇게는 가능!
		 arr4[1] = new int[] {4, 5};
		 arr4[2] = new int[] {6, 7, 8, 9, 10};
		 
		 for (int i = 0; i < arr4.length; i++) { // 행만큼 반복

				for (int j = 0; j < arr4[i].length; j++) { // 열만큼 반복
					System.out.print(arr4[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("--------------");

	}

}
