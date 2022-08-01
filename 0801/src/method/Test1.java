package method;

// 은행계좌(Account) 클래스 정의

class Account {
	
	// 멤버변수는 private로 선언!
	private String accountNo;
	private String ownerName;
	private int balance;
	
	// Getter / Setter 메소드 정의
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("입금할 금액 : " + amount + "원");
		System.out.println("입금 후 현재 잔고 : " + balance + "원");
	}
	
	
}

public class Test1 {

	public static void main(String[] args) {
		Account a = new Account();
		
		// Setter 메소드 호출
		a.setAccountNo("123-1234-123");
		a.setOwnerName("정채연");
		
		// Getter 메소드 호출
		System.out.println("계좌번호 : " + a.getAccountNo());
		System.out.println("예금주명 : " + a.getOwnerName());
		System.out.println("현재잔고 : " + a.getBalance());
		
		// deposit 메소드 호출
		a.deposit(10000);
		
		
	}

}
