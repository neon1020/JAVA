import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		// Arrays 클래스
		// ArrayList 는 객체, Arrays 는 배열 관련 다양한 기능을 제공하는 클래스!
		// static 메소드가 제공되므로 클래스명만으로 호출 가능
		
		int[] myLotto = {40, 45, 10, 33, 1, 42};
		
		// Arrays 클래스 활용하여 배열의 모든 요소 출력
		// => Arrays.toString() 메소드 활용하면 배열 내의 모든 요소를 문자열로 리턴해줌
		System.out.println(Arrays.toString(myLotto));
		
		System.out.println("----------------------------------------------");
		
		// 배열 요소를 정렬(sort) Arrays.sort() 메소드 사용
		// 정수는 오름차순으로 정렬 (0 -> 9)
		Arrays.sort(myLotto);
		System.out.println("정렬 후 : " + Arrays.toString(myLotto));
		
		System.out.println("----------------------------------------------");
		
		// 문자는 알파벳 오름차순으로 정렬 (A -> Z)
		// 대소문자 비교에서는 대문자가 먼저 옴
		String[] subject = {"Java", "Android", "JSP", "Oracle", "HTML5"};
		Arrays.sort(subject);
		System.out.println("정렬 후 : " + Arrays.toString(subject));
	}

}
