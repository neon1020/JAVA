package JAVA0701;

public class Ex01 {

	public static void main(String[] args) {
		// main 메소드 추가 까먹었을 경우 main + ctrl + space 로 수동 추가 가능
		
		/*
		 * 주석 (Comment)
		 * - 비실행문으로, 자바 프로그램 컴파일(번역) 대상에서 제외되는 문장
		 * - 주 용도 : 프로그램 코드에 대한 설명문 등을 작성
		 * 
		 * 1. 라인 주석 = 단일 주석 = 한 줄 주석 => // 기호 사용
		 * 		- // 기호 뒤의 문장 한 줄을 주석으로 처리
		 * 		- 주석 설정 단축키 : 주석 처리할 문장에 커서를 위치한 후
		 * 							Ctrl + Shift + C 또는 Ctrl + /
		 * 		- 주석 해제 단축키도 설정과 동일함
		 * 		- 여러 줄 주석 처리에도 활용 가능 (여러 줄 블럭 지정 후 주석처리)
		 * 
		 * 2. 범위 주석 = 블록 주석 /*  */
		 /* 	- 주석 기호 사이에 오는 모든 문장들은 주석처리
		  * 	- 여러 줄에 걸쳐서 모든 범위를 지정할 수도 있다.
		  * 	- 주석 설정 단축키 : 주석 처리할 블록을 정확히 지정한 후
		  * 						Ctrl + Shift + /
		  * 						=> 문장 위치가 자동 조절되므로 단축키 사용 비추천
		  * 	- 주석 해제 단축키 : 주석 처리할 블록을 정확히 지정한 후
		  * 						Ctrl + Shift + \	
		  * 
		  * */
		
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		
		
		/*
		 * 이스케이프(escape)
		 * - 문법적인 역할에서 도망(escape) 한다는 의미
		 * - \ 다음은 무조건 문자로 인식
		 * 
		 * \n: 줄바꿈
		 * \t: tab만큼 간격을 띄우기
		 * */
//		System.out.println('');	// '' 안에는 공백 포함 문자 하나 무조건 들어가야함
		System.out.println('햄');
		System.out.println("햄스터");
//		System.out.println('햄스터'); 에러
		System.out.println("가");
		System.out.println(""); //""는 아무것도 안 넣기 가능
		
		System.out.println("햄" + "스터");
		System.out.println(1 + 1); //2
		System.out.println("1" + "1"); //11
		
		System.out.println("선생님이 말했다 \"아! 자바 재밌다\"");
		System.out.println("선생님이 말했다\n \"아! 자바 재밌다\"");
		
		System.out.print("햄");
		System.out.print("스터");
		System.out.println();
		
		System.out.println("영어\t국어\t수학");
		System.out.println("90\t80\t70");

	}

}
