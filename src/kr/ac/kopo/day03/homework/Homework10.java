package kr.ac.kopo.day03.homework;

public class Homework10 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9 ; i++) {
			for(int j = 1; j <= 9; j++) {
				//상단 5줄 
				if (i <= 5) {
					if(j > i && j < 10-i){
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
				//하단 4줄
				if (i > 5) {
					if(j > 10-i && j < i) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
			}
			
			System.out.println();
		}
	}
		
}

