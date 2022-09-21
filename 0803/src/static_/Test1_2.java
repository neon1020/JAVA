package static_;

public class Test1_2 {

	public static void main(String[] args) {
		
		// 길 객체 생성
		Road1 north = new Road1();
		Road1 south = new Road1();
		
		// 길 배열 생성
		north.arr = new int[] {70, 80, 60, 20, 30, 50, 10, 80, 77, 89};
		south.arr = new int[] {70, 60, 40, 50, 55, 65, 23, 44, 37, 88};
		
		// 다리 객체 생성
		Bridge1 br1 = new Bridge1();
		Bridge1 br2 = new Bridge1();
		Bridge1 br3 = new Bridge1();
		
		
		
	}

}

class Road1 {
	
	// 길이 될 배열을 멤버변수로 지정
	int[] arr;
	int total;
	
	// 각 길의 시작 ~ 끝 길이 구하는 메소드
	public int sum(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += this.arr[i];
		}
		return sum;
	}
}


class Bridge1 {
	int index;
}
