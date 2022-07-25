package array;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * n 개의 숫자가 입력되면
		 * n 개의 숫자를 왼쪽으로 하나씩 돌려서 출력하기
		 * 
		 * 입력예시)
		 * 1 2 3 4 5
		 * 
		 * 출력예시)
		 * 
		 * 1 2 3 4 5
		 * 2 3 4 5 1
		 * 3 4 5 1 2
		 * 4 5 1 2 3 
		 * 5 1 2 3 4 
		 * 
		 * */
		
		int[] arr = {1, 2, 3, 4, 5};
		
		// 가로 1줄 * 5번 반복
		for(int i = 0; i < arr.length; i++) {
			
			// 가로 1줄 출력하기
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			
			System.out.println();
			
			// 다음번 출력할 줄 돌리기
			int temp = arr[0];
			for(int k = 0; k < arr.length - 1; k++) {
				arr[k] = arr[k+1];
			}
			arr[arr.length - 1] = temp;
		}

	}

}
