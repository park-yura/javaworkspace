package kr.ac.kopo.day04.problem;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int num;
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println((i+1) + "'s 정수 : ");
			num = sc.nextInt();
			if (num % 2 == 0) {
				arr[i] = num;
			} else {
				i--;
			}
		} 
		System.out.println("< 5개의 정수 출력 >");
		for (int i : arr)
			System.out.print(i + " ");
	}
}
