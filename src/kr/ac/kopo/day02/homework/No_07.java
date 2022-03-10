package kr.ac.kopo.day02.homework;

import java.util.Scanner;

/*
	화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램을 작성하시오
*/
public class No_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력(알파벳) : ");
		
		String inputStr= sc.nextLine();
		//문자열 0번째 문자를 char 타입으로 변환
		char ch = inputStr.charAt(0);
		
		//입력받은 값이 소문자인 경우 대문자로 변환
		if ((int)ch >= (int)'A' && (int)ch <= (int)'Z') {
			System.out.print("변경된 값 : ");
			System.out.println((char)(((int)ch - (int)'A') + (int)'a'));
		} else { 
		//입력받은 값이 대문자인 경우 소문자로 변환
			System.out.print("변경된 값 : ");
			System.out.println((char)(((int)ch - (int)'a') + (int)'A'));
			
		sc.close();
		}
	}

}
