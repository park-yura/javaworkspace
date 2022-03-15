package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		int[] sum = new int[2]; // [0]: 짝수 총합 ~ [1]: 홀수 총합
		Scanner sc = new Scanner(System.in);
		
		int loc = 0;
		while (loc < nums.length) {
			System.out.print(loc+1 + "번째 정수 입력 : ");
			nums[loc] = sc.nextInt();
			if(nums[loc] < 0) // >= 면 continue 사용 안해도 됨
				continue;
			sum[nums[loc] % 2] = nums[loc++];
			
		
		
		/* continue 사용보다 이 코드가 더 좋은 코드임!
		 * 개수를 알고자하면 while보단 for
		 
		for(int i = 0; i < nums.length;) {
			System.out.print(i + 1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if(nums[i] >= 0) {
				sum[nums[i] % 2] += nums[i];
				i++;
			}
		*/
		
		/* do ~ while문
		for(int i = 0; i < nums.length; i++) {
			do{
				System.out.print(i+1 + "번째 정수 입력 : ");
				nums[i] = sc.nextInt();
			}while(nums[i] < 0); // do~ while로 음수를 받았을 때 다시 입력시킴
			sum[nums[i] % 2] += nums[i];			
		}
		*/
		
		String[] title = {"짝수", "홀수"};
		for(int mod = 0; mod <= 1; mod++) {
			System.out.println("< " + title[mod] + ">");
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] % 2 == mod) {
					System.out.print(nums[i] + " ");
				}
			}
			System.out.println();
			System.out.println(title[mod] + "총합 : " + sum[mod]);
		}
		}
		
	}
}
