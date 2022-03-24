package kr.ac.kopo.day11;

import java.util.Scanner;

class MismatchEvenException extends Exception{

	public MismatchEvenException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MismatchEvenException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

public class ExceptionMain08 {

	public static void main(String[] args) throws Exception{ //JVL?
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("짝수를 입력 : ");
			int num = sc.nextInt();
			
			if(num < 0 || num % 2 == 1) {
				throw new Exception("짝수가 아닌 정수가 입력되었습니다"); //try - catch문 
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		/*
		if(num < 0 || num % 2 ==1) {
			System.out.println("잘못입력했습니다");
		} else {
			System.out.println("짝수 : " + num);
		}
		*/
	}
}
