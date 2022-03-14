package kr.ac.kopo.day04.homework;
//모래시계형
public class HomeworkMain07 {

	public static void main(String[] args) {
		
		int start = 0;
		for (int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if (j <= start || j > 9-start) {
					System.out.print('-');
				}else 
					System.out.print('*');
			}
			System.out.println();
			if (i < 5)
				start++;
			else 
				start--;
		}
	}
}
