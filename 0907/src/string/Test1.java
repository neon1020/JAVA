package string;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 주민등록번호(jumin)를 문자열로 입력받아 성별(남 또는 여) 판별
		 * 입력 형식 : "XXXXXX-XXXXXXX"
		 * 판별 조건
		 * 1) 뒷자리 첫번째 숫자가 1 또는 3: "남성" 출력
		 * 2) 뒷자리 첫번째 숫자가 2 또는 4: "여성" 출력
		 * 3) 뒷자리 첫번째 숫자가 5 또는 6: "외국인" 출력
		 * 4) 나머지: "괴물" 출력 
		 * */
		
		String jumin = "800101-3712112";
		
		// char gender = jumin.charAt(7);
		// System.out.println(gender);
		
		// "-" 기준으로 문자열 나눈 후 뒷자리만 구하기
		switch (jumin.split("-")[1].charAt(0)) { // 뒷자리 첫번째
		case '1': case '3': System.out.println("남성"); break;
		case '2': case '4': System.out.println("여성"); break;
		case '5': case '6': System.out.println("외국인"); break;	
		default: System.out.println("괴물");
			break;
		}
		
		// ------------------------------------------------------
		
		// 주소만 출력
		String data1 = "Address:부산광역시 부산진구 동천로:109"; 
		System.out.println(data1.substring(data1.indexOf(":") + 1));
		
		// 이름만 출력
		String data2 = "이름: 홍길동, 나이: 20"; 
		System.out.println(data2.substring(4, 7));
		System.out.println(data2.split(",")[0].split(":")[1].trim());
		
		// 주소만 출력
		String data3 = "Address:서울특별시 용산구 24번길, 210동 702호,Tel:0518030909"; 
		System.out.println(data3.substring(data3.indexOf(":") + 1, data3.lastIndexOf(",")));
		
		// 주소, 층, 전화번호만 출력
		String data4 = "Address:부산광역시 부산진구 동천로109,Floor:7층,Tel:051-803-0909"; 
		for(String s : data4.split(",")) {
			System.out.println(s.split(":")[1].replace("-", "").trim());
		}
	}

}
