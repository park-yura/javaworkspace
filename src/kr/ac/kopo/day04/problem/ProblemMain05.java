package kr.ac.kopo.day04.problem;

import java.util.Scanner;

public class ProblemMain05 {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Left(-), Right(+) : ");
		String direction = sc.next();
		System.out.print("Start Index(0 - 4) : ");
		int index = sc.nextInt();
		
		if (direction == "+") {
			for(int i = index; i < nums.length; i++) {
				System.out.print(nums[i]+" ");
			}
			for(int i = 0; i < index; i++) {
				System.out.print(nums[i]+" ");
			}
		}
		
		
	}
}
