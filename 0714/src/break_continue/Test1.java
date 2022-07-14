package break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * UP & DOWN 게임 만들기 1 ~ 999 사이의 난수 하나를 target에 저장
		 * 20번 반복하면서 정수를 입력받는다.
		 * target 보다 작은수를 입력받았을경우 "UP" 출력
		 * target 보다 큰 수를 입력받았을경우 "DOWN" 출력
		 * 일치하는 숫자를 입력받았을 경우 target과 몇회만에 맞췄는지 출력 후 반복 종료
		 * 출력 : 정답: XXX, 횟수: XXX
		 * 20번 안에 정답을 맞추지 못한 경우 "실패! 정답: XXX" 출력
		 * 
		 * 추가) 난이도를 선택할 수 있도록 프로그램변경
		 * 상, 중, 하 (2, 1, 0) 중 하나를 입력받는다.
		 * => 단, 이외 숫자가 입력될 경우 "입력오류: 상(2)/중(1)/하(0)중 입력!" 출력 후 계속 입력받음
		 * 상: 반복횟수 8번 중: 반복횟수 12번 하: 반복횟수 20번
		 */

		Scanner sc = new Scanner(System.in);
		int mode;
		int life; // 난이도(mode) 설정

		System.out.println("난이도를 입력하세요 (상(2)/중(1)/하(0)) : ");
		OUTTER:
		while (true) {
			mode = sc.nextInt(); // 콘솔창에서 난이도 값 입력받기
			switch (mode) {
			case 0:
				life = 20;
				break OUTTER;

			case 1:
				life = 12;
				break OUTTER;

			case 2:
				life = 8;
				break OUTTER;

			default:
				System.out.println("입력오류: 상(2)/중(1)/하(0)중 입력! : ");
				break; // default에서는 switch문만 빠져나가도록 함!
			}
		}
		
		System.out.println("난이도가 " + mode + "로 설정되었습니다. (기회 : " + life + "번)");
		
		// 난이도에 따른 UP & DOWN 게임 실행
		
		Random r = new Random();
		int target = r.nextInt(100) + 1; // 1 ~ 100까지의 난수 저장
		int count = 0;
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		while (true) {
			count++;
			if (num == target) {
				break;
			} else if (num > target) {
				System.out.println("DOWN");
			} else {
				System.out.println("UP");
			}
			num = sc.nextInt();
		}
		
		if (count > life) {
			System.out.println("정답 : " + target + ", 실패!");
		} else {
			System.out.println("정답 : " + target + ", " + count + "번 만에 성공!");
		}
		
		
		
	}

}
