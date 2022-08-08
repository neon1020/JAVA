package inheritance;

public class Test2 {

	public static void main(String[] args) {
		ItwillBank2 ib = new ItwillBank2("111-2222-333", "이감자", 50000, 1);
		
		System.out.println("--------- 입금 ----------");
		ib.deposit(20000);
		System.out.println();
		
		System.out.println("--------- 출금 ----------");
		System.out.println("출금된 금액 : " + ib.withdraw(100000) + "원");
		System.out.println();
		
		System.out.println("-------------------------");
		ib.showAccountInfo();
		
		
		System.out.println("-------------------------");
		System.out.println();
		ItwillBank2 ib2 = new ItwillBank2("111-2222-333", "김둘기", 30000, 0);
		
		System.out.println("--------- 입금 ----------");
		ib2.deposit(20000);
		System.out.println();
		
		System.out.println("--------- 출금 ----------");
		System.out.println("출금된 금액 : " + ib2.withdraw(100000) + "원");
		System.out.println();
		
		System.out.println("-------------------------");
		ib2.showAccountInfo();
	}

}


class Account2 {
	String accountNo;
	String ownerName;
	int balance;
	
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
	
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	public int withdraw(int amount) {
		if (balance >= amount) {
			this.balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 현재 잔고 : " + balance + "원");
			return amount;
		} else {
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("잔고 부족으로 출금 불가능!");
			return 0;
		}
	}
}


class ItwillBank2 extends Account2 {
	// 0 : 일반회원, 1 : VIP 회원
	int grade;

	public ItwillBank2(String accountNo, String ownerName, int balance, int grade) {
		super(accountNo, ownerName, balance);
		this.grade = grade;
	}
	
	// VIP 회원에게 마이너스 통장 기능 제공
	@Override
	public int withdraw(int amount) {
		if(this.grade == 1) {
			this.balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 현재 잔고 : " + balance + "원");
			return amount;
		} else {
			// super.withdraw(amount)의 리턴값을 리턴
			return super.withdraw(amount);
		}
	}
}