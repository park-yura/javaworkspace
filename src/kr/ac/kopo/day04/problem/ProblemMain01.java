package kr.ac.kopo.day04.problem;

import java.util.Scanner;

public class ProblemMain01 {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int i; 
		;
		for( i =0; i< 5; i++) {
			System.out.print((i+1)+"'s num : " );
			arr[i] = sc.nextInt();
			
		}
		System.out.println("< PRINT >\t" + arr[i]);
		
		
	}
}
