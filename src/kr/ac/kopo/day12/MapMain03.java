package kr.ac.kopo.day12;

public class MapMain03 {

	public static void main(String[] args) {
		
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		if(m.equals(m2)) { //equals 메소드는 object에 있는 equals 메소드를 사용(주석값 비교) -> equals 메소드를 오버라이딩 해야함 
			System.out.println("m == m2");
		} else {
			System.out.println("m != m2");
		}
		
		/*
		if(s01.equals(s01)) { //객체와 객체가 서로 같은지를 비교하기 위해서는 equals 메소드 사용 
			System.out.println("s01 == s02");
		} else {
			System.out.println("s01 != s02");
		}
		*/
	}
}
