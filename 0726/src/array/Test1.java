package array;

public class Test1 {

	public static void main(String[] args) {
		String[] names = {"김", "이", "박", "정", "최"};
		int[][] score = {
				{80, 80, 80},
				{90, 80, 77},
				{60, 50, 60},
				{100, 100, 100},
				{50, 80, 100}
		};
		
		System.out.println("\t국어\t영어\t수학");
		
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
			
			for(int j = 0; j < score[j].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		System.out.println("< 학생별 총점 >");
		
		int[] total = new int[names.length];
		
		for (int i = 0; i < total.length; i++) {
			int sum = 0;
			
			for (int j = 0; j < score[j].length; j++) {
				sum += score[i][j];
			}
			
			total[i] = sum;
			System.out.println(names[i] + " : " + sum + "점");
		}
		
	}

}
