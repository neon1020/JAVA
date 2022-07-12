package for_;

public class Test3 {

	public static void main(String[] args) {
		// 7의 갯수를 카운트
		// 출력 : "7의 갯수 : xx"

		int n = 7213547;
		int count = 0;
		//	System.out.println((n/1000)%10); 참고

		for (int i = 1, nn = 1; nn > 0; i *= 10) {
			nn = (n / i) % 10; // 각 자릿수 조사
			if (nn == 7) {
				count++;
			}
		}

		System.out.println("7의 갯수 : " + count);
		System.out.println("-----------------------------------------");

		// while문 사용

		int m = 115777, i = 1, mm = 1, count2 = 0;

		while (mm > 0) {
			mm = (m / i) % 10;

			if (mm == 5) {
				count2++;
			}

			i *= 10;
		}

		System.out.println("5의 갯수 : " + count2);

		// 해당 줄 숫자 더블클릭 시 브레이크포인트 설정
		// 설정 후 f11 누르면 디버그 화면으로 넘어감
		// f5 누르면서 한 단계씩 진행해볼 수 있음

	}

}
