package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;

public class IOMain01 {

	public static void main(String[] args) {
//		System.in // 기본 입력 - 키보드
//		System.out// 기본 출력 - 모니터

		InputStream is = System.in; //키보드 자
		System.out.print("키보드 입력을 하세요. ctrl+z 입력시 종료"); // ctrl+z : 중단, 종료의 의미 
		
//		int c = is.read(); // ioexception에 대한 처리 해야함
		while(true) {
			try {
				int c = is.read();
				if (c == -1) break;
				System.out.print((char)c); // ctrl+z는 아무것도 입력을 받지 않았을 때 써줘야함
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 			
		}
	}
}
