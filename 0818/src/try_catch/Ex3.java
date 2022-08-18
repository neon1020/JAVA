package try_catch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 하나의 try 블록에서 복수개의 예외를 처리하는 경우
		 * - try 블록 내에서 처리해야하는 예외가 두 종류 이상일 경우
		 *   catch 블록을 해당 예외 종류만큼 작성하거나
		 *   하나의 catch 블록에서 복수개의 예외를 모두 처리하는 클래스를 사용하면 된다.
		 * - 복수개의 catch 블록은 첫번째 catch 블록부터 차례대로 탐색함
		 *   => 만약, 끝까지 탐색했음에도 일치하는 catch 블록이 없으면 실행 시 예외가 발생함
		 * - 복수개의 catch 블록 지정 시 하위 타입부터 상위 타입순으로 나열해야함
		 *   => 상위 타입이 먼저 기술되면 하위 타입 예외는 실행될 수 없다!
		 * 
		 * < 기본 문법 >
		 * try {
		 * 		// 예외발생코드1
		 * 		// 예외발생코드2
		 * 		// 예외발생코드3
		 * 		// 예외발생코드4
		 * } catch (예외발생1클래스 변수명){
		 * 
		 * } catch (예외발생2클래스 변수명){
		 * 
		 * } catch (예외발생3클래스 | 예외발생4클래스 변수명){
		 * 
		 * } catch (Exception e){
		 * 		// 위의 모든 예외가 일치하지 않을 경우 나머지 예외를 모두 처리하는 코드
		 *		// if문에서 else 문 (switch-case문에서 default문) 과 같은 역할 수행
		 * }
		 * 
		 * */
		
		System.out.println("프로그램 시작!");
		
		try {
			
			// 첫번째 예외: ArithmeticException
			int num1 = 3, num2 = 1;
			System.out.println(num1 / num2);
			
			// 두번째 예외: NullPointerException
			String str = "";
			System.out.println(str.length()); 
			
			// 세번째 예외: ArrayIndexOutOfBoundsException
			int[] arr = {1};
			System.out.println(arr[1]);
			
		} 
		// 상위 타입이 먼저 기술되면 하위 타입 예외는 실행될 수 없다! 
//		catch (Exception e) {
//			System.out.println("예외 발생 : 나머지 예외를 모두 처리합니다!");
//		} 
		catch (ArithmeticException e) {
			System.out.println("예외 발생 : 0으로 나눌수 없습니다!");
		} catch (NullPointerException e) {
			System.out.println("예외 발생 : null 값을 참조할 수 없습니다!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생 : 잘못된 인덱스를 참조합니다!");
		} catch (Exception e) {
			// 위의 세가지 예외에 해당되지 않는 예외를 모두 Exception 타입으로 catch 함
			// => if문에서 else문 역할과 동일함
			System.out.println("예외 발생 : 나머지 예외를 모두 처리합니다!");
		}
		
		System.out.println("프로그램 종료!");
		
		// --------------------------------------------------------------------------------------
		
		/*
		 * - 예외 종류 분류
		 * 		1) Compile Checked Exception 계열
		 * 			- 컴파일(번역) 시점에서 예외 발생 가능성을 판별 가능하므로
		 *  		  예외 처리가 되어 있지 않으면 컴파일 에러 발생함 (예외처리 강제성 있음)
		 *  		- 대표적인 예외 : ClassNotFoundException, FileNotFoundException
		 *  						IOException, SQLException
		 * 
		 * 		2) Compile Unchecked Exception 계열
		 * 			- 컴파일(번역) 시점에서 예외 발생 가능성을 판별할 수 없으며
		 * 			  실행 시점에서 예외 발생 여부가 판별되므로
		 * 			  예외 처리 여부를 별도로 감시하지 않음 (예외 처리 강제성이 없음)
		 * 			  => 예외가 발생할 것으로 예상되는 코드를 찾아서 예외 처리를 수행해야함
		 * 			- 대표적인 예외: RuntimeException 계열
		 * 			  => ArithmeticException, ArrayIndexOutOfBoundsException
		 * 				 NullPointerException, ClassCastException 등
		 * 
		 * - java.lang 패키지 내에 Exception 클래스와 서브클래스들이 제공되며
		 *   각 예외는 "자신의 슈퍼클래스 타입으로 업캐스팅"도 가능함
		 * 
		 * */
		
		
		try {
			// ClassNotFoundException 발생 예상 코드...
			Class.forName("");
			
			// FileNotFoundException 발생 예상 코드...
			FileInputStream fi = new FileInputStream("");
			
		} catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println("FileNotFoundException 또는 ClassNotFoundException 발생!");
		} 
	}
}
