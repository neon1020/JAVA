package practice_object;

public class Subway {
	// 멤버 변수 : 지하철 노선, 승객 수, 버스 수입
		int number;
		int costumer;
		int income;
		
		// 생성자
		public Subway(int number) {
			this.number = number;
		}
		
		// 메소드1 : 승객이 지하철 탔을 경우 승객 수와 지하철 수입 증가시키는 메소드
		public void take(int fee) {
			this.costumer++;
			this.income += fee;
		}
		
		// 메소드2 : 해당 지하철 노선의 승객 수와 수입 출력하는 메소드
		public void showInfo() {
			System.out.println("현재 승객 수 : " + this.costumer + ", 현재 지하철 수입 : " + this.income);
		}
}
