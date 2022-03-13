package kr.ac.kopo.day03.homework;
//구구단을 출력하세요

public class Homework05 {
	public static void main(String[] args) {
		
		for(int i = 2; i <= 9 ; i++) {
			System.out.printf("*** %d단 ***\n", i);
			
			for(int j = 1; j <= 9 ; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			
		}
	}
}
