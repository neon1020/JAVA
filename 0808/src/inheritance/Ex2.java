package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		SpiderMan sm = new SpiderMan();
		sm.name = "피터 파커";
		sm.age = 20;
		sm.nickName = "친절한 이웃 스파이더맨";
		
		sm.eat();
		sm.jump();
		sm.fireWeb();
		// sm.normalLife(); => private 접근제한자 메소드는 호출 불가!
		
		// 생성자는 상속 대상에서 제외된다! (=> 생성자와 클래스 이름이 다르기 때문)
		
		Person p = new Person("홍길동", 30);
		// SpiderMan sm2 = new SpiderMan("피터 파커", 20); => 생성자 상속되지 않았으므로 이 생성자는 사용 불가!
	}

}


class Person {
	String name;
	int age;
	
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("밥 먹기!");
	}
	
	public void jump() {
		System.out.println("점프!");
	}
	
	private void normalLife() {
		System.out.println("평범한 삶");
	}
}


class SpiderMan extends Person {
	String nickName;
	
	public void fireWeb() {
		System.out.println("거미줄 발사!");
	}
}

