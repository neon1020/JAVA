package if_;

public class Test2 {

	public static void main(String[] args) {
		// 중첩 if문 사용하여 정수 2개에 대해 짝/홀 덧셈 결과 출력
			int i1 = 3, i2 = 6;
			String result = "";
			
			if (i1 % 2 == 0) {
				result += "짝수 + ";
				if (i2 % 2 == 0) {
					result += "짝수 = 짝수";
				} else {
					result += "홀수 = 홀수";
				}
			} else {
				result += "홀수 + ";
				if (i2 % 2 == 0) {
					result += "짝수 = 홀수";
				} else {
					result += "홀수 = 짝수";
					}
				}
				System.out.println(result);

	}

}
