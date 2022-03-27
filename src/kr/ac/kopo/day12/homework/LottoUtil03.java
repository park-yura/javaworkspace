package kr.ac.kopo.day12.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LottoUtil03 {

	Scanner sc = new Scanner(System.in);
	
	public void start() {
		int cnt = sc.nextInt();
		System.out.println("게임 수를 입력하세요 : " + cnt);
		
		for(int i = 0; i < cnt; i++) {
			System.out.println("게임" + (i+1) + " : " + Arrays.toString(getNumbers()));
		}
	}
	
	private int[] getNumbers() {
		//List
		int [] lotto = new int [6];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= 45 ; i++) {
			list.add(i);
		}
		
		for (int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random() * 45) + 1; 
			list.remove(num); //동일데이터 삭제 
		}
	
		return lotto;		
	}
}
