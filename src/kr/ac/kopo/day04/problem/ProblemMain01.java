package kr.ac.kopo.day04.problem;  

import java.util.Scanner;

public class ProblemMain01 {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int sum = 0;
		
		for(int i =0; i< 5; i++) {
			System.out.print((i+1)+"'s num : " );
			num[i] = sc.nextInt();
		}
			System.out.println();
		
			System.out.println("< PRINT >");
			for(int i : num) {
				System.out.print(i + " ");
				sum += i;				
			}
			System.out.println();
			System.out.print("\n총합 : " + sum);
			
			
	}
}
