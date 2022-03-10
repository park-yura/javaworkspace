package kr.ac.kopo.day02.homework;

import java.util.Scanner;
/*
	반지름이 10인 원의 면적을 구해서 출력하시오
*/
public class No_03 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 반지름을 입력하세요 : ");
		int r = sc.nextInt();
		
		double pi = 3.141592;
		System.out.printf("원의 면적은 %.4f 입니다.", r*r*pi);
		
		sc.close();
		
	}
}
