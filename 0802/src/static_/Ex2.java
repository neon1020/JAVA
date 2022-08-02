package static_;

class VariableEx {
	
	// 멤버 변수 선언
	String instanceMember = "인스턴스 멤버 변수";
	String instanceMember2;	// 초기화하지 않을경우 기본값 (null)으로 자동 초기화됨
	static String classMember = "클래스 멤버 변수";
	
	// 멤버 메소드 정의
	public void instanceMethod(String parameterVariable) {
		
		String localVariable = "로컬 변수";
		
		// 각 변수에 접근
		System.out.println(instanceMember);
		System.out.println(classMember);
		
		System.out.println(parameterVariable);
		System.out.println(localVariable);
	}
	
	public void instanceMethod2() {
		
		// 각 변수에 접근
		System.out.println(instanceMember);
		System.out.println(classMember);
		
//		System.out.println(parameterVariable); 로컬 변수는 사용할 수 없다!
//		System.out.println(localVariable);
	}
	
}

public class Ex2 {

	public static void main(String[] args) {
		
		VariableEx ve = new VariableEx();
		System.out.println(ve.instanceMember);
		
		// 클래스 변수도 동일한 방법으로 접근 가능
		System.out.println(ve.classMember);
		
		// 객체로 접근하기 보다는 클래스명으로 접근하는것이 올바른 방법!
		System.out.println(VariableEx.classMember);
		
	}

}
