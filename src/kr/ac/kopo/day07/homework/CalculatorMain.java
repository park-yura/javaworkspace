package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수: ");
		int num1 = sc.nextInt();
		System.out.println("정수: ");
		int num2 = sc.nextInt();
		
		Calculator.plus(num1, num2);
		Calculator.minus(num1, num2);
		Calculator.multiple(num1, num2);
		Calculator.divide(num1, num2);
		Calculator.primeNumber(num1);
		Calculator.primeNumber(num2);
	}
}
