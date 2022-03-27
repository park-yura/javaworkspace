package kr.ac.kopo.day08.homework;

import java.util.Scanner;

public class IcecreamMarket {
	Scanner sc = new Scanner(System.in);
	private int totalCnt; // 총 판매 개수
	private int totalPrice; //총 판매 가격
	private int sum = 0;
	int count = Integer.parseInt(sc.nextLine());
	Icecream[] iceArr = new Icecream[count];
	
	public IcecreamMarket(int sum) {
		this.sum = sum;
	}
	
	public IcecreamMarket() {
		this.totalCnt = 0;
		this.totalPrice = 0;
	}
	
	
	public void input() {
	System.out.print("아이스크림 몇개 구입하시겠습니까? => ");
	
		for(int i = 0; i < count; i++) {

			iceArr[i] = new Icecream();
			
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine(); 
			
			System.out.print("아이스크림 가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());
		
		}
	}
	
	public void info() {
		
	System.out.println("<총 " + iceArr.length + "개 아이스크림 구매정보 출력 >");
	System.out.println("번호\t아이스크림명\t아이스크림가격");
	
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println(i+1 + "\t" + iceArr[i].name + "\t" + "\t" + iceArr[i].price);
		}
		
		int sum = 0;
		for(int i = 0; i < iceArr[i].getprice(); i++) {
			sum += iceArr[i].getprice();
		}
		System.out.println("총 판매액 : " + sum);
	}

	public void totalInfo() {
		System.out.println("총 판매개수 : " + this.totalCnt + "개");
		System.out.println("총 판매액 : " + this.totalPrice + "원");
		
	}
}
