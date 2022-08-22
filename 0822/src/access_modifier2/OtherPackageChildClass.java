package access_modifier2;

import access_modifier.ParentClass;

public class OtherPackageChildClass extends ParentClass {
	// 패키지가 다르고 상속 관계에 있는 서브클래스에서의 접근 범위
	public void useMember() {
		// 부모 클래스 멤버 접근 시 protected까지 접근 가능
		// super 또는 this로 접근
		this.publicVar = 10;	// (O) - 누구나 접근 가능
		this.protectedVar = 20;	// (O) - 다른 패키지이지만 상속 관계이므로 접근 가능
//		this.defaultVar = 30;	// (X) - 다른 패키지이므로 접근 불가
//		this.privateVar = 40;	// (X) - 다른 클래스에서 접근 불가
		
		// 객체 생성해서 접근시 public 밖에 쓸 수 없음 (상속 관계로서 사용하는 게 아님)
		ParentClass p = new ParentClass();
		p.publicVar = 10;		// (O) - 누구나 접근 가능
//		p.protectedVar = 20;	// (X) - 다른 패키지이고 상속 관계가 아니므로 접근 불가
//		p.defaultVar = 30;		// (X) - 다른 패키지이므로 접근 불가
//		p.privateVar = 40;		// (X) - 다른 클래스에서 접근 불가
	}
}