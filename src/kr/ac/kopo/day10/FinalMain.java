package kr.ac.kopo.day10;

import java.util.Random;

/* final */class Super {
	private /* final */ double PI = 3.14; // final 상수변수 대문자


	Super() {
		PI = 3.141592;
	}
	
	/* final */ void call() {
		System.out.println("SUPER::call()");
	}
}

class Sub extends Super {
	void call() {
		System.out.println("Sub::call()");		
	}
}


class MyRandom extends Random { //원래 제공하는 클래스를 받아서 내 입맛에 맞게 수정할 수 있음, String은 안됨(final)

	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1;
	}

	public int nextInt(int start, int end) {
		return super.nextInt(end - start) + start;
	}
	
}

public class FinalMain {

	public static void main(String[] args) {

		MyRandom r = new MyRandom();
		int random = r.nextInt(2);
		System.out.println(random);
		
		/*
		Random r = new Random();
		int random = r.nextInt(90) + 10; // 10 ~ 99
		int random = r.nextInt(10) + 1; // 1 ~ 10
		*/
	}
}

