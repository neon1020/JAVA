package escape;

public class Escape {

	public static void main(String[] args) {
		/*
		 * 이스케이프(escape)
		 * - 문법적인 역할에서 도망(escape) 한다는 의미
		 * - \ 다음은 무조건 문자로 인식
		 * 
		 * \n: 줄바꿈 이라는 의미
		 * \t: tab만큼 간격을 띄우는 기능
		 * */
//		System.out.println('');	// 오류! 공백이라도 문자 하나가 와야됨
		
		
		System.out.println('햄');
		System.out.println("햄스터");
//		System.out.println('햄스터'); 오류!
		System.out.println("햄");
		System.out.println("");
		
		System.out.println("햄" + "스터");
		System.out.println(1 + 1); // 2
		System.out.println("1" + "1"); // 11
		
		System.out.println("선생님이 말했다 \"아! 자바 재밌다\"");
		System.out.println("선생님이 말했다\n \"아! 자바 재밌다\"");
		
		System.out.print("햄");
		System.out.print("스터");
		System.out.println();
		
		System.out.println("영어\t국어\t수학");
		System.out.println("90\t80\t70");
		

	}

}
