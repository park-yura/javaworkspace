package kr.ac.kopo.day02.homework;

import java.util.Scanner;
/*
	3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오
*/
public class No_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int time = scanner.nextInt();
		
		int hour = time/3600; // 1시간 = 3600초
		int minute = (time%3600)/60; // 1시간을 쓰고 난 나머지 시간 1분 = 60초
		int second = (time%3600)%60;
		System.out.println(hour + "시간 " + minute + "분 " + second + "초");

		scanner.close();
	}

}
