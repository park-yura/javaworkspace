package kr.ac.kopo.day06;

import java.util.Scanner;

public class Gugudan {
	
	int total = 10; // 같은 클래스 안에 있는 매개변수는 공통의 변수 , 누구나 접근 가능
	
	int getDan() { //매개변수 없음
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
	}

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
