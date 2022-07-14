package for_;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 중첩 for문 - for문 내에 또 다른 for문을 기술하여 반복 문장을 여러번 반복하는문
		 * 
		 * < 기본 문법 >
		 * 
		 * for(초기식1; 조건식1; 증감식1){
		 * 
		 * for(초기식2; 조건식2; 증감식2;){
		 * 
		 * }
		 * 
		 * }
		 * 
		 */

//		for(int min = 0; min < 60; min++) {
//			
//			for(int sec = 0; sec < 60; sec++) {
//				System.out.println(min + "분" + sec + "초");
//				
//			}
//			
//		}

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++) {

				for (int s = 0; s < 60; s++) {
					System.out.println(h + "시" + m + "분" + s + "초");
				}

			}

		}

	}

}