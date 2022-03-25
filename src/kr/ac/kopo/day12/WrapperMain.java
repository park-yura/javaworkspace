package kr.ac.kopo.day12;


/* <의미하는 바 알기>
 * generic에서는 Wrapper 클래스 형태밖에 안됨 
 * Wrapper Class : 기본자료형을 레퍼런스 타입으로 만들어주는게 wrapper class
 
  기본자료형 				Wrapper Class
  boolean				Boolean
  char					Char
  byte					Byte
  short					Short
  int					Int
  long					Long	
  float					Float
  double				Double
 
 	class Boolean {
 		private boolean value;
  
 */
public class WrapperMain {
	
	public static void main(String[] args) {
		
		int i = 100;
		Integer i2 = new Integer(100);
		Integer i5 = Integer.valueOf(100);
		Integer i3 = 100; // = auto boxing (레퍼런스 객체형으로 boxing) 원래 이렇게 쓰면 안됨, integer는 객체이기 때문
		int i4 = new Integer(100); // = auto unboxing (기본자료형을 참조자료형으로 갖게 해주고 싶었는데 레퍼런스 클래스형인 경우는 내부적으로 알아서 만들어줌)
	
		System.out.println(Integer.parseInt("123") + 100); //숫자 string을 int로 기본자료형(int) 
		System.out.println(Integer.valueOf("123")+ 100); // integer레퍼런스타입
	}
}
