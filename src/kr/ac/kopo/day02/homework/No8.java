package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class No8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건값을 입력 : ");
		int a = sc.nextInt();
		System.out.println("물건값을 입력 : " + a);
		
		System.out.println("지불한 돈의 액수 : ");
		int b = sc.nextInt();
		System.out.println("지불한 돈의 액수 : " + b);
		
		System.out.println("거스름돈 : " + (b-a));
		System.out.println("1000원 : " + (int)(b-a)/1000);
		System.out.println(" 500원 : " + (int)((b-a)%1000)/500);
		System.out.println(" 100원 : " + (int)((b-a)%1000)/100);
		System.out.println("  50원 : " + (int)((b-a)%1000)/50);
		System.out.println("  10원 : " + (int)((b-a)%1000)/10);
		
		
	}
}
