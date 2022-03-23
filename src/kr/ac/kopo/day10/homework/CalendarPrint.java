package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class CalendarPrint {
	
	public CalendarPrint() {
		
	}
	
	private Scanner sc = new Scanner(System.in);
	private int year = 0; 
	private int month = 0;
	
	//메뉴보기
	public void Menu() {
		
	
		while(true) {	
			System.out.print("원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) => ");
			int num = sc.nextInt();
			System.out.println();
			if(num == 1) {
				System.out.print("년도를 작성하세요 : ");
				int year = sc.nextInt();
				new CalendarTest().PrintYear(year);
			
			} else if (num == 2) {
				System.out.print("년도를 작성하세요 : ");
				int year = sc.nextInt();
				System.out.print("월을 작성하세요 : ");
				int month = sc.nextInt();
				new CalendarTest().PrintMonth(year, month);
				
			} else if (num == 3) {
				System.out.println("종료되었습니다.");
				break;
			}
	
		}
	
	}
}
