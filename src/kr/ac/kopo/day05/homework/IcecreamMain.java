package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class IcecreamMain {
	
	public static void main(String[] args) {
		//
		//Icecream ic = new Icecream;
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("아이스크림 몇 개 구매할꺼야?");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i);
			System.out.println("아이스크림명 : ");
	//		ic.name = sc.next();
			System.out.println("아이스크림가격 : ");
	//		ic.price = sc.next();
			System.out.println();
		}
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", num);
		
		
		//Icecream i = new Icecream;
		// i.name = 
		
		/*
		for(int price : num) {
			System.out.print(price + " ");
			sum += price;				
		}
		System.out.println("총 판매액 : " + sum + "원");
		*/
				 
			
	}

}
