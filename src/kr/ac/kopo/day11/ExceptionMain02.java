package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		try {			
			Random r  = new Random();
			int num = r.nextInt(3); // 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num);
		} catch(ArithmeticException ae) {
			System.out.println("예외발생 : " + ae.getMessage()); // .getMessage: 에러에 대한 메세지가 들어있음
			ae.printStackTrace();
		} // printStackTrace : 어느 줄에서 예외가 발생햇는지 알 수 있음
		System.out.println("main end...");
	}
}

