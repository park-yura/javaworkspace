package kr.ac.kopo.day02;

public class SwitchMain02 {

	public static void main(String[] args) {
	
		String str = new String("Hello");
		
		switch(str) {
		case "Hello" :
			System.out.println("TRUE");
			break;
		default : 
			System.out.println("FALSE");
		}
		
		
		/* 
		   System.out.println(a == "Hello");
		   a가 가르키는 값이 이게 맞니? 문자/문자열은 동등비교 연산자(==)가 안먹힌다!
		   그래서 .equals 같은 거 써줘야함
		   하지만 이제 switch문 써주면 됨
		 */
		
		
	}
}
