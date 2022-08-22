package access_modifier;

public class ParentClass {
	public int publicVar;			// 모든 클래스
	protected int protectedVar;		// 같은 패키지 또는 다른 패키지이면서 상속 관계의 서브클래스만 접근 가능
	int defaultVar;					// 같은 패키지
	private int privateVar;			// 자신의 클래스에서만 가능
	
	public void useMember() {
		this.publicVar = 10; 	// (O)
		this.protectedVar = 20;	// (O)
		this.defaultVar = 30;	// (O)
		this.privateVar = 40;	// (O)
	}
}
