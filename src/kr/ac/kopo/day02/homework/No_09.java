package kr.ac.kopo.day02.homework;

import java.util.Scanner;
/*
	다음의 결과를 보이는 프로그램을 작성
*/
public class No_09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("보유하고 있는 책권수 : ");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("잘못입력했습니다");
		} else if (a == 0) {
			System.out.println("보유하고 있는 책 없음");
		} else if (a == 1) {
			System.out.println(a + " book");
		} else {
			System.out.println(a + " books");
		}
			
		sc.close();
	}
}
