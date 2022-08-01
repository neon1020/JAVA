package method;

// 가변인자 사용하여 계산기(Calculator2) 만들기

class Calculator3 {
	
	public void calc(char opr, int...nums) {
		int result = nums[0]; // -, *, / 의 경우에 맨 처음 값이 필요하므로 먼저 넣어놓기
		String str = nums[0] + "";
		for (int i = 1; i < nums.length; i++) {
			switch (opr) {
			case '+':
				result += nums[i];
				str += " + " + nums[i];
				break;
				
			case '-':
				result -= nums[i];
				str += " - " + nums[i];
				break;
				
			case '*':
				result *= nums[i];
				str += " * " + nums[i];
				break;
				
			case '/':
				result /= nums[i];
				str += " / " + nums[i];
				break;
			}
		}
		
		System.out.println(str + " = " + result);
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		Calculator3 cal3 = new Calculator3();
		
		cal3.calc('+', 10, 20, 30);
		cal3.calc('-', 100, 10, 20, 5);
		cal3.calc('*', 2, 3, 4, 5, 6);
		cal3.calc('/', 100, 20, 5);
		
	}

}
