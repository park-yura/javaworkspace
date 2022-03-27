package kr.ac.kopo.day08.homework;

public class Icecream {
	String name; //아이스크림 이름
	int price; //아이스크림 가격
	
	Icecream() {
		this.name = "";
		this.price = 0;
	}
	
	Icecream(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getname() {
		return this.name;
	}
	
	public int getprice() {
		return this.price;
	}
}
