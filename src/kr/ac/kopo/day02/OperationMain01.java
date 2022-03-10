package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {
		
		int a = 1, b = 0, c = -1;
		
		//boolean bool = (++a > 1) || (++b > 1);
		
		// boolean bool = --a > 1 && ++b > 1 || ++c > 0;
		
		// boolean bool = a++ > 0 || b-- >= 0 && c++<= 0;
		boolean bool = b-- >= 0 && c++<= 0 || a++ > 0; //순서 변경시 값 달라짐 
		
		System.out.println("boo1 : " + bool);
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		
	}
	
}
