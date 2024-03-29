
public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 패키지(Package)
		 * - 윈도우에서의 폴더(Folder), 리눅스에서의 디렉토리(Directory)에 해당하는 개념
		 * - 자바에서 클래스 파일들을 모아놓는 공간(물리적으로 폴더와 동일)
		 *   => 서로 다른 패키지에는 같은 이름의 클래스가 각각 존재할 수 있다. (= 중복 가능)
		 *      (단, 하나의 패키지에는 같은 이름의 클래스가 중복될 수 없다.)
		 * - 자바에서 패키지를 생성하면, 실제 물리적인 폴더가 생성됨
		 *   (만약, 패키지 생성 생략 시, 물리적 폴더가 없는 default package가 생성됨)    
		 * - 특정 클래스 파일은 하나의 패키지에'만' 소속되어야 함
		 * - 원칙적으로 클래스에 접근하는 방법은 패키지명과 클래스명을 동시에 지정하여 접근
		 *   => '패키지명.클래스명' 형태로 지정
		 *   => 만약, 패키지에 계층 구조로 이루어져 있을 경우에는
		 *      '상위패키지명.하위패키지명.클래스명' 형태로 지정
		 *   => 단, java.lang 패키지는 기본적으로 포함되는 "유일한" 패키지이므로    
		 *      java.lang 패키지 내의 클래스는 클래스명만으로 접근 가능
		 *      (대표적인 예: String)
		 * 
		 * */
		
	}

}
