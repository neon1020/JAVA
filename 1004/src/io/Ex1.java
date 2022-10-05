package io;

import java.io.IOException;
import java.io.InputStream;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 자바 I/O(Input/Output)
		 * 
		 * - java.io 패키지에 있는 클래스들의 모음
		 * - 자바에서 각종 입출력을 담당
		 * 
		 * - Node(노드) : 자바에서 입출력을 수행하는 대상
		 * 				(입력 노드 : 키보드, 마우스, 파일, 네트워크, 데이터베이스 등)
		 * 				(출력 노드 : 모니터, 스피커, 파일, 네트워크, 데이터베이스 등) 
		 * 
		 * - Stream(스트림) : 입력 또는 출력 데이터가 한 방향으로 끊임없이 전송되는 것
		 * 					  출발지 노드 -> 도착지 노드
		 * - 스트림 종류
		 * 		1. byte 기반(단위) 스트림
		 * 			=> 그림, 사진, 영상 등 바이너리(Binary) 데이터를 입출력
		 * 			=> InputStream, OutputStream 을 최상위 클래스로 두고
		 * 				XXXInputStream, XXXOutputStream 클래스가 하위 클래스로 존재함
		 * 
		 * 		2. char 기반(단위) 스트림
		 * 			=> 문자 데이터(텍스트)를 입출력
		 * 			=> Reader, Writer 를 최상위 클래스로 두고
		 * 				XXXReader, XXXWriter 클래스가 하위클래스로 존재함
		 * 
		 * - 표준 입출력 : 컴퓨터에서 기본적으로 사용하는 입출력
		 * 	=> 표준 입력 장치 : 키보드
		 * 	=> 표준 출력 장치 : 모니터
		 * 	=> 표준 입출력을 담당하는 클래스 : System
		 * 		1) System.in : 표준 입력을 담당 (키보드에서 입력 받기 기능)
		 * 		2) System.out : 표준 출력을 담당 (모니터로 출력 기능)
		 * 		3) System.err : 모니터에 에러 정보 출력 (잘 사용하지 않음)
		 * */
		
		
		/*
		 * 키보드로부터 데이터를 입력받아 처리하는 방법
		 * 1. InputStream 객체를 사용하여 1Byte 단위로 입력데이터를 처리하는 방법
		 * 		- read() 메소드를 사용하여 1Byte 만큼의 데이터를 가져올 수 있음
		 * 		- 아무리 많은 데이터가 입력되어도 read() 메소드 한번에 1Byte 만 처리되므로
		 * 		  더 많은 데이터나 더큰 단위 처리가 불가능
		 * 		- 가장 저수준의 입력 방법
		 * */
		
		
		// System.out.println("데이터를 입력하세요 : ");
		// InputStream is = System.in;
		//		
		// try {
		//  	int n = is.read();
		//		System.out.println("입력 데이터 : " + n);
		//	} catch (IOException e) {
		//		e.printStackTrace();
		//	} finally {
		//		if(is != null) {
		//			try {
		//				is.close();
		//			} catch (IOException e) {
		//				e.printStackTrace();
		//			}
		//		}
		//	}
		
		// ---------------------------------------------------------------------------------
		
		/*
		 * try ~ resource 구문을 사용하여 자원 반환(close()) 을 자동으로 수행
		 * 
		 * - 기본적으로 자원을 사용하는 객체 (Connection, InputStream 등)는
		 *   사용 후 close() 메소드 호출을 통해 사용중인 자원을 반환해야하며
		 *   자원이 반환되지 않으면 반복적인 자원 요청으로 인해 자원이 고갈되어
		 *   더 이상 다른 사용자의 작업 요청을 수행할 수 없게 된다!
		 *   => 예외 발생 여부와 관계없이 finally 블록 내에서 자원반환 코드를 기술했음
		 *   
		 * < 기본 문법 >
		 * 
		 *  try (자원을 반환할 객체 생성 및 변수에 저장) {
		 *  
		 *  } catch(...){
		 *  
		 *  }
		 * 
		 * */
		
		// System.out.println("데이터를 입력하세요 : ");
		// try (InputStream is = System.in;) {
		// 		int n = is.read();
		//		System.out.println("입력 데이터 : " + (char)n);
		//	} catch(IOException e) {
		//		e.printStackTrace();
		//	}
		
		// 별도의 close() 메소드 호출하지 않아도 자동으로 자원이 반환됨
		
		// ---------------------------------------------------------------------------------
		
		// 반복문 사용하여 1Byte 씩 여러번 반복하여 입력 처리
		System.out.println("데이터를 입력하세요. (취소 시 Ctrl + Z)");
		
		try(InputStream is = System.in;) {
			
			int n = is.read();
			
			// 더 이상 읽어올 데이터가 없을 때(-1) 까지 입력을 처리
			while(n != -1) {
				System.out.println("입력 데이터 : " + (char)n);
				n = is.read();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
