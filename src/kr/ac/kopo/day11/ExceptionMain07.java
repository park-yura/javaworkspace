package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain07 {

	public static void main(String[] args) {
		
		try {
			b();			
		} catch(Exception | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		a();
		
	}
	
		try { //throws를 쓰면 try - catch를 한 곳에서 관리할 수 있음
			c();
			d();
			e();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	public static void c() throws Exception {
		f();
	}
	
	public static void b() throws FileNotFoundException, ArrayIndexOutOfBoundsException { // fnfe는 Exception이라고 써도 됨
		
		
			int[] arr = new int[3];
			System.out.println(arr[4]);
			FileReader fr = new FileReader("a.txt"); // 원래는 file not found라는 예외처리 해줘야함 
		
	}
	public static void a() {
		
		try {
			String str = null;
			System.out.println(str.length());			
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("예외발생 : ");
		}
	}
}
