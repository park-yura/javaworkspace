package kr.ac.kopo.day03.exam;

public class ExamMain01 {

	public static void main(String[] args) {

/*
 	***** 행 우선 방식
 	*****
 	*****
 */
		
		
		//12345
		int num = 1;
		for(int i =1; i <= 5; i++) {
			System.out.print(num++);
		}
		System.out.println();
		
		//54321
		for(int i = 1; i <= 5; i++) {
			System.out.print(6-i);
		}
		System.out.println();
		
		//54321
		for(int i = 5; i >= 1; i--) {
			System.out.print(i);
		}
		System.out.println();
		
		//이중 for문
		for(int i = 1; i <= 3; i++) {
			
			for (int j = 1; j <= 5 ; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		/*
		for(int i = 1; i <= 5 ; i++) {
			System.out.print("*"); //*****
			System.out.println();
		}
			
		
		while ~ true 무한루프  for(; ;) 무한루프
		 i, j, k ...
		for(int i = 1; i <=10 ; i++) {
		for(int i = 10; i >= 1 ; i--) {
		for(int i =0; i <= 9 ; i++) {
		for(int i = 5; i <= 14 ; i++) {	
		for(int i = 5; i >= -4 ; i--) {	
			System.out.println("Hello");
		}
		*/
	}
}
