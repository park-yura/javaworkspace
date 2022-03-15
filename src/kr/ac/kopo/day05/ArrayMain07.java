package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain07 {

	public static void main(String[] args) {
		
		int[][] ar = new int[3][];
		
		for(int i =1; i < ar.length; i++) {
			ar[i] = new int[3+i];
		}
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				//System.out.printf("ar[%d][%d] ", i, j);
				ar[i][j] = i*10 + (j+1);
			}
			System.out.println();
		}
		
		for(int[] arr : ar) {
			System.out.println(Arrays.toString(arr));
		}
		/*
		for(int[] arr : ar) {
			System.out.println(arr);
		}
		*/
	}
}
