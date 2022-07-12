package while_;

public class Test1 {

	public static void main(String[] args) {
		// 구구단 특정 단 출력
		
		int dan = 5;
		int i = 1;
		
		System.out.println("< " + dan + "단 >");
		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
			i++;
		}

	}

}
