package kr.ac.kopo.day04.homework;

public class HomeworkMain01 {
// 제어문 7번 문제
	public static void main(String[] args) {
		
		for(int dan = 2; dan <= 9 ; dan += 3) {

			for (int i = 0; i <= 9; i++) {
				
				for(int j = dan; j <= 9 && j < dan+3; j++) {
					if(i == 0)
						System.out.printf("*** %d단 ***\t", j);
					else
						System.out.printf("%d * %d = %d\t",j, i, j*i);
					
				}
				System.out.println();
			}
			System.out.println();
		}	
		
	}
}
