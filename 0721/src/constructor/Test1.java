package constructor;

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		this.accountNo = "333-333-3333";
		this.ownerName = "홍길동";
		this.balance = 300000;
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		System.out.println("this : " + this); // 객체의 힙 주소가 리턴됨
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Account ac = new Account("123-123-1234", "정채연", 100000);
		System.out.println(ac);
		System.out.println("계좌번호 : " + ac.accountNo);
		System.out.println("예금주명 : " + ac.ownerName);
		System.out.println("현재잔고 : " + ac.balance);
		System.out.println("---------------------------------");
		
		Account ac2 = new Account("222-222-1111", "이순신", 200000);
		System.out.println(ac2);
		System.out.println("계좌번호 : " + ac2.accountNo);
		System.out.println("예금주명 : " + ac2.ownerName);
		System.out.println("현재잔고 : " + ac2.balance);
		System.out.println("---------------------------------");
		
		Account ac3 = new Account();
		System.out.println("계좌번호 : " + ac3.accountNo);
		System.out.println("예금주명 : " + ac3.ownerName);
		System.out.println("현재잔고 : " + ac3.balance);
	}
}
