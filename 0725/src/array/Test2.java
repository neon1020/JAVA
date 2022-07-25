package array;

public class Test2 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 1};
		
		// 일반 for문
		for(int i = 0; i < arr.length; i++) {
			String c = "";
			for(int j = 0; j < arr.length; j++) {
				if(i == j) {
					continue;
				} else { // else를 안 써도 됨!
					if(arr[i] > arr[j]) {
						c += "> ";
					} else if(arr[i] == arr[j]) {
						c += "= ";
					} else {
						c += "< ";
					}
				}
			}
			
			System.out.println((i+1) + " : " + c);
			
		}
		
		System.out.println("----------------------");
		
	}

}
