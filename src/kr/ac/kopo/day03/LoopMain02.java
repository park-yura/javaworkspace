package kr.ac.kopo.day03;

/*
 * 반복문을 0회 수행할 수도 있음
 * while, for 문 뒤에 ; 안 붙임
 * 
  while(expr) {  
  	statement;
  }
  
  for(init; expr; incre) {
  	statment;
  }
  
  * do while 잘 사용하지는 않음
  
  init;
  do {
  	statement;
  	incre/decre;
  }while(expr);
  
  
 */

public class LoopMain02 {

	public static void main(String[] args) {
		
		//do ~ while은 한번 더 확인함
		int cnt = 1;
		do {
			System.out.println("Hello");
			cnt++;
		} while(cnt <= 5);
		
		System.out.println("==================");
		cnt = 1;
		while(true) {   //true는 무한루프
			System.out.println("Hello");
			++cnt;
			
			if(cnt > 5) {
				break;  //break는 가장 가까운 swtich문, 반복문을 빠져나오는 것
		/*
		 while true ~ break		
		 */
			}
				
		}
	}
}
