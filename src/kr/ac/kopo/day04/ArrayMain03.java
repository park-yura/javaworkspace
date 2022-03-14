package kr.ac.kopo.day04;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}

		System.out.println("< PRINT >");
		
		
		/* 1.5 버전 오류ver = 출력을 위해 사용되는 거지 입력을 위해 사용되는건 아니다
		int data = 1; 
		for (int num : arr) {
			num = data++; //복사본이라 수정하거나 입력하는 용도 x 다 0으로 나온다 
		}
		
		System.out.println();
		 */
		
		/* 1.5버전
		for(int num : arr) {
			System.out.print(num + "\t");	
		}
		System.out.println();
		/
		
		/* index를 활용한 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		*/
	}
}
