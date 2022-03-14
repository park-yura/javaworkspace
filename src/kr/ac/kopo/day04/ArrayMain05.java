package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 50, 70, 30};
//		int[] copy = arr; //int배열의 복사본 , shallow copy(얕은 복사)
		
		// deep copy(깊은 복사)
		int[] copy = new int[arr.length];
		System.arraycopy(arr, 0, copy, 0, arr.length);

		
//		for(int i = 0; i < arr.length; i++) {
//			copy[i] = arr[i];
//		}
		
//		System.out.println("arr : " + arr);
//		System.out.println("COPY : " + copy);
		
		copy[2] = 100;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("COPY : " + Arrays.toString(copy));
		
	}
}
