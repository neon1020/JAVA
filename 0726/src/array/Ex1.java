package array;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		// ArrayList : 배열의 확장이 가능한 객체
		
		// <> 안에는 데이터 타입 지정 (안해도 됨!)
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("홍길동");
		arr.add("이순신");
		arr.add("강감찬");
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		arr.add("소지섭");
		arr.add("김태희");
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		// <> 사이에는 기본데이터 타입(ex int) 올 수 없다! 클래스만 올 수 있음
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		// Wrapper 클래스
		// byte => Byte
		// short => Short
		// int => Integer
		// long => Long
		// float => Float
		// double => Double
		// char => Character
		// boolean => Boolean
		
	}

}
