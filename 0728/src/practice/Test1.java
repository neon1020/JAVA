package practice;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 거스름돈 계산
		 * 
		 * N이 32850일 경우
		 * 50000원 : 0개
		 * 10000원 : 3개
		 * 5000원 : 0개
		 * 1000원 : 2개
		 * 500원 : 1개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 0개
		 * 
		 * */
		
		int money = 32850;
		int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] count = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			count[i] = money / arr[i];
			money %= arr[i]; // 계산 다 한 앞 단위는 떼버리기
//			System.out.println(money);
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.println(arr[i] + "원 : " + count[i] + "개");
		}
		
//		System.out.println(32850 / 10000);
		
	}

}
