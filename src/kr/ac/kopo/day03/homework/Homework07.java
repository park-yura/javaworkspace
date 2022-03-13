package kr.ac.kopo.day03.homework;
// 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요
public class Homework07 {
	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan += 3) {
			
			for(int i = 1; i <= 9; i++) {
			
				for (int j = 0; j < 3 ; j++) {
					
					if(dan + j < 10)
					System.out.printf("%d * %d = %d\t", dan + j, i, (dan+j)*i);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
	