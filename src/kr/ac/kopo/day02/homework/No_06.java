package kr.ac.kopo.day02.homework;
/*
	알파벳이 모두 몇 자 인지 화면에 출력하시오
*/
public class No_06 {
	
	public static void main(String[] args) {
		
		
		int cap = (int) 'Z' - (int) 'A' + 1;
		int small = (int) 'z' - (int) 'a' +1;
		System.out.println("개수 ? " + (cap + small));
		
	}

}
