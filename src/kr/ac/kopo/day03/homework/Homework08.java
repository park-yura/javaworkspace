package kr.ac.kopo.day03.homework;

public class Homework08 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9 ; i++ ) {
			if(i <= 5) {
				for(int j = 2 ; j <= i; j++) {
					System.out.print("-");
				}
				for(int j = 5; j >= i ; j--) {
					System.out.print("*");
				}
			} else {
				for(int j = 4; j >= i-4; j--) {
					System.out.print("-");
				}
				for(int j = 1; j <= i-4 ; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
