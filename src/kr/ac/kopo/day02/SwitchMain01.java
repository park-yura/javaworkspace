package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 	1 ~ 3 사이의 정수 입력 :
 	1 입력시 "ONE" 출력
 	2 입력시 "TWO" 출력
 	3 입력시 "THREE" 출력
 	그 외   "ERROR" 출력
 */
public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - 3 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		/*
		 if(num == 1) {
			System.out.println("ONE");
		}
		if(num == 2) {
			System.out.println("TWO");
		}
		if(num == 3) {
			System.out.println("THREE");
		} 여기에 else를 붙여서 작성한다면 3이 아닌 경우만 출력됨 그러면 위에 1 혹은 2도 error가 뜸 
		 */
		
		switch(num) {
		case 1 :
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;
		default :  //default는 case 수행 후 진행됨. case 사이에 있어도 상관x
			System.out.println("ERROR");
		}
		
		/*
		if(num == 1) {
			System.out.println("ONE");
		} else if(num == 2) {
			System.out.println("TWO");
		} else if(num == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		*/
	}
}
