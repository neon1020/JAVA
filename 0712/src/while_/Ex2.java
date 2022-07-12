package while_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 중첩 while문
		 * - while문 내에 또 다른 while문을 기술하여 반복 문장을 여러번 반복하는 문
		 * 
		 * < 기본 문법 >
		 * 
		 * 초기식1;
		 * while(조건식1){
		 * 		실행문1;
		 * 
		 * 		초기식2;
		 * 		while(조건식2){
		 * 			실행문2;
		 * 			증감식2;
		 * 		}
		 * 
		 * 		증감식1;
		 * }
		 * 
		 * */
		
		int i = 1;
		
		while(i < 6) {
			System.out.println("i = " + i);
			
			int j = 1;
			while(j < 6) {
				System.out.println("--------- j =" + j);
				j++;
			}
			
			i++;
		}
		
	}

}
