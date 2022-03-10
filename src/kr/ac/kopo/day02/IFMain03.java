package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 	다중if
 	if(조건1) {
 	} else if(조건2) {
 	} else if(조건3) {
 	} else {
 	}
 	
 	if(조건1) {
 		문장1;
 	} else if(조건2) {
 		문장2;
 	} else if(조건3) {
 		문장3;
 	} else if(조건4) {
 		문장4;
 	} else (조건5) {
 		문장5;		
 	중첩된 if문과 결과는 같지만, 다중if가 평등한 결과인 것같아보임
 	if문은 범위가 작아지거나 커지거나 순서대로..	
 */
public class IFMain03 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("집에서 출발한 시간을 입력하세요(7시30분 : 730 => ");
		int time = sc.nextInt();
		
		if (time < 800) {
			System.out.println("걸어서 학교에 간다");
		} else if(time < 815) {     							//8시 이후인 것들 중에서 8시 15분 이전
				System.out.println("버스를 타고 학교에 간다");
		} else {												//8시 이후인 것들 중에서 8시 15분 이후
				System.out.println("택시를 타고 학교에 간다");
			}
		}
	}




