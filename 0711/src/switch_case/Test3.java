package switch_case;

public class Test3 {

	public static void main(String[] args) {
		// 세 정수 n1, n2, n3 중 최대값을 출력 : "최대값 : xx"
		
		int n1 = 2, n2 = 5, n3 = 10, max = 0;
		
		if (n1 >= n2 && n1 >= n3) {
			max = n1;
		} else if (n2 >= n3) {
			max = n2;
		} else {
			max = n3;
		}
		
		System.out.println("최대값 : " + max);
		
		// 삼항연산자 이용
		int max2	 = (n1 > n2) ? n1 		: n2;
		max2 	   	= (max2 > n3)? max2 	: n3;
		System.out.println("최대값 : " + max2);

	}

}
