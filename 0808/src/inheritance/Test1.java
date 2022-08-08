package inheritance;

public class Test1 {

	public static void main(String[] args) {
		ItwillBank IB = new ItwillBank();
		
		IB.accountNo = "123-1234-333";
		IB.ownerName = "정채연";
		IB.balance = 100000;
		
		IB.deposit(50000);
		System.out.println();
		
		System.out.println("출금된 금액 : " + IB.withdraw(30000) + "원");
		System.out.println();
		
		IB.showAccountInfo();
		System.out.println();
		
		IB.contract("IB보험");
	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	// 멤버 정보를 출력하는 showAccountInfo() 메소드
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
	// 입금 (전달받은 입금금액(amount)을 현재잔고 balance에 누적) deposit() 메소드
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + this.balance + "원");
	}
	
	// 출금 (매개변수 금액을 전달받아, 금액만큼 리턴) withdraw() 메소드
	public int withdraw(int amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 잔고 : " + this.balance + "원");
			return amount;
		} else {
			System.out.println("출금할 금액 : " + amount);
			System.out.println("잔고 부족으로 출금 불가!");
			return 0;
		}
	}
}


/* Account 클래스를 상속받은 ItwillBank 클래스 정의
 * => 은행계좌 기본기능 + 보험관리 기능 추가
 * - 멤버변수 : 보험명(insureName, 문자열)
 * - 메소드 : contract() 메소드 (파라미터 보험명(insureName), 리턴값 없음)
 * 			=> 전달받은 보험명을 멤버변수에 저장하고
 *   		   "계약하신 보험명 : XXX 보험" 출력
 * */
class ItwillBank extends Account {
	String insureName;
	
	public void contract(String insureName) {
		this.insureName = insureName;
		System.out.println("계약하신 보험명 : " + insureName);
	}
}
