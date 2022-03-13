package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 100 사이의 정수를 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("2 - 10 사이의 정수를 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("1 - %d 사이의 %d의 배수를 제외한 정수 출력 \n", num1, num2);
		for (int i = 1; i <= num1 ; i++) {
			if (i % num2 != 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		
		System.out.printf("1 - %d 사이의 %d의 배수를 제외한 정수 5개씩 출력 \n", num1, num2);
		
		int j = 0;
		
		for(int i = 1 ; i  <= num1 ; i++) {
			if (i % num2 != 0) {
				System.out.printf("%d ", i);				
			j++;
			if (j % 5 == 0) {
				System.out.println();
			}
			}
		}
		sc.close();
	}
}
