package interface_;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 인터페이스 필요성(장점)
		 * 4. 모듈간 독립적 프로그래밍으로 인한 개발 기간 단축
		 * 
		 * */
		
		// 개발자 코드 동작 확인
		// => 디자이너측에서 생성하여 전달할 아이디, 패스워드를 임의로 입력하여 확인
		DeveloperLogin dl = new DeveloperLogin();
		String result = dl.login("admin", "1234");
		System.out.println("로그인 결과 : " + result);
		
		System.out.println("--------------------------------");
		
		// 디자이너 코드 동작 확인
		// => 개발자측에 아이디, 패스워드를 전달하고 리턴값을 리턴받아 확인
		DesignerLogin dl2 = new DesignerLogin();
		dl2.inputLoginInfo();
	}

}

// 개발자와 디자이너가 수행해야하는 작업들의 공통 부분을 추상메소드로 정의하여
// 기본적인 틀을 제시하면 개발자와 디자이너는 각각 별도로 독립된 작업 수행이 가능하다!
interface LoginInterface {
	public String login(String id, String password);
}


// 개발자가 수행해야하는 로그인 처리 작업
// => 공통 인터페이스를 상속받아 추상메소드를 구현하여 로그인 작업 수행 가능
// 이때, 디자이너쪽에서 넘어올 데이터는 임의의 데이터로 대체 가능(테스트)
// 상호간에 사용할 파라미터를 미리 매개변수로 정했기 때문
class DeveloperLogin implements LoginInterface {
	
	@Override
	public String login(String id, String password) {
		System.out.println("아이디 : " + id);
		System.out.println("패스워드 : " + password);
		
		String result = "";
		if(id.equals("admin") && password.equals("1234")) {
			result = "로그인 성공";
		} else {
			result = "로그인 실패";
		}
		return result;
	}
}


// 디자이너가 수행해야하는 로그인 정보 전달 및 전달 후 결과 처리 작업
// 개발자측에 전달할 데이터(아이디, 패스워드)를 생성하여
// 공통 추상메소드를 구현하여 파라미터로 전달했을 때 데이터가 잘 전달되었는지 확인하고,
// 리턴되는 결과값을 임의로 설정하여 리턴 후 리턴된 데이터를 확인
class DesignerLogin implements LoginInterface {
	@Override
	public String login(String id, String password) {
		
		// 실제로는 개발자가 구현할 메소드
		// 개발자와 별개로 독립적인 작업을 위해 공통 메소드를 임시로 구현하여
		// 개발자 입장에서 처리할 코드는 생략하고
		// 디자이너가 전달하는 데이터가 잘 전달되는지만 확인
		System.out.println("로그인 정보 파라미터 확인");
		System.out.println("아이디 : " + id);
		System.out.println("패스워드 : " + password);
		return "로그인 성공!";
	}
	
	// 디자이너가 외부로부터 아이디, 패스워드를 생성하여 개발자에게 넘겨줄 메소드 정의
	public void inputLoginInfo() {
		
		// 임의의 로그인 정보를 입력받았다고 가정
		String id ="admin";
		String password = "1234";
		
		// 공통 메소드인 login() 메소드를 호출하여 파라미터가 잘 전달되었는지 확인하고
		// login() 메소드에 임의의 리턴값을 설정하여 리턴된 데이터가 잘 출력되는지 확인
		String result = login(id, password);
		System.out.println("결과 : " + result);
	}
}