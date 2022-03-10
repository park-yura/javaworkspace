package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 중첩된 if문
  	if(조건1) {
 		문장1;
 	} else {
 		if(조건2) {
 			문장2;
 		} else {
 			if(조건3) {
 			문장3;
 		} 
 	}
 	
 	종속적인 x 다중선택문 elseif: n개 문장을 (n-1)
 	출발한 시간을 입력하세요(ex 7시 30분 :730) => 807
 	버스를 탑니다
 */

public class IFMain02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("집에서 출발한 시간을 입력하세요(7시30분 : 730 => ");
		int time = sc.nextInt();
		
		if (time < 815) {
			if (time < 800) {
				System.out.println("걸어간다");
			} else {
				System.out.println("버스를 탄다");
			}
		} else {
			System.out.println("택시를 탄다");
		}
		
		if (time < 800) {
			System.out.println("걸어서 학교에 간다");
		} else { 
			if(time < 815) {     							//8시 이후인 것들 중에서 8시 15분 이전
				System.out.println("버스를 타고 학교에 간다");
			} else {
				System.out.println("택시를 타고 학교에 간다");
			}
		}
	}
}








