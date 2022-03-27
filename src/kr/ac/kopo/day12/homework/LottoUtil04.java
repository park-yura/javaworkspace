package kr.ac.kopo.day12.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LottoUtil04 {

	Scanner sc = new Scanner(System.in);
	
	public void start() {
		int cnt = sc.nextInt();
		System.out.println("게임 수를 입력하세요 : " + cnt);
		
		for(int i = 0; i < cnt; i++) {
			System.out.println("게임" + (i+1) + " : " + Arrays.toString(getNumbers()));
		}
	}
	
	private int[] getNumbers() {
		//try - catch

		int [] lotto = new int [6];

		for(int i = 0; i < lotto.length; i++)
			try { 
				lotto[i] = (int)(Math.random() * 45) + 1;
			} catch(Exception e) {
				for (int j = 0; j < lotto.length; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
				}
			} 
		}
		return lotto;
	}
}
		
