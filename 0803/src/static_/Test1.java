package static_;

public class Test1 {

	public static void main(String[] args) {
		// ctrl + H : 전체 프로젝트에서 검색
		
		int[] arr_north = {70, 80, 60, 20, 30, 50, 10, 80, 77, 89};
		int[] arr_south = {70, 60, 40, 50, 55, 65, 23, 44, 37, 88};
				
		Road north = new Road(arr_north);
		Road south = new Road(arr_south);
		
		Bridge br1 = new Bridge(2);
		Bridge br2 = new Bridge(4);
		Bridge br3 = new Bridge(6);
		
		Bridge[] bridges = {br1, br2, br3};
		
		Path pt = new Path();
		
		br1.total = pt.path1(north.road, br1.index) + pt.path2(south.road, br1.index);
		br2.total = pt.path1(north.road, br2.index) + pt.path2(south.road, br2.index);
		br3.total = pt.path1(north.road, br3.index) + pt.path2(south.road, br3.index);
		
//		System.out.println(br1.total); // 612
//		System.out.println(br2.total); // 572
//		System.out.println(br3.total); // 512
		
		
		Bridge min = bridges[0];
		
		for(int i = 1; i < bridges.length; i++) {
			if(bridges[i].total < min.total) {
				min = bridges[i];
			}
		}
		
		System.out.println("다리번호 : " + min.index);
		System.out.println("최소시간 : " + min.total);
		
	}

}

class Road {
	int[] road = new int[10];
	
	public Road(int[] road) {
		this.road = road;
	}
	
}

class Bridge {
	int index;
	int total;
	
	public Bridge(int index) {
		this.index = index;
	}
}

class Path {
	
	public int path1(int[] arr, int index) {
		int sum1 = 0;
		for(int i = 0; i <= index; i++) {
			sum1 += arr[i];
		}
		return sum1;
	}
	
	public int path2(int[] arr, int index) {
		int sum2 = 0;
		for(int i = index; i < arr.length; i++) {
			sum2 += arr[i];
		}
		return sum2;
	}
	
}
