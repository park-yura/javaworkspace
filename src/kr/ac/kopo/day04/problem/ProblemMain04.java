package kr.ac.kopo.day04.problem;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemMain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int i = 0; //인덱스 번호
		int num = 0; // 입력받는 정수
		int max = 0; // 최대값 저장 변수
		int j = 0;
		 
		while (i < arr.length) {
			System.out.print((i+1) + "번째 정수 : ");
			num = sc.nextInt();
			
			if(num > max) {
				max = num;
				arr[i] = max;
				i++;
			} else {
				for(j = 0; j < i; j++) {
					System.out.print(" " + arr[j] + ", "); //마지막 숫자의 쉼표를 삭제하려면 어떻게 해야할까요..? 
				}
				System.out.println("보다 큰수가 와야합니다");
			}
		} 
		
		System.out.println("\n< PRINT >");
		for (j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		
		//System.out.println("\n< REVERSE >");
	
	}

}
			

				
		


