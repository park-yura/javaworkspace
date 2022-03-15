package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class Icecream {
	String name; // 아이스크림명
	int price; // 아이스크림가격
	
	public static void main(String[] args) {
		
		Icecream ic = new Icecream();
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("아이스크림 몇 개 구매할꺼야?");
		int num = sc.nextInt();
		
		for(int i = 0 ; i < num ; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i+1);
		
			System.out.println("아이스크림명 : ");
			ic.name = sc.next();
			
			System.out.println("아이스크림가격 : ");
			ic.price = sc.nextInt();
			
			System.out.println();
		}
		
		Icecream[] list = new Icecream[num];
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", num);
		System.out.println("번호\t아이스크림명\t가격");
		
		for(int i = 0; i < list.length ; i++) {
			System.out.printf("%d\t%s\t%d", (i+1), list[i].name, list[i].price);
			
			sum += (list[i].price);
			System.out.println("총 판매액 : " + sum + "원");
			
		}
		
		System.out.println();
				 
			
	}


	}


