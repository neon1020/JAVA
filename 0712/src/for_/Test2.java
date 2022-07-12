package for_;

public class Test2 {

	public static void main(String[] args) {
		// 두 정수 a ~ b 까지 3의 배수의 합 (a < b)
		// 출력 : a ~ b 까지 3의 배수의 합 : xx
		
		int sum = 0;
		int a = 1, b = 6;
		for (int i = a; i <= b; i++) {
			
			if (i % 3 == 0) {
				sum += i;
			}
			
		}
		
		System.out.println(a + " ~ " + b + " 까지의 3의 배수의 합 : " + sum);
		
		
		// 3 6 9 게임
		// 정수 1 ~ 100 까지 1씩 증가하면서 반복, 각 정수 화면에 출력
		// 1의 자리가 3, 6, 9 중 하나일 경우 숫자 대신 "짝" 출력
		
		for (int i = 1; i <= 20; i++) {
//			int num = i % 10; 변수 만들어주고 써도 됨
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print("짝 ");
			} else {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		
		// switch문 사용 (속도는 이게 더 빠르다!)
		
		for (int i = 1; i <= 20; i++) {
			switch (i%10) {
			case 3:
			case 6:
			case 9:
				System.out.print("짝 ");
				break;

			default:
				System.out.print(i + " ");
				break;
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		
		
		
	}

}
