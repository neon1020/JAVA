package variable;

public class Print {

	public static void main(String[] args) {
		/*
		 * < print(), println(), printf() >
		 * 1. print() 와 println() 은 출력 후 줄바꿈 여부의 차이
		 * => print() 메서드는 아무 데이터도 없으면 출력 불가능(println은 줄바꿈 기능 있어 가능)
		 * 
		 * 2. printf()
		 * 		- 출력할 형식을 미리 지정하여 원하는 형태로 데이터 출력
		 * 		  (printf() 메서드의 'f'는 format의 약자)
		 * 		- 출력할 형식은 "" 큰 따옴표 안에 형식 지정문자를 사용하여 형식을 지정한뒤
		 * 		  큰 따옴표("") 우측에 콤마(,)를 붙이고 실제 데이터를 작성
		 * */
		
		// %d 숫자 , %s 문자
		System.out.printf("%d \n", 12345);
		
		String s1 = "JAVA";
		String s2 = "프로그래밍";
		System.out.println(s1 + " " + s2);
		System.out.printf("%s %s", s1, s2);
		System.out.println();
		
		String name = "정채연";
		int age = 28;
		System.out.printf("안녕하세요 제 이름은 %s 입니다. \n 제 나이는 %d세 입니다.", name, age);
		System.out.println();
		System.out.println("===============================");
		
		System.out.println("안녕하세요 제 이름은 " + name + " 입니다. ");
		System.out.println(" 제 나이는 " + age + "세 입니다.");
		
		System.out.println("안녕하세요 제 이름은 " + name + "입니다. \n 제 나이는 " + age + "세 입니다.");
		

	}

}
