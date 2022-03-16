package kr.ac.kopo.day06;

class 고양이 {
	void 잠을잔다() {
		System.out.println("고양이가 잠을 잡니다");
	}
	void 냐옹거린다() {
		System.out.println("고양이가 냐옹합니다");
	}
}

class Method {
	// 메소드 오버로딩(overloading)
	// 같은 클래스내에서 메소드명이 같으며서 매개변수의 개수나 타입이 서로 다른것
	// println 메소드는 이미 메소드 오버로딩 지원(int, long, float...)
	
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출..."); // 위에 int 없어도 double이 int 수용 가능하기 때문에 에러 안남
	}
	
	void call(boolean b) {
		System.out.println("call(boolean) 메소드 호출...");
	}
	
	void call(String str, int n) {
		System.out.println("call(String, int) 메소드 호출...");
	}
}

public class MethodMain02 {
	
	public static void main(String[] args) {
	
		Method m = new Method();
		m.call();
		m.call(10);
		m.call(10.3);
		m.call(true);
		m.call("acB", 5);
		
		
		고양이 나비 = new 고양이(); //인스턴스 객체 생성 new
		
		나비.냐옹거린다();  // 객체명.메소드(); - 명령을 내림
			
	}
}
