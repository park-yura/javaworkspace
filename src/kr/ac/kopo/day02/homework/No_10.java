package kr.ac.kopo.day02.homework;

import java.util.Scanner;
/*
	정수 3 개를 입력받아 큰수에서 작은수순으로 출력하는 코드를 작성
*/
public class No_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("세번째 정수 : ");
		int num3 = sc.nextInt();
		
		int max, mid, min;
		
		max = (num1>num2) && (num1>num3) ? num1 : (num2>num3 ? num2 : num3);
		//num1이 num2보다 큰지, num1이 num3보다 큰지 비교. 둘다 참이면 num1이 가장 큼
		
		mid = (num1>num2)? ((num1>num3)? ((num2>num3)? num2 : num3): num1):((num2>num3)?((num1>num3)?num1:num3):num2);
		//     num1이 num2보다 큰데, num3보단 작으면 num1은 중간수                   num1이 num2보다 작은데, num3보다는 크면 num1은 중간수
				
		min = (num1<num2) && (num1<num3) ? num1 : (num2<num3 ? num2 : num3);
		//num1이 num2보다 작은지, num1이 num3보다 작은지 비교. 둘다 참이면 num1이 가장 작음

		if ((int)num1 == max) {
			mid = (num2>num3) ? num2 : num3;
			min = (num2<num3) ? num2 : num3;
		} else if ((int)num2 == max) {
			mid = (num1>num3) ? num1 : num3; 
			min = (num1<num3) ? num1 : num3;
		} else if ((int)num3 == max) {
			mid = (num1>num2) ? num1 : num2;
			min = (num1<num3) ? num1 : num3;
		}
		
		System.out.printf("%d %d %d", max, mid, min);
		
		sc.close();
	}
}
