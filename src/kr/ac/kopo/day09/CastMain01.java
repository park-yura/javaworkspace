package kr.ac.kopo.day09;

public class CastMain01 {

	/*
	public static void print(Child01 c) {
		c.print();
	}
	
	public static void print(Child02 c) {
		c.print();
	}
	*/
	
	public static void print(Parent p) { //부모클래스로 받은 것..Parent p = 묵시적 형변환
		p.print();
		//서로 상속관계인 경우, 자식의 속성을 다 쓰는게 아니라 부모의 속성을 묵시적 형변환하여 쓴다
		
		if(p instanceof Child01) {
			Child01 c = (Child01)p; //명시적 형변환
			c.study();
			c.sleep();
		} else if (p instanceof Child02) {
			Child02 c = (Child02)p;
			c.sing();
			c.play();
		} else {
			
		}
		
//		System.out.println("Child01 : " + (p instanceof Child01)); //서로 상속관계일때만 instanceof 사용 가능
//		System.out.println("Child02 : " + (p instanceof Child02)); 
//		System.out.println("Parent : " + (p instanceof Parent)); 
	}
	
	public static void main(String[] args) {
		
		print(new Parent());
//		print(new Child01());
//		print(new Child02());
		
		/*
		Child01 c01 = new Child01();
		print(c01);
		
//		Child01 c01 = new Child01();
//		c01.print();
		
		Child02 c02 = new Child02();
		print(c02);
//		c02.print();
		
		Parent p = new Parent();
		p.print();
		*/
	}
}
