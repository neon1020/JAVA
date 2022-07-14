package break_continue;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 중첩 반복문 내에서 break, continue 문 사용시
		 * break문, continue문이 소속된 반복문에 효과가 적용됨
		 * 따라서, 원하는 반복문 블럭에 break, continue문을 적용하고 싶을 경우
		 * 레이블(Label) 기능을 활용하여 원하는 블럭 지정하고
		 * break, continue문 사용시 해당 레이블을 지정해야함
		 * 
		 * < 기본 문법 >
		 * 
		 * 레이블명:
		 * for(){
		 * 
		 * 		for(){
		 * 			if(){
		 * 				break 레이블명;
		 * 			}
		 * 		}
		 * 
		 * }
		 * 
		 * */
		
		OUTER: // 레이블1
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("< " + dan + "단 >");
			INNER: // 레이블2
			for(int i = 1; i <= 9; i++) {
				if(dan == 6) {
//					break; // 안쪽 for문을 종료하고 System.out.println(); 문장이 실행됨
//					continue;	// 아래쪽 실행문을 생략하고 안쪽 for문의 증감식(i++)으로 이동
					
//					break INNER;	// 일반 break문과 동일함
//					continue INNER;	// 일반 continue문과 동일함
					
//					break OUTER;	// 바깥쪽 for문을 종료하고 "프로그램 종료!"
//					continue OUTER;	// 바깥쪽 for문의 증감식(dan++)으로 이동
				}
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			System.out.println();
		}
		
	}

}
