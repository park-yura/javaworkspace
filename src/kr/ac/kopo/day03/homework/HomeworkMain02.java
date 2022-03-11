package kr.ac.kopo.day03.homework;

public class HomeworkMain02 {

	public static void main(String[] args) {
		
		// Math.random(); // 0 ~ 1 미만의 숫자 추출
		// System.out.println((int)(Math.random() * 30) + 1); 0 ~ 10 미만의 숫자 추출
		
		/*
		 int max01 = num1 > num2 ? num1 : num2;
		 int max02 = num3 > num4 ? num3 : num4;
		 int max = max01 > max02 ? max01 : max02;
		 */
		
		int num1 = (int)(Math.random() * 30) + 1;
		int num2 = (int)(Math.random() * 30) + 1;
		int num3 = (int)(Math.random() * 30) + 1;
		int num4 = (int)(Math.random() * 30) + 1;
		
		System.out.println(num1 + " : " + num2 + " : " + num3 + " : " + num4);
		
		int max = num1 > num2 ? num1 : num2; // 대입연산자가 제일 느림
		
		if (max < num3) {
			max = num3;
		}
		
		if (max < num4) {
			max = num4;
		}
		
		System.out.println("가장 큰수 :" + max);
	}
}
