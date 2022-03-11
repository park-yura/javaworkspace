package kr.ac.kopo.day03.homework;

import java.util.Random;

public class HomeworkMain01 {

	public static void main(String[] args) {

		Random r = new Random();
		
		int num1 = r.nextInt(30) + 1;
		// 0 ~ 29 + 1 -> 0 ~ 30
		int num2 = r.nextInt(30) + 1;
		int num3 = r.nextInt(30) + 1;
		
		System.out.println(num1 + " : " + num2 + " : " + num3);
		
		int max = num1, min = num2;
		if (num1 < num2) {
			max = num2;
			min = num1;
		}
		/*
		 * 위에 if문과 같은 방식, 하지만 보기 어려움
		 int max = num1 > num2 ? num1 : num2;
		 int min = num1 > num2 ? num2 : num1;
		 */
		
		if(num3 > max) {
			System.out.printf("%3d%3d%3d\n", num3, max, min);
		} else if(num3 > min) {
			System.out.printf("%3d%3d%3d\n", max, num3, min);
		} else {
			System.out.printf("%3d%3d%3d\n", max, min, num3);
		}
		
	}
}
