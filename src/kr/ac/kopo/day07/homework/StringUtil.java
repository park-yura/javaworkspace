package kr.ac.kopo.day07.homework;

public class StringUtil {
		
		// 1번
		boolean isUpperChar(char c) {
			if(c >= 'A' && c <= 'Z')
				return true;
			else
				return false;
		}	
			
		//2번
		boolean isLowerChar(char c) {
			if(c >= 'a' && c <= 'z')
				return true;
			else
				return false;
		}
		
		
		//3번
		int max(int i, int j) {
			if(i > j)
				return i;
			else
				return j;
		}
		
		//4번
		int min(int i, int j) {
			if(i > j)
				return j;
			else
				return i;
		}
		
		//5번
		String reverseString(String str) {
			String reverseString = "";
			for(int i = str.length()-1; i >= 0; i-- ) {
				reverseString += str.charAt(i);
			}
			return reverseString;
		}
		
		//6번
		String toUpperString(String str) {
			String toUpperString ="";
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					toUpperString += (char)(str.charAt(i) + ('A' - 'a'));
				}else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					toUpperString += str.charAt(i);
				}
			}
			return toUpperString;
		}
		
		//7번
		String toLowerString(String str) {
			String toLowerString ="";
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					toLowerString += str.charAt(i);
				}else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					toLowerString += (char)(str.charAt(i) - ('A' - 'a'));
				}
			}
			return toLowerString;
		}
		
		
		// 문자열 1번
//		String int checkChar()
} 

