package kr.ac.kopo.day03.homework;

import java.util.Scanner;

//단을 입력받아 구구단을 출력하세요

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2-9단을 입력 : ");
		
		int num = sc.nextInt();
		
		System.out.printf("*** %d단 ***\n", num);
		
		for(int i = 1 ; i <= 9; i++) {
			System.out.printf("%d * %d =  %d\n", num, i, num*i);
		}
		sc.close();
	}
	
	
}
