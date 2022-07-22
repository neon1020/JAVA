package constructor;

class Account3 {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account3() {
		this("999-9999-999", "비둘기", 100000);
	}
	
	public Account3(String accountNo) {
		this(accountNo, "홍길동", 0);
	}
	
	public Account3(String accountNo, String ownerName) {
		this(accountNo, ownerName, 0);
	}
	
	// 모든 멤버변수의 초기화를 담당하는 생성자
	public Account3(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showInfo() {
		System.out.println("계좌번호 : " + this.accountNo);
		System.out.println("예금주명 : " + this.ownerName);
		System.out.println("현재잔고 : " + this.balance);
	}
}


public class Test3 {

	public static void main(String[] args) {
		
		Account3 ac1 = new Account3();
		ac1.showInfo();
		System.out.println("---------------------");
		
		Account3 ac2 = new Account3("111-1111-111");
		ac2.showInfo();
		System.out.println("---------------------");
		
		Account3 ac3 = new Account3("222-2222-222", "이순신");
		ac3.showInfo();
		System.out.println("---------------------");
		
		Account3 ac4 = new Account3("333-3333-333", "강감찬", 200000);
		ac4.showInfo();
		System.out.println("---------------------");
		
	}

}
