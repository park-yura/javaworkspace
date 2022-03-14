package kr.ac.kopo.day04.homework;

public class HomeworkMain02 {
// 제어문 3번 문제
	public static void main(String[] args) {

		//100m
		int snail = 0, hour = 0;
		
		while(snail < 100) {
			snail += (snail < 50 ? 5-2 : 5-2);
			System.out.println("[" + ++hour + "시간 후] 달팽이가 올라간 총 높이 : " + snail + "M");
		}
		
		
		
		
		/*
		101m
		int snail = 0, hour = 0;
		
		while((snail += 5) < 100) {
			snail += snail < 50 ? -1 : -2;
			System.out.println("[" + ++hour + "시간 후] 달팽이가 올라간 총 높이 : " + snail + "M");
			
		}
		System.out.println("[" + ++hour + "시간 후] 달팽이가 올라간 총 높이 : " + snail + "M");
		 * 
		 */
		
		
		/* 
		 * 102m
		int snail = 0, hour = 0;
		
		while(snail < 100) {
			snail += 5;
			snail += snail < 50 ? -1 : -2;
			System.out.println("[" + ++hour + "시간 후] 달팽이가 올라간 총 높이 : " + snail + "M" );
		}
		*/
	}
}
