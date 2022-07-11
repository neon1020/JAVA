package switch_case;

public class Test2 {

	public static void main(String[] args) {
		// 정수형 등급에 따른 할인 금액 계산
		// 등급 (grade) : 1 (일반회원), 2 (VIP회원), 3 (VVIP회원)
		// 할인율 (fee) : 5% / 15% / 30%
		// if문과 switch문 사용. 출력 : 결제 금액 : xxx원
		// 회원 등급 아닐 경우 "회원 등급 오류!" 출력
		
		int grade = 1, price = 10000;
		double fee = 0;
		
		if (grade >= 1 && grade <= 3) {
			
			switch (grade) {
			case 1:
				fee = 0.95;
				break;
			case 2:
				fee = 0.85;
				break;
			case 3:
				fee = 0.7;
				break;
			}
			System.out.println("결제 금액 : " + (price * fee) + "원");
		} else {
			System.out.println("회원 등급 오류!");
				}

	}

}
