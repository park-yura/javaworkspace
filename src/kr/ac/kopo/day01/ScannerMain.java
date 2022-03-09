package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("문자를 입력 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		//System.out.print("문자열을 입력 : ");
		//String str = sc.next(); //단어단위는 next , 띄어쓰기 안됨
		//System.out.println("str : " + str);
		
		System.out.print("문자열을 입력 : ");
		String str = sc.nextLine(); //문장단위는 nextLine
 		System.out.println("str : " + str);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int a = sc.nextInt(); // nextchar은 없음 (문자입력 x)
		System.out.println("a : " + a);
		
	}
}
