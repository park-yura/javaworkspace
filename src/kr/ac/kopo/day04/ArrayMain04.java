package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		
//		int[] arr = {10, 20, 30, 40, 50};
		int[] arr = new int[] {10, 20, 30, 40, 50}; // 위에보다 훨씬 더 유연함
		
//		arr = {5, 4, 3};  {}는 배열의 선언부와 같이 사용할 때만 초기화 가능 초기화 하려면 new int[]{} 순서로 사용해야함 - 컴파일 에러
		arr = new int[] {5, 4, 3};
		
		System.out.println("arr : " + Arrays.toString(arr));
		
		
	}
}
