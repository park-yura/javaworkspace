package kr.ac.kopo.day04.homework;
//마름모 제외
public class HomeworkMain06 {

	public static void main(String[] args) {
		
		int star = 6;
		for (int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= 10-star || j >= star) {
					System.out.print('*');
				}else {
					System.out.print('-');
				}
			}
			
			System.out.println();
			if (i < 5)
				star++;
			else 
				star--;
				
		}
	}
}
