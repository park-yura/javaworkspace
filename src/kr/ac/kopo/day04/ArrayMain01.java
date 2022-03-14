package kr.ac.kopo.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		/*
		int배열의 주소를 기억하기 위함 , arr은 지역변수
		지역변수는 자동 초기화가 안됨, new를 사용해야 초기화 가능
		int[] arr;
		System.out.println("arr : " + arr); 오류남
		*/
		
		int[] arr; 
		
		//정수 5개를 가지는 배열 생성
		arr = new int[5]; //arr의 5개 주소값 찍힘
		
		//arr = new int[10]; 5에서 10으로 변경하면 주소값 변경됨
		System.out.println("arr : " + arr);
		System.out.println("배열의 원소 총 개수 : " + arr.length + "개");
		System.out.println("첫번째 원소 : " + arr[0]);
		System.out.println("두번째 원소 : " + arr[1]);
		System.out.println("세번째 원소 : " + arr[2]);
		System.out.println("네번째 원소 : " + arr[3]);
		System.out.println("다섯번째 원소 : " + arr[4]);
		
		System.out.println("----------------------");
		
//		for(int i = 0; i < 5; i++) { index의 i; 배열의 원소가 0부터 시작하기 때문에 0으로 초기화해주는게 좋다; i < 5에서 배열의 개수가 5이기 때문에 5보다 작다로 사용해 주는 것이 좋음
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 원소 : " + arr[i]);
		}
		
		System.out.println("----------------------");
		//각 원소값에 10, 20, 30, 40, 50 대입
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 원소 : " + arr[i]);
		}
	}
}
