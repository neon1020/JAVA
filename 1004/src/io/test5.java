package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class test5 {

	public static void main(String[] args) {
		
		// BufferedReader 를 사용하여 입력받은 문자열을
		// OutputStream을 사용하여 출력
		
		System.out.println("데이터를 입력하세요.");
		
		// try ~ resource 구문 작성 시
		// try() 문장 소괄호 내에 복수개의 객체를 세미콜론(;)으로 구분하여 전달 가능
		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); OutputStream os = System.out) {
			
			String str = buffer.readLine();
			
			os.write(str.getBytes());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
