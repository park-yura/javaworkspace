package kr.ac.kopo.day02;

/*
 * 반복문을 위한 기본요소 4가지
 * 1. 반복할 문장(statement)
 * 2. 시작값(init)
 * 3. 증가/감소(incre/decre)
 * 4. 종료조건(expr)
 * 
 
 	한바퀴 뛸차례다;
 	while(!열바퀴 다 뛰었니?) {
 		운동장을 한바퀴 뛴다;
 		바퀴수 증가;
 	} 
 	
 	1. init;
 	while(2. expr) {
 		3. statement;
 		4. incre/decre;
 	}
 	5. 
 	
 	1 -> 2 조건 참   -> 3 -> 4
 	  -> 2 조건 참   -> 3 -> 4
 	  -> 2 조건 참   -> 3 -> 4
 	  -> 2 조건 거짓  -> 5
 	  
 	  -----------------------------------------

 	  for(1. init; 2. expr; 3. incre/decre) {
 	  	4. statment;
 	  }
 	  5. 
 	  
 	  1 -> 2 조건 참  -> 4 문장 수행 -> 3 증감
 	    -> 2 조건 참  -> 4 문장 수행 -> 3
 	    -> 2 조건 참  -> 4 문장 수행 -> 3
 	    -> 2 조건 거짓 -> 5 종료 
 */

public class LoopMain01 {

	public static void main(String[] args) {

		System.out.println("------ for 반복문 시작 -------");

		for(int cnt = 1; cnt <= 5 ; cnt++) { 				//여기 cnt는 for문 안에서 정의되고 있기 때문에 종료되면 cnt 변수 사라짐
			System.out.println("Hello");
		}
		
		System.out.println("------ for 반복문 종료 -------");
		
		//동명의 변수 선언문 에러가 안나는 이유: 변수의 라이프사이클 때문에(블럭 스코프를 따름)
		
		
		System.out.println("------ while 반복문 시작 -------");

		int cnt = 1;										//여기 cnt는 살아있음: while 안에 없음
		while(cnt <= 5) {
			System.out.println("Hello");
			++cnt;
		}
		System.out.println("------ while 반복문 종료 -------");
		
	}
}





