package kr.ac.kopo.day05;

public class ArrayMain06 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][4]; //2차원 배열의 참조변수를 가지고 있음
		System.out.println("arr : " + arr 
				+ ", arr.length : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		
		/*
		1차원 배열 : 같은 타입을 모아놓은 배열
		2차원 배열 : 1차원 배열들의 집합
		*/
		
		/* = int[][] arr = new int[3][4];
		int[] a = new int[4]; 
		int[] b = new int[4];
		int[] c = new int[4];
		
		int[][] ar = {a, b, c};
		
		
		 */
	}
}
