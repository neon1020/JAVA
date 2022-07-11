package switch_case;

public class Test1 {

	public static void main(String[] args) {
		// switch문으로 학점 계산
		int score = 90;
		String grade = "";
		int i = score / 10;
		if (score >= 0 && score <= 100) {
			
			switch (i) {
			case 10 :
		//			grade += "A학점";
		//			break;
			case 9 :
				grade += "A학점";
				break;
			case 8 :
				grade += "B학점";
				break;
			case 7 :
				grade += "C학점";
				break;
			case 6 :
				grade += "D학점";
				break;			
			default:
				grade += "F학점";
				break;
			}

		} else {
			System.out.println("잘못된 점수");
				}
				
				System.out.println(grade);

	}

}
