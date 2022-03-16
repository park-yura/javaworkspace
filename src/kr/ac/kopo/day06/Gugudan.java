package kr.ac.kopo.day06;

public class Gugudan {

	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
	
	void print() {  //메소드 오버로딩을 지원하기 때문에 printAll 안써도 됨
		
		for(int dan = 2; dan <= 9; dan++) {
			
			print(dan);
			
			/*
				System.out.println("*** " + dan + "단 ***");
				for(int i =1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
				}
			  
			 */
			
		}
	}
}
