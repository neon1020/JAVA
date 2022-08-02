package static_;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * static 메소드(= 정적 메소드)
		 * 
		 * < 주의사항 >
		 * 1. static 메소드 내에서는 인스턴스 멤버변수에 접근 불가
		 *    => static 메소드가 로딩되는 시점에서는 인스턴스가 생성되기 전이므로
		 *    	 인스턴스 멤버변수도 로딩되지 않은 상태이다!
		 *    	 따라서, static 메소드 호출 시점에 인스턴스 멤버변수가 존재하지 않을 수 있다!
		 *    
		 * 2. static 메소드 내에서 this, super 사용 불가
		 *    => static 메소드가 로딩되는 시점은 인스턴스 생생 전이므로
		 *    	 인스턴스 주소가 저장되는 레퍼런스 this와 super는 존재하지 않음(생성 전)
		 * 
		 * 3. static 메소드 내에서 일반 메소드 호출 불가
		 * 	  => 사유 동일
		 *    => static 메소드만 호출 가능
		 *    
		 * << 결론! static 메소드 내에서는 static 멤버(변수, 메소드)만 접근 가능하다! >>   
		 * */
		
		StaticMethod sm = new StaticMethod();
		sm.normalMethod();
		sm.staticMethod();
		
		System.out.println("--------------------------------------");
		
		// 클래스명으로 접근
		StaticMethod.setStaticVar(99);
	}

}

class StaticMethod {
	
	private int normalVar = 10;
	private static int staticVar = 20;
	
	public void normalMethod() {
		System.out.println("일반 메소드!");
		System.out.println("일반 메소드에서 인스턴스 변수 접근 : " + normalVar);
		System.out.println("일반 메소드에서 static 변수 접근 : " + staticVar);
	}
	
	public static void staticMethod() {
		System.out.println("static 메소드!");
//		System.out.println("static 메소드에서 인스턴스 변수 접근 : " + normalVar); 불가능!
		System.out.println("static 메소드에서 static 변수 접근 : " + staticVar);
	}
	
	// normalVar 변수에 대한 Setter 정의
	public void setNormalVar(int normalVar) {
		this.normalVar = normalVar;
	}
	
	// staticVar 변수에 대한 Setter 정의
	public static void setStaticVar(int staticVar) {
		// this : 자신의 인스턴스 주소 저장하는 참조변수
//		this.staticVar = staticVar;		(static 메소드 내에서 this 사용 불가)
		StaticMethod.staticVar = staticVar; // this 대신 클래스명으로 접근해서 멤버변수 지정 가능
		
		// static 메소드 내에서 static 메소드 호출 가능
		staticMethod();
//		normalMethod(); 일반 메소드 호출 불가!
	}
}