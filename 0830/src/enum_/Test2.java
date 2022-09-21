package enum_;

public class Test2 {

	public static void main(String[] args) {
		Week2 wk = Week2.화;
		int sat = wk.compareTo(Week2.토);
//		 System.out.println(sun);
		
		if(sat == 1 || sat == 0) {
			System.out.println("이미 주말!!");
		} else {
			System.out.println("오늘은 " + wk + "요일.. 주말까지 " + -sat + "일 남았다!");
		}
		
	}

}

enum Week2 {
	월, 화, 수, 목, 금, 토, 일
}