package kr.ac.kopo.day09;

public class CastMain02 {

	public static void main(String[] args) {
		
//		Child01 c = (Child01)new Parent(); //실행시 오류발생 : 부모공간만 만들어진 상황
		
		Parent p = new Child01();
		Child01 c2 = (Child01)p; //일시적인 형변환
		
		c2.sleep();
		c2.study();
	}
}
