package array;

public class Test2 {

	public static void main(String[] args) {
		int[] north = { 70, 80, 60, 20, 30, 50, 10, 80, 77, 89 };
		//						ㅣ		ㅣ		ㅣ
		int[] south = { 70, 60, 40, 50, 55, 65, 23, 44, 37, 88 };
		int[] bridge = { 2, 4, 6 };
		int[] total = new int[3];

		for (int k = 0; k < bridge.length; k++) { // total을 총 3번 구함
			int sum = 0;
			int br = bridge[k]; // 2번 다리, 4번 다리, 6번 다리

			// 북쪽 합
			for (int i = 0; i <= br; i++) { // <= 임에 주의
				sum += north[i];
			}

			// 남쪽 합
			for (int i = br; i < north.length; i++) {
				sum += south[i];
			}
			
			total[k] = sum;

		}
		
//		System.out.println(total[0]); // 612
//		System.out.println(total[1]); // 572
//		System.out.println(total[2]); // 512
		
		int minIndex = 0;
		int min = Integer.MAX_VALUE; // 최솟값 구할 때 쓰는 방법
		for (int i = 0; i < total.length; i++) {
			if (min > total[i]) {
				min = total[i];
				minIndex = i;
			}
		}
		
		System.out.println("다리 번호 : " + bridge[minIndex]);
		System.out.println("최소 시간 : " + min);
		
	}

}
