package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String("hello");
		char[] chars = {'h', 'e', 'l', 'l', 'o'};
		String str2 = new String(chars);
		byte[] bytes = {65, 67, 98, 120};
		String str3 = new String(bytes); // 데이터를 주거니 받거니할때는 char 배열보다 byte 배열의 형태가 더 많이 사용된다.
		
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

		
		str = new String("Hello World!!!");
		System.out.println("str : " + str + ", 길이 : " + str.length());
		
		int loc = 0;
		char[] words  = new char[5];
		str.getChars(6,  11, words, 0); // (6, 10) 6 <=  < 10
//		for(int i = 6; i <= 10; i++) {			
//			words[loc++] = str.charAt(i);     == System.out.println(str.charAt(i));
		
		words = new char[str.length()];
		str.getChars(0, str.length(), words, 0);
		
		
		System.out.println("words : " + Arrays.toString(words));
		}
	}
//}





