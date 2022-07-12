package while_;

public class Test2 {

	public static void main(String[] args) {
		// 중첩 while문 사용하여 구구단 2 ~ 9단 출력
		
		int m = 2;
		while (m <= 9) {
			System.out.println("< " + m + "단 >");
			
			int n = 1;  // 중첩문에서 사용하는 변수 초기화 위치! (바깥이 다 돌고 나면 다시 1로 초기화)
			while (n <= 9) {
				System.out.println(m + " * " + n + " = " + (m*n));
				n++;
			}
			
			m++;
			System.out.println();
			
		}
		
	}

}
