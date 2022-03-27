package kr.ac.kopo.day08.homework;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IcecreamMarket market = new IcecreamMarket();

		market.input();
		market.info();
		
		char ch = sc.next().charAt(0);
		
		while (ch == 'y' || ch == 'Y') {
			market.info();
			
			System.out.println("계속 주문하시겠습니까? (yes:Y/y, no:N/n) : " + ch);
			
			if (ch == 'n' || ch == 'N') {
				market.totalInfo();
			}
		}
	}
}
