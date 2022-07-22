package constructor;

class Account2 {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account2() {
		this.accountNo = "111-1111-111";
		this.ownerName = "홍길동";
		this.balance = 0;
	}

	public Account2(String accountNo) {
		this.accountNo = accountNo;
		this.ownerName = "홍길동";
		this.balance = 0;
	}

	public Account2(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = 0;
	}

	public Account2(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + this.accountNo);
		System.out.println("예금주명 : " + this.ownerName);
		System.out.println("현재잔고 : " + this.balance);
	}
}

public class Test2 {

	public static void main(String[] args) {
		Account2 ac = new Account2();
		ac.showAccountInfo();
		System.out.println("--------------------------------");
		
		Account2 ac2 = new Account2("222-2222-222");
		ac2.showAccountInfo();
		System.out.println("--------------------------------");
		
		Account2 ac3 = new Account2("333-3333-333", "강감찬");
		ac3.showAccountInfo();
		System.out.println("--------------------------------");
		
		Account2 ac4 = new Account2("444-4444-444", "이순신", 100000);
		ac4.showAccountInfo();
		System.out.println("--------------------------------");
	}

}
