package kr.ac.kopo.day11;

import java.io.FileReader;

public class ExceptionMain06 {

	public static void main(String[] args) {
		
//	시스템을 실행해 봐야 에러를 알 수 있다. = 런타임
		System.out.println("main start...");

	for(int i = 0; i < 5; i++) {
		try {
			System.out.println("loop...");
			if(i == 3) {
				FileReader fr = new FileReader("a.txt");
			}
			
			} catch(Exception fnfe) {
				fnfe.printStackTrace();
				break; //return 쓰면 main end 안찍힘. 그래도 finally는 찍힘
			} finally { // finally 무조건 실행 , 자원관리할때 반드시 finally
				System.out.println("end loop...");
			}
		}
//		System.out.println(10/0);
		System.out.println("main end...");
	}
}
	

