package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain02 {
	public static void main(String[] args) {
		InputStream is = System.in; 
		InputStreamReader isr = new InputStreamReader(is); // byte 형태로 들어오는 입력을 문자로 출력이 될 수 있게 해줌
		System.out.println("키보드 입력을 하세요. ctrl+z 입력시 종료");
		
		while(true) {
			try {
				int c= isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
