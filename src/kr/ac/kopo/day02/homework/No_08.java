package kr.ac.kopo.day02.homework;

import java.util.Scanner;
/*
	물건값을 입력했을 때 거스름돈과 거스름돈에 해당하는 1000 원, 500 원, 100 원, 50 원, 10 원의 개수를 출력하는 코드를 작성
*/
public class No_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건값을 입력 : ");
		int money = sc.nextInt();
		
		System.out.println("지불한 돈의 액수 : ");
		int pay = sc.nextInt();
		
		int change = pay - money;
		System.out.println("거스름돈 : " + change + "원");
		
		// 거스름돈에서 1000원 갯수 계산
		System.out.println("1000원 : " + (int)change/1000 + "개"); 
		// 거스름돈에서 1000원을 빼고 남은 돈 계산
		change = change%1000;
		
		// 거스름돈에 포함된 500원 갯수 계산
		System.out.println(" 500원 : " + (int)change/500 + "개");
		// 거스름돈에서 500원을 빼고 남은 돈 계산
		change = change%500;
		
		// 거스름돈에 포함된 100원 갯수 계산
		System.out.println(" 100원 : " + (int)change/100 + "개");
		// 거스름돈에서 100원을 빼고 남은 돈 계산
		change = change%100;
		
		// 거스름돈에 포함된 50원 갯수 계산
		System.out.println("  50원 : " + (int)change/50 + "개");
		// 거스름돈에서 100원을 빼고 남은 돈 계산
		change = change%50;
		
		// 거스름돈에 포함된 10원 갯수 계산
		System.out.println("  10원 : " + (int)change/10 + "개");
		
		sc.close();
	}
}
