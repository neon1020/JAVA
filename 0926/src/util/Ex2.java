package util;

import java.util.Date;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * java.util.Date 클래스
		 * - 날짜 관련 기능을 제공하는 클래스 (시간 정보 포함)
		 * 
		 * - 대부분의 메소드가 deprecated 처리되어있음
		 *   => 그러나, 다양한 API 들은 여전히 Date 타입을 사용하는 경우가 많음
		 *   
		 * - toString() 메소드가 오버라이딩 되어 있음
		 *   => 날짜 및 시간 정보를 문자열로 리턴해줌(영어권 표현 방식)
		 *   
		 * - 기본 생성자를 호출하여 인스턴스 생성하면 시스템의 날짜 및 시간 정보를 사용하여
		 *   Date 객체를 생성 후 리턴  
		 * */
		
		Date d1 = new Date();
		System.out.println(d1); // toString 오버라이딩
		// Mon Sep 26 15:31:34 KST 2022 출력
		
		// long 타입 파라미터 전달 받는 생성자 호출
		// 기준 날짜 및 시간으로부터 해당 long 타입 값(ms : 밀리초) 만큼 뒤의 날짜 및 시간으로 설정
		Date d2 = new Date(2000000000000L);
		System.out.println(d2);
		
		// 최근에는 사용하지 않는 방법
		// Date d3 = new Date(2000, 6, 5);
		// System.out.println(d3);
		
		// 1900년이 기준이 되어 현재 연도에서 뺀 값을 리턴
		System.out.println(d1.getYear() + 1900 + "년");
		
		// 시스템상에서 0 ~ 11월 형태로 사용하므로 + 1 이 필수!
		System.out.println(d1.getMonth() + 1 + "월");
		
		// 날짜
		System.out.println(d1.getDate() + "일");
		
		// 요일 정보를 정수로 리턴 (0 : 일요일, 6 : 토요일)
		System.out.println(d1.getDay() + "일");
		
		System.out.println("--------------------------------------");
		
		long diffDate = d1.getTime() - d2.getTime();
		System.out.println(diffDate); // 음수 리턴되므로 d2가 더 미래 날짜
		
		// ex) 일 단위로 변경 [ 밀리초 -> 초 -> 분 -> 시 -> 일 ] 순서로 변경
		//					=> / 1000 (밀리초>초) / 60(초>분) / 60(분>시간) / 24(시간>일)
		
		if(diffDate < 0) { // d2가 미래
			System.out.println(Math.abs(diffDate / 1000 / 60 / 60 / 24) + "일 남았습니다.");
		} else if(diffDate > 0) { // d2가 과거
			System.out.println(Math.abs(diffDate / 1000 / 60 / 60 / 24) + "일 지났습니다.");
		} else { // 현재
			System.out.println("오늘입니다!");
		}
	}

}
