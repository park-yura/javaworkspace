package kr.ac.kopo.day08.problem;

public class Figure {

	String name;
	int width; // 가로
	int height; // 세로
	int r; //반지름
	int area; //면적
	static double PI = Math.PI;
	
	public Figure() {
		
	}
	// 1-정사각형, 2-직사각형, 3-삼각형, 4-원
	
	public Figure(String name, int r) { // 원, 정사각형
		this.name = name;
		this.r = r;
	}
	
	public Figure(String name, int width, int height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	public void area() {
		System.out.println(name + "의 면적은 " + area + "입니다.");
	}
}
