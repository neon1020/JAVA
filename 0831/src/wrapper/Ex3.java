package wrapper;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 문자열 -> 기본 데이터로 변환
		 * - 주로 웹의 <form> 태그나 GUI 환경에서 데이터를 입력받았을 때
		 *   수치 데이터를 입력하더라도 모두 문자열로 취급됨
		 *   (ex. request.getParameter(str) -> 문자열로된 정수를 int형 정수로 변환 필요)
		 *   
		 * - 따라서, 해당 문자열을 실제 연산을 위해 수치데이터 등의
		 *   기본 데이터타입으로 변환하려면 Wrapper 클래스에서 제공하는 메소드를 통해
		 *   해당 타입으로 변환해야한다!
		 *   
		 * Wrapper클래스명.parseXXX(문자열변수 또는 리터럴);
		 * => XXX은 자바의 기본데이터타입 이름
		 * => ex) 정수형으로 변환할 경우 : Integer.parseInt("100")
		 * 		  실수형으로 변환할 경우 : Double.parseDouble("3.14")
		 * */
		
		String strNum = "3.14";
		System.out.println(strNum + 10); // 문자열 데이터이므로 결합연산으로 동작함 ("3.1410")
		System.out.println("---------------------------");
		double dNum = Double.parseDouble(strNum);
		System.out.println(dNum);
		System.out.println(dNum + 10);
		
		System.out.println("--------------------------");
		
		int num2 = Integer.parseInt(strNum);
		
	}

}
