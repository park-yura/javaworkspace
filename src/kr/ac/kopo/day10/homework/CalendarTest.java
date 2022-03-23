package kr.ac.kopo.day10.homework;

import java.util.*;

public class CalendarTest {

	private int year; //사용자 입력 "년"
	private int month; //사용자 입력 "달"
	private int day;
	private static Calendar c = Calendar.getInstance();

	public void PrintYear(int year) {
		for(int month = 1; month <= 12 ; month++) {
			PrintMonth(year, month);
		}
	}
	
	public void PrintMonth(int year, int month) {
		//입력받은 월의 1일로 셋팅
		c.set(year, month-1, 1);
		int day = c.get(Calendar.DAY_OF_WEEK);
		//마지막날 계산
		int endday = c.getActualMaximum(Calendar.DATE);
		
		System.out.println("< " + year + "년 " + month + "월 >");
		PrintDay(day, endday);	
	}
		
	public void PrintDay(int day, int endday) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int cnt = 0;
		
		// 첫 줄에 1일 출력
		for(int i = 1; i < day ; i++) { 
			System.out.printf("\t");
			cnt++;
		}
		
		for(int j = 1; j <= endday; j++) {
			System.out.printf("%2d\t", j);
			cnt++;
			if(cnt % 7 == 0 || j == endday)
				System.out.println();
			
		}
		
	}
	
}
