package kr.ac.kopo.day01;

/*
 	
 */

public class PrintMain {
	
	public static void main(String[] args) {
	
		System.out.println(10);
		System.out.println(12.34);
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true);
		System.out.print(23);
		System.out.println("살");
		System.out.println(23 + "명");
		System.out.println(10 + 20);
		System.out.println(10 + "+" + 20 + "=" + (10+20));
		
		System.out.printf("%d살\n", 23);
		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		System.out.printf("[%-7d]\n", 1200);
		System.out.printf("[%-7d]\n", 950);
		System.out.printf("[%-7d]\n", 15000);
		System.out.printf("[%04d]\n", 35);
		System.out.printf("[%.3f]\n", 12.46875);
		System.out.printf("%b\n", true);
		
	}

}
