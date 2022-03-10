package kr.ac.kopo.day02.homework;

import java.util.Scanner;
/*
	화면에서 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면에 출력하시오
*/
public class No_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수를 하나 입력하세요 : ");
		int a = sc.nextInt();
			
		System.out.print("나눌 수를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.println("몫 : " + a/b);
		
		System.out.println("나머지 : " + a%b);
		
		sc.close();
		
	}
}
		

