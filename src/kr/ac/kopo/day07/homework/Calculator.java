package kr.ac.kopo.day07.homework;

public class Calculator {

	static void plus(int num1, int num2) {
		System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
	}
	
	static void minus(int num1, int num2) {
		System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
	}
	
	static void multiple(int num1, int num2) {
		System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
	}
	
	static void divide(int num1, int num2) {
		double num3 = ((double) num1 / num2);
		System.out.printf("%d / %d = %.2f\n", num1, num2, num3);
	} 	
	
	static void primeNumber(int num) {
		boolean result = true;
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				result = false;
				System.out.println(num + " 소수체크: " + result);
				return;
			}
		}
		System.out.println(num + " 소수체크: " + result);
	}
}
