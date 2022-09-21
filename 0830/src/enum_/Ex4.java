package enum_;

import java.util.Scanner;

enum PayType {
	ACCOUNT_TRANSFER("계좌이체"),
	REMITTANCE("무통장입금"),
	ON_SITE_PAYMENT("현장결제"),
	TOSS("토스"),
	PAYCO("페이코"),
	CARD("신용카드"),
	KAKAO_PAY("카카오페이"),
	BAEMIN_PAY("배민페이"),
	POINT("포인트"),
	COUPON("쿠폰");
	
	String title;

	private PayType(String title) {
		this.title = title;
	}
}

enum PayGroup {
	CASH("현금", new PayType[] {PayType.ACCOUNT_TRANSFER, PayType.REMITTANCE, PayType.ON_SITE_PAYMENT, PayType.TOSS}),
	CARD("카드", new PayType[] {PayType.PAYCO, PayType.PAYCO, PayType.CARD, PayType.KAKAO_PAY}),
	ETC("기타", new PayType[] {PayType.POINT, PayType.COUPON}),
	EMPTY("없음", new PayType[] {});
	
	private String title;
	private PayType[] payTypes;

	private PayGroup(String title, PayType[] payTypes) {
		this.title = title;
		this.payTypes = payTypes;
	}

	public String getTitle() {
		return title;
	}
	
	// ------------------------------------------------------------------------
	
	// 문자열("계좌이체") 를 전달받아 해당되는 PayGroup을 리턴하는 findByPayType() 메소드 정의
	public static PayGroup findByPayType(String data) {
		PayGroup pg = PayGroup.EMPTY;
		PayGroup[] PG = new PayGroup[] {CASH, CARD, ETC};
		
		for(int i = 0; i < PG.length; i++) {
			PayGroup p = PG[i];
			for(int j = 0; j < p.payTypes.length; j++) {
				if (data.equals(p.payTypes[j].title)) {
					pg = p;
				} 
			}
		}
		
		// 향상된 for문
		for(PayGroup pgs : PayGroup.values()) {
			for(PayType p : pgs.payTypes) {
				if(p.title.equals(data))
				return pgs;
			}
		}
		return pg;
	}
}

// --------------------------------------------------------------------------

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
//		System.out.println(data);
		
		// ex) data : 계좌이체 , pg: CASH (enum 타입)
		PayGroup pg = PayGroup.findByPayType(data);
		switch (pg) {
		case CASH:
			System.out.println("현금 결제");
			break;
		case CARD:
			System.out.println("카드 결제");
			break;
		case ETC:
			System.out.println("기타 결제");
			break;
		case EMPTY:
			System.out.println(pg.getTitle());
			System.out.println("존재하지 않는 결제 코드 입니다.");
			System.out.println("에러 처리 로직으로 이동");
			break;
		default:
			break;
		}
	}

}
