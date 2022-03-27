package kr.ac.kopo.day12.homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class LottoUtil02 {

	Scanner sc = new Scanner(System.in);
	
	public void start() {
		int cnt = sc.nextInt();
		System.out.println("게임 수를 입력하세요 : " + cnt);
		
		for(int i = 0; i < cnt; i++) {
			System.out.println("게임" + (i+1) + " : " + Arrays.toString(getNumbers()));
		}
	}
	
	private int[] getNumbers() {
		//HashSet
		
		int [] lotto = new int [6];
		HashSet<Integer> set = new HashSet<Integer>();
		
		while (set.size() < 6) {
			set.add((int)(Math.random() * 45)+1);	
		}
		
		return lotto;		
	
	}
}
