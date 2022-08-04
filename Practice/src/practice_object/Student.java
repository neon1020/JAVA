package practice_object;

public class Student {
	// 멤버 변수 : 이름, 학년, 가진 돈
	String name;
	int grade;
	int money;
	
	// 생성자
	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	// 메소드1 : 버스 타면 1000원 지불하는 메소드
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	// 메소드2 : 지하철 타면 1500원 지불하는 메소드
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	// 메소드3 : 학생의 현재 잔액 출력하는 메소드
	public void showInfo() {
		System.out.println(this.name + "의 현재 잔액 : " + this.money);
	}
}
