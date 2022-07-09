package variable;

public class CharType {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		
		char ch2 = 65; // 아스키코드 65 = A
		System.out.println(ch2);
		
		char ch3 = '\u0041';	// 유니코드 'A'
		System.out.println(ch3);
		
		char ch4 = '\uAC00';	// 유니코드 '가'
		System.out.println(ch4);
		
		char ch5 = '\'';   // ' 이스케이핑
		System.out.println(ch5);

	}

}
