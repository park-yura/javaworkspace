package kr.ac.kopo.day05;

// 실행클래스 (하나의 실행클래스와 여러개의 참조 클래스)
public class CarMain {

	public static void main(String[] args) {
		
		/*
		String[] names = new String[2];
		String[] company = new String[2];
		
		names[0] = "소나타";
		company[0] = "현대";
		*/
		
		Car c = new Car(); //클래스명 변수 = new 클래스명();
		c.name = "소나타";
		c.company = "현대";
		
		Car c2 = new Car();
		c2.name = "K9";
		c2.company = "기아";
		
		System.out.println("첫번째 자동차명 : " + c.name);
		System.out.println("두번째 자동차명 : " + c2.name);
	}
}
