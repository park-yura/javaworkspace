package kr.ac.kopo.day09.abs03;

public class Printer {

	private String model;
	
	public Printer() {
		
	}
	
	public Printer(String model) {
		this.model = model;
	}
	
	void print() {
		System.out.println("프린트 중...");
	}
}
