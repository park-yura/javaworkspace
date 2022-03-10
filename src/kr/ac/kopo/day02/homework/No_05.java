package kr.ac.kopo.day02.homework;

import java.util.Scanner;
/*
	1달러는 현재 1,092.50원 입니다. 화면에서 달러를 입력 받아 원화로 보여주는 프로그램을 작성하세요
*/
public class No_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달러를 입력하세요 ? ");
		int a = sc.nextInt();
		
		System.out.printf("원화 : %1.2f 원", a*1092.50); //소수점 둘째자리까지 출력
		
		sc.close();
	}

}
