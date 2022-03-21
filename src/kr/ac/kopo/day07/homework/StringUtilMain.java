package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class StringUtilMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringUtil s = new StringUtil();
		
		// 1번
		System.out.print("하나의 알파벳을 입력하세요");
		char c1 = sc.next().charAt(0);
		System.out.println("대문자인가요?" + s.isUpperChar(c1));
		System.out.println();
		
		// 2번
		System.out.print("하나의 알파벳을 입력하세요");
		char c2 = sc.next().charAt(0);
		System.out.println("소문자인가요?" + s.isLowerChar(c2));
		System.out.println();
		
		// 3번, 4번
		System.out.print("두개의 숫자를 입력하세요");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("큰수 : " + s.max(i, j));
		System.out.println("작은수 : " + s.min(i, j));
		System.out.println();
		
		// 5번, 6번, 7번
		System.out.print("문자열을 입력하세요");
		String str = sc.next();
		System.out.println("거꾸로 변경: " + s.reverseString(str));
		System.out.println("대문자로 변경: " + s.toUpperString(str));
		System.out.println("소문자로 변경: " + s.toLowerString(str));
		
		// 문자열 1번
		String strData = s.getString();
		char ch = s.getChar();
			
		int cnt = StringUtil.checkChar(strData, ch);
		System.out.println(cnt);
		
		// 문자열 2번
		String oriStr = s.getString();
		char delChar = s.getChar();
				
		String result = StringUtil.removeChar(oriStr, delChar);
		System.out.println(result);
		
	}
	
}
