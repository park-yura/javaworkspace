package kr.ac.kopo.day08.problem;

import java.util.Random;

public class FigureMain {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int kind = rd.nextInt(4)+1; //도형의 종류를 표현할 랜덤한 숫자
		int rN = rd.nextInt(10)+1; // 10 이하의 랜덤정수
		int rN2 = rd.nextInt(10)+1;// 10 이하의 랜덤정수
				
		switch (kind) {
		case 1 : 
			Square s = new Square("정사각형", rN); 
			s.area();
			break;
		
		case 2 : 
			Rectangle r = new Rectangle("직사각형", rN, rN2);
			r.area();
			break;
			
		case 3 : 
			Triangle t = new Triangle("삼각형", rN, rN2);
			t.area();
			break;
		
		case 4 : 
			Circle c = new Circle("원", rN);
			c.area();
		
		}
	}
}
