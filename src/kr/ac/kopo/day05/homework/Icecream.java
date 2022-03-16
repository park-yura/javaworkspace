package kr.ac.kopo.day05.homework;

import java.util.Scanner;

class IcecreamMain{
	String name; // 아이스크림명
	int price; // 아이스크림가격	
}
public class Icecream {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이스크림 몇 개 구매할꺼야?");
		int num = sc.nextInt();
		int sum = 0;
		IcecreamMain[] ice = new IcecreamMain[num];
				
		for(int i = 0 ; i < num ; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i+1);
			ice[i] = new IcecreamMain();
			
			System.out.print("아이스크림명 : ");
			ice[i].name = sc.next();
			
			System.out.println("아이스크림가격 : ");
			ice[i].price = sc.nextInt();
			
			sum += ice[i].price;
			System.out.println();
		}
				
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", num);
		System.out.println("번호\t아이스크림명\t가격"); 
		

		
		for(int i = 0; i < ice.length ; i++) {
			System.out.printf("%d\t%s\t\t%d\n", (i+1), ice[i].name, ice[i].price);
				
		}
		System.out.println();
		System.out.println("총 판매액 : " + sum + "원");				 
			
	}

}


