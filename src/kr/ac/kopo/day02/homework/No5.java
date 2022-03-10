package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class No5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달러를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println("달러를 입력하세요 : " + a);
		
		System.out.printf("원화 : %1.2f 원", a*1092.50); //문제지 결과값에서 소수점 둘째자리까지 있어서 출력

	}

}
