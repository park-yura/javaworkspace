package kr.ac.kopo.day09.abs03;

import java.util.Scanner;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	
//	public Menu() {
//		this.sc = new Scanner(System.in);
//	}
	
	private String select() {
		System.out.print("프린터를 선택하세요(1.LG  2. SAMSUNG  3.HP) => ");
		String type = sc.nextLine();
		return type;
	}
	
	private void print(String type) {
		Printer p = null;
		
		switch(type) {
		case "1" :
			p = new LGPrinter(); // 상속관계의 경우 부모의 참조변수를 가짐
			break;
		case "2" :
			p = new SamsungPrinter();
			break;
		case "3" :
			p = new HPPrinter();
			//	hp.hpPrint(); //상속으로는 자식클래스 제어방법 없음
			break;
		}
		if (p != null) {
			p.print(); // 내가 가리키고 있는 객체가 어떤 것인지에 따라 오버라이드된 메소드가 실행된다.
			
		}
	}
	
	public void process() {
		
		String type = select();
		print(type); // work(type) 가능
	}
}
