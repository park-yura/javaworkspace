package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class No4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수를 하나 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println("정수를 하나 입력하세요 : " + a);
		
		System.out.print("나눌 수를 입력하세요 : ");
		int b = sc.nextInt();
		System.out.println("나눌 수를 입력하세요 : " + b);
		
		System.out.println("몫 : " + a/b);
		
		System.out.println("나머지 : " + a%b);
		
		sc.close();
		
	}
}
		/*
		int
		System.out.println("나눌 수를 입력하세요 : " + );
		
		int
		System.out.println("몫 : " + );
		
		int
		System.out.println("나머지 : " + );
		*/

