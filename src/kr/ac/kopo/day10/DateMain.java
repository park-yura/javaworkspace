package kr.ac.kopo.day10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
//		String pattern = "yyyy-MM-dd hh:mm:ss(E)";
		String pattern = "yyyy년도 MM월 dd일 HH시 mm분 ss초(E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		/*
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
//		int year = c.get(1);
		int year = c.get(Calendar.YEAR);		
//		int month = c.get(2);
		int month = c.get(Calendar.MONTH) + 1; // +1하는 이유는 0 ~ 11까지만 나오기 때문에
		int date= c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
		String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일(" + week[day] + ")입니다");
		
		//2020년 5월 20일 요일?
		c.set(2020, 5-1, 20); //내 객체 값 수정, month-1 : month는 0~11이라
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2020/5/20 " + week[day] + "요일");
		
		int lastday = c.getActualMaximum(Calendar.DATE); //자기가 가지고 있는 숫자중 최대, 최소값
		System.out.println(lastday);
		
		Date d = c.getTime();
		System.out.println(d);
		
		*/
		
		
		/*
		Date d = new Date();
		System.out.println(d); // d.toString()을 출력하고 있음 
		
		// String을 작성하지 않았는데도 쓸수 있는 이유는 toString은 object 클래스가 가지고 있음
		// Date는 object 메소드를 받아서 오버라이딩 했음 
		
		//오늘은 2022년 3월 23일(수)입니다.
		
		int year = d.getYear() + 1900; //-deprecated 됐음, getyear는 1900년 기준
		int month = d.getMonth() + 1; //월이 0월부터 시작
		int date = d.getDate();
		int day = d.getDay(); //요일을 숫자로 반환
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일(" + week[day] + ")입니다.");
		*/
	}
	
}
