package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		
//		String[] strArr = {"데이터분석", "자바", "교육"};
		String[] strArr = new String[5]; //초기화가 null로 됨
		int loc = 0; //loc= location
		strArr[loc++] = "폴리텍";
		strArr[loc++] = "데이터분석";
		strArr[loc++] = "자바";
		strArr[loc++] = "교육";
		
		System.out.println("문자열의 총 개수 : " + strArr.length +"개");
//		System.out.println("첫번째 문자열 : " + strArr[0]);
//		System.out.println("두번째 문자열 : " + strArr[1]);
//		System.out.println("세번째 문자열 : " + strArr[2]);
		
		/*
		 * 배열의 전체 원소를 출력 방식
		 * 1. index를 이용한 출력 (원소접근: 0 ~ length-1)
		 * 2. 1.5버전의 for문을 이용한 출력
		 * 3. Arrays.toString() 메소드를 이용한 출력
		 */
		System.out.println("< index를 이용한 출력 >");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			
		}
		
		System.out.println("< 1.5버전의 for문 이용 출력 >");
		for(String s : strArr) { // 원래: for(시작값;종료조건;증가/감소) , :(콜론)으로 두가지로 나눔, (변수선언 : 변수명)
			System.out.println(s); //아래와 같은 내용
		//	String s = strArr[0]
		//	String s = strArr[1]
		//	String s = strArr[2]
		//	String s = strArr[strArr.length-1]		
		}
		
		System.out.println("< Arrays.toString() 메소드 이용 출력 >");
		String result = Arrays.toString(strArr); // "[원소, 원소, 원소, ...]" 하나의 문자열로 만들어줌
		System.out.println(result);
	}
}
