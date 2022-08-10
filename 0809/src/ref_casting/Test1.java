package ref_casting;

public class Test1 {

	public static void main(String[] args) {
		전화기 j1 = new 전화기();
		j1.전화();
		System.out.println("------------------------");
		
		// 업캐스팅
		전화기 j2 = new 핸드폰();
		j2.전화();
		
		// 다운캐스팅
		핸드폰 h = (핸드폰)j2;
		h.전화();
		h.문자();
		System.out.println("------------------------");
		
		// 업캐스팅
		전화기 j3 = new 스마트폰();
		j3.전화();
		
		// 다운캐스팅
		스마트폰 s = (스마트폰)j3;
		s.전화();
		s.문자();
		s.카톡();
		System.out.println("------------------------");
		
		// 업캐스팅
		핸드폰 h1 = new 스마트폰();
		h1.전화();
		h1.문자();
		
		// 다운캐스팅
		스마트폰 s1 = (스마트폰)h1;
		s1.전화();
		s1.문자();
		s1.카톡();
		
	}

}

class 전화기 {
	public void 전화() {
		System.out.println("전화 걸기!");
	}
}

class 핸드폰 extends 전화기 {
	public void 문자() {
		System.out.println("문자 전송!");
	}
}

class 스마트폰 extends 핸드폰 {
	public void 카톡() {
		System.out.println("카톡 메세지 전송!");
	}
}