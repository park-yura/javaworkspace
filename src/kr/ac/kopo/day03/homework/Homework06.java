package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작단을 입력 : ");
		int start = sc.nextInt();
		
		System.out.print("종료단을 입력 : ");
		int finish = sc.nextInt();
		
		if(start >= finish) {
			int temp = start;
			start = finish;
			finish = temp;
		}
		
			for(int i = start; i <= finish; i++) {
				System.out.printf("*** %d단 ***\n", i);
				
				for(int j = 1; j<=9 ; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i*j);					
				}
			}	
		sc.close();
		}
	}


