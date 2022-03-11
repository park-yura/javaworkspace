package kr.ac.kopo.day03.homework;

public class HomeworkMain03 {

	public static void main(String[] args) {
		
		int upperCnt = 'Z' - 'A' + 1;
		int lowerCnt = 'z' - 'a' + 1; // 알파벳의 숫자코드는 이어져있다.
		
		System.out.println("개수 ?" + (upperCnt + lowerCnt));
		
		char ch = 'B';
		if (ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch + ('a' - 'A')); //char: 형변환
		} else if(ch >= 'a' && ch <= 'z') {
			ch = (char)(ch - ('a' - 'A'));
		}

	}

}
