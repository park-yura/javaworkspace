package kr.ac.kopo.day11.calendar;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc = new Scanner(System.in);
	
	//정수값을 받고자 함
	private int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine()); //정수로 받은 거 리턴하게 해줌
	}
	
	public void process() {
		CalendarUtil util = new CalendarUtil();
		loop: while(true){
			int type = getInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료) : ");
			switch(type) {
			case 1 : 
				int year = getInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2 :
				year = getInt("년도를 입력하세요 : ");
				int month = getInt("월을 입력하세요 : ");
				util.showByMonth(year, month);
				break;
			case 3 : 
				System.out.println("프로그램을 종료합니다");
//				break loop;
				System.exit(0); //exit() : 괄호안에 종료 코드, (0): 정상 종료
			}
		}
	}
}
