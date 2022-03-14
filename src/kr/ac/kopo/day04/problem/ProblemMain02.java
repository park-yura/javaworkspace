package kr.ac.kopo.day04.problem;

import java.util.Scanner;

public class ProblemMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int [10];
		int sum = 0;
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println((i+1) + "'s num : ");
			num[i] = sc.nextInt(); 			
		}
		System.out.println();
		
		System.out.println("< 짝수 >");
		for(int i : num)
			if(i % 2 ==0) {
				System.out.print(i + " ");
				sum += i;
			}
		System.out.println("\n짝수의 총합 : " + sum);
		
		System.out.println();
		
		sum = 0; //숫자 총합 초기화
		System.out.println("< 홀수 >");
		for(int i : num)
			if(i % 2 == 1) {
				System.out.print(i + " ");
				sum += i;
			}
		System.out.println("\n홀수의 총합 : " + sum);
	}
}
