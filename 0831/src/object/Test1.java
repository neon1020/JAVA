package object;

public class Test1 {

	public static void main(String[] args) {
		Account acc1 = new Account("홍길동", "111-1111-1111", 1000);
		Account acc2 = new Account("홍길동", "111-1111-1111", 1000);
		Account acc3 = new Account("이순신", "222-2222-2222", 1000);
		
		// "두 계좌는 동일!" 이 실행되도록 수정
		acc1.equals(acc2);
		acc1.equals(acc3);
		
		// 멤버변수의 값이 출력되도록 수정
		System.out.println(acc1.toString());
		
		
	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// Alt + Shift + S => H
	// equals() 메서드 오버라이딩 : 모든 멤버변수 값이 같을 경우 true 리턴
	@Override
	public boolean equals(Object obj) {
		Account a = (Account)obj;
		if(this.accountNo.equals(a.accountNo) && this.ownerName.equals(a.ownerName) && this.balance == a.balance) {
			System.out.println("두 계좌는 동일!");
			return true;
		} else {
			System.out.println("두 계좌는 다름!");
			return false;
		}
	}
	
	// Alt + Shift + S => S
	// toString() 메서드 오버라이딩 : 모든 멤버변수 정보를 String 타입으로 리턴
	@Override
	public String toString() {
		return "계좌번호 : " + this.accountNo + ", 예금주명 : " + this.ownerName + ", 현재잔고 : " + this.balance;
	}
}