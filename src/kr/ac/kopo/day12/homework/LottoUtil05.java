package kr.ac.kopo.day12.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LottoUtil05 {

	Scanner sc = new Scanner(System.in);
	
	public void start() {
		int cnt = sc.nextInt();
		System.out.println("게임 수를 입력하세요 : " + cnt);
		
		for(int i = 0; i < cnt; i++) {
			System.out.println("게임" + (i+1) + " : " + Arrays.toString(getNumbers()));
		}
	}
	
	private int[] getNumbers() {
		//Map
		int [] numbers = new int[6];
		Map<Integer, Integer> map = new HashMap<>();
		int cnt = 0;
		
		while(cnt < 6) {
			int num = (int)(Math.random() * 45 + 1);
			if (!map.containsValue(num)) {
				map.put(cnt++, num);
			}
		}
			int index = 0;
			for(Map.Entry<Integer, Integer> data : map.entrySet()) {
				numbers[index++] = data.getValue();
			}
			
			return numbers;	
	}
	
}


