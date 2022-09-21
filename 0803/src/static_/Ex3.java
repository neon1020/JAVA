package static_;

public class Ex3 {

	public static void main(String[] args) {
		Hero2 h = new Hero2();
		h.setJob("전사");
		
		// ---------- 아이템 장착 전 -----------
		System.out.println(h.getLeft());
		
		
		// ---------- 아이템 장착 후 -----------
		Sword sword1 = new Sword();
		sword1.damege = 100;
		
		h.setLeft(sword1);
		System.out.println(h.getLeft().damege);
		
		System.out.println("------------------------");
		
		Sword sword2 = new Sword();
		sword2.damege = 1000000;
		
		h.setLeft(sword2);
		System.out.println(h.getLeft().damege);
		
	}

}

class Hero2 {
	// 멤버변수
	private String job;
	private int hp;
	private int mp;
	private Sword left;
	private Shield right;
	
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	// ------------------------------------
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	// ------------------------------------
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	// ------------------------------------
	
	public Sword getLeft() {
		return left;
	}
	
	// 왼손에는 칼 타입( = 데이터 타입, 클래스)만 장착 가능!
	public void setLeft(Sword left) {
		this.left = left;
	}
	
	// ------------------------------------
	
	public Shield getRight() {
		return right;
	}
	
	// 오른손에는 방패 타입( = 데이터 타입, 클래스)만 장착 가능!
	public void setRight(Shield right) {
		this.right = right;
	}
	
}


class Sword {
	int damege;	
}

class Shield {
	int armor;
}
