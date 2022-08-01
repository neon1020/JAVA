package method;

public class Ex4 {

	public static void main(String[] args) {
		// 가변인자( = 비정형 인자) : 매개변수 갯수 모를 때 사용 (... 기호)
		// 다양한 갯수의 파라미터를 모두 전달받을 수 있는 인자 (0개 이상)
		// 전달되는 모든 데이터는 해당 변수명으로 된 배열로 관리됨
		
		int dan = 2;
		int i = 3;
		// printf 도 가변인자로 매개변수를 받음
		System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		
		
		// 전달할 파라미터 갯수 정해져 있지 않은 경우
		// 1. 배열 사용
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ArrayArguments aa = new ArrayArguments();
		aa.print(arr);
//		aa.print(1, 2, 3); 배열 형태가 아니면 오류 발생!
//		aa.print(); 파라미터 없으면 오류 발생!
		System.out.println();
		System.out.println("--------------------------------");
		
		// 2. 가변 인자 사용
		VariableArguments va = new VariableArguments();
		va.print(1, 2, 3);
		System.out.println();
		va.print(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		va.print(); // 파라미터 없어도 메소드 호출 가능!!
		System.out.println();
		va.print(arr); // 배열을 파라미터로 보내도 된다!
		
	}

}

class ArrayArguments {
	
	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}


class VariableArguments {
	
	public void print(int...nums) {
		// 전달 받은 모든 파라미터는 nums라는 이름의 배열로 관리됨!
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	// 가변인자 사용 시 주의사항!
	// 복수개의 매개변수 선언 시 가변 인자가 마지막에 사용되면 오류가 발생하지 않음 (먼저 오면 안된다!)
	public void print(String str, int...nums) {}
//	public void print(int...nums, String str) {} 가변인자는 메소드의 마지막 파라미터로 사용되어야한다!
//	public void print(int...nums, String...str) {} 가변인자는 단 한 번만 사용 가능 ( = 마지막 파라미터로만 사용 가능!)
	
	
}


