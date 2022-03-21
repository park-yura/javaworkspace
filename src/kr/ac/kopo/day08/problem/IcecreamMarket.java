package kr.ac.kopo.day08.problem;

import java.util.Scanner;

public class IcecreamMarket {

	int totalCnt;
	int totalPrice;
	int cnt;
	
	Icecream[] iceArr = new Icecream[cnt];
	
	Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.print("아이스크림 몇개 구입하시겠습니까? => ");
		
			for(int i = 0; i < cnt; i++) {

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
			for(int i = 0; i < iceArr[i].price; i++) {
				sum += iceArr[i].price;
			}
			System.out.println("총 판매액 : " + sum);
		}
	
	public void order() {
		char ch = 'Y';
		
		while (ch == 'y' || ch == 'Y') {
			iceM.input();
			
			System.out.println("계속 주문하시겠습니까?(yes:Y/y, no:N/n) => ");
			ch = sc.nextLine().charAt(0);
			
			if(ch == 'n' || ch == 'N') {
				iceM.totalInfo();
			}
	}
	
	public void totalInfo() {
		System.out.println("총 판매개수 : " + this.totalCnt + "개");
		System.out.println("총 판매액 : " + this.totalPrice + "원");
	}
}
