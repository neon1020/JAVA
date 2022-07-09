package operator;

public class Op1 {

	public static void main(String[] args) {
		/*
		 * 단항 연산자 (증감 연산자) (++, --)
		 * 
		 * 1. 선행연산자 (전위연산자)
		 * 		- 피연산자의 앞쪽(좌측)에 붙여서 값을 1 증가 또는 감소시킴
		 * 		  먼저 피연산자의 값을 증가 또는 감소시킨 후에 다른 연산에 참여
		 * 		  ex) ++i, --i
		 * 
		 * 2. 후행연산자 (후위연산자)
		 * 		- 피연산자의 뒷쪽(우측)에 붙여서 값을 1 증가 또는 감소시킴
		 * 		  피연산자를 먼저 다른연산에 참여시킨 후 1 증가 또는 감소
		 * 		  ex) i++, i--
		 * 
		 * */
		
		int x1 = 5;
		int y1 = ++x1;	// 선행연산자
		// => x1의 값을 먼저 1 증가시킨 후, 대입연산자를 통해 x1값을 y1에 대입
		
		int x2 = 5;
		int y2 = x2++;	// 후행연산자
		// => x2의 값을 먼저 y2에 대입한 후, x2의 값을 1증가시킴
		System.out.println("x1: " + x1 + ", y1: " + y1); // 6, 6
		System.out.println("x2: " + x2 + ", y2: " + y2); // 6, 5
		
		System.out.println("=====================");
		
		int x = 10, y = 5;
//		int z = ++x + y--;
		x++;
		int z = x + y;
		y--;
		
		System.out.println(x + ", " + y + ", " + z); // 11, 4, 16
		
		System.out.println("======================");
		
		int i = 3;
		i++;
		System.out.println(i);  // 4
		++i;
		System.out.println(i); // 5
		
		System.out.println(++i); // 6
		System.out.println(i++); // 6 (출력 먼저 시키고 1 증가)
		System.out.println(i); // 7
		
		System.out.println("======================");
		
		// 단항 연산자를 활용한 구구단 출력
		int dan = 2;
		int index = 1;
		System.out.println("< " + dan + "단 >");
		System.out.println(dan + " * " + index + " = " + dan*index++);
		System.out.println(dan + " * " + index + " = " + dan*index++);
		System.out.println(dan + " * " + index + " = " + dan*index++);
		

	}

}
