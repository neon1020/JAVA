package covariant;

public class Ex2 {

	public static void main(String[] args) {
		Customer cus = new Customer();
		VipCustomer vip = new VipCustomer();
		
		Employee emp = new Employee();
		VipEmployee vipEmp = new VipEmployee();
		
		// 1. 공변 리턴 타입 적용 X
		cus.setAcc(emp.getAccount()); // 일반고객이 일반계좌 개설
		vip.setItwillBank((ItwillBank)vipEmp.getAccount()); // 타입 불일치이므로 다운캐스팅 필요!
		
		// 2. 공변 리턴 타입 적용 O
		vip.setItwillBank(vipEmp.getAccount());
	}

}

class Customer {
	private Account acc;
	private int money;
	String name;
	
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
}

class VipCustomer extends Customer {
	private int grade;
	private ItwillBank itwillBank;
	
	public ItwillBank getItwillBank() {
		return itwillBank;
	}
	public void setItwillBank(ItwillBank itwillBank) {
		this.itwillBank = itwillBank;
	}
}

// 일반 직원
class Employee {
	// 일반 계좌 개설
	public Account getAccount() {
		return new Account();
	}
}

// VIT 직원
class VipEmployee extends Employee {
	
//	// 1. 공변 리턴 타입 적용 안 된 것
//	@Override
//	public Account getAccount() {
//		return new ItwillBank();
//	}
	
// 2. 공변 리턴 타입 적용 된 것
	@Override
	public ItwillBank getAccount() {
		return new ItwillBank();
	}
}

class Account {
	
}

class ItwillBank extends Account {
	
}