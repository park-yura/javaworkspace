package kr.ac.kopo.day06.homework;

import java.util.Scanner;

public class IcecreamStudy {
	String name;
	int price;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림 몇개 구입하시겠습니까? => ");
		int count = sc.nextInt();
		sc.nextLine(); // 숫자 문자 외 . 이런거 들어오면 오류남
		
		IcecreamStudy[] iceArr = new IcecreamStudy[count]; //클래스이름[] 주소값만 만들어진 것, 실제 아이스크림을 만들기 위해 루프 안에 작성해준다
			for(int i = 0; i < count; i++) {
	
				iceArr[i] = new IcecreamStudy(); //클래스이름() 실제 아이스크림이 만들어진 것
				
				System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
				System.out.print("아이스크림명 : ");
				iceArr[i].name = sc.nextLine(); // .next는 해결책이 아님!!
				System.out.print("아이스크림 가격 : ");
				iceArr[i].price = Integer.parseInt(sc.nextLine());
			
		}
		System.out.println("< " + iceArr.length + "개 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println(i+1 + "\t" + iceArr[i].name + "\t" + iceArr[i].price);
		}
		/*
		int no = 0;
		for(Icecream ice : iceArr) {
			System.out.println(++no + "\t" + ice.name + "\t" + ice.price);
		}
		*/
	}
}
