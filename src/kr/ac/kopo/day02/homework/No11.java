package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class No11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 4개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println("정수 4개 입력 : " + a + " " + b + " " + c + " " + d);
		
		int max;
		
		if (a >= b && a >= c && a >= d ) {
			max = a;
		} else if (b >= a && b >= c && b >= d) {
			max = b;
		} else if (c >= a && c >= b && c >= d) {
			max = c;
		} else {
			max = d;
		}
		
		System.out.print("가장 큰수 : " + max);
		
		sc.close();
		
		
		
		
	}
}
