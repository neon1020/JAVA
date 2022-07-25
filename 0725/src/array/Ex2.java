package array;

public class Ex2 {

	public static void main(String[] args) {
		// 배열은 크기가 고정되어있으므로 크기 확장하려면
		// 새로운 배열 생성하고, 기존 데이터를 새 배열에 복사해야함.
		
		int[] arr = {10, 20, 30}; // 40 추가하기
		int[] arr2 = new int[arr.length + 1];
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		arr2[arr2.length - 1] = 40; // 무조건 마지막 배열에 40 추가!
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("-----------------------------");
		
		int aNum = 10;
		int bNum = 20;
		bNum = aNum; // 기존에 있던 20은 제거됨
		
		int[] aArr = {1, 2, 3};
		int[] bArr = {4, 5, 6};
		int[] cArr = {7, 8, 9};
		
		aArr = bArr; // {4, 5, 6} 이라는 주소를 넘김!
					 // aArr이 가리키던 원래 주소는 아무도 참조하지 않는 상태가 됨
					 // 더 이상 참조되지 않는 힙 공간은 가비지 컬렉터에 의한 정리 대상이 됨!
		
		bArr = cArr; // {7, 8, 9} 주소를 넘김
					 // {4, 5, 6} 공간은 aArr이 참조하고 있으므로 가비지 컬렉터의 제거 대상이 아님!
		
	}

}
