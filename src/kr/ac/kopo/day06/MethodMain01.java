package kr.ac.kopo.day06;

public class MethodMain01 {

	/* class 안에 써줘야함
	 반환형 메소드명([파라미터: 모름면 안써도 됨]){
	 	문장;
	 	문장;
	 }
	 메소드와 메소드는 서로 독립적: 각자 어떤 변수를 가지고 있는지 모름
	 (매개변수 =)파라미터'()': 호출자가 피호출자에게 각자의 변수의 값을 전달할 때 전달할 수 있는 통로
	 반환형(return type): 피호출자가 호출자에게 자신의 값을 전달하고 싶을 때 사용 (없으면 void)
	 
	 */
	
	//[메소드의 선언부] 
	static void printStar(int cnt) { // printstar : 피호출자
		for(int i = 0; i < cnt; i++) { //배열에서는 0이 시작이니까 초기화도 0으로..
			System.out.print('*');
		}
		System.out.println();
		
		return; //나를 호출했던 호출자 메소드로 돌아갈거에요!
				//return; - void 가능
				//return 전달값; 피호출자가 호출자에게 돌아갈때 전달하려는 값 작성
				//return ch + cnt; 라면 static int printStar (문자 + 정수 = 정수, 아스키코드로 문자 숫자 반환 가능함)
	}
	
	static void aaa() {
		boolean bool = true;
		System.out.println("A");
		System.out.println("B");
		
		System.out.println("C");
		return; // 모든 메소드에는 return이 들어가있음
	}
	
	public static void main(String[] args) { // main : 호출자 메소드 
//		aaa();
		//객체지향 메소드
		printStar(10); //[메소드의 호출부] 메소드명(); : printStar가 가지고 있는 메소드를 실행시켜줘!
		System.out.println("Hello");
		printStar(5);  // 선언부와 호출부를 맞춰야함 / 선언부에서 (int)삽입된 경우 호출부에서도 (숫자) 넣어줘야한다.
		System.out.println("Hi");
		printStar(1);
		System.out.println("Bye");
		printStar(2);
//		Integer.parseInt(sc.nextLine); - string
//		r.nextInt(10) - int
		
		/*
		static void printStar(char ch, int cnt) { // printstar : 피호출자
		for(int i = 0; i < cnt; i++) { //배열에서는 0이 시작이니까 초기화도 0으로..
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static void main(String[] args) { // main : 호출자 메소드 
		
		//객체지향 메소드
		printStar('*', 10); //[메소드의 호출부] 메소드명(); : printStar가 가지고 있는 메소드를 실행시켜줘!
		System.out.println("Hello");
		printStar('!', 5);  // 선언부와 호출부를 맞춰야함 / 선언부에서 (int)삽입된 경우 호출부에서도 (숫자) 넣어줘야한다.
		System.out.println("Hi");
		printStar('?', 1);
		System.out.println("Bye");
		printStar('#', 2);
		
		 */
		/*절차지향 메소드
		System.out.println("**********"); 
		System.out.println("Hello");
		System.out.println("**********");
		System.out.println("Hi");
		System.out.println("**********");
		System.out.println("Bye");
		System.out.println("**********");
		*/
	}
}
// System.out.println("%d", 10); (%d = string , int)
// ' ' -> char ch

	/*
static int printStar(char ch, int cnt) { 
	for(int i = 0; i < cnt; i++) { 
		System.out.print(ch, cnt);
	}
	System.out.println();
	
	return ch + cnt;
	
	public static void main(String[] args) {

		int code = printStar('A', 10); //피호출자가 대입연산자(=)를 통해 한개만 반환가능
		System.out.println("Hello");
	*/