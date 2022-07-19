package oop;

// 한 파일 내에 public 클래스 2개 올 수 없음
// 파일명과 같은 클래스(Test1)만 public 가질 수 있음
class Account {
	String accountNo;
	String ownerName;
	int balance;
}

public class Test1 {

	public static void main(String[] args) {
		Account a = new Account();
		a.accountNo = "111-1111-111";
		a.ownerName = "홍길동";
		a.balance = 100000;
		
		System.out.println("계좌번호 : " + a.accountNo);
		System.out.println("예금주명 : " + a.ownerName);
		System.out.println("현재잔고 : " + a.balance);
		
	}

}
