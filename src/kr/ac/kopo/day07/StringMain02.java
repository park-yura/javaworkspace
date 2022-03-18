package kr.ac.kopo.day07;

public class StringMain02 {

	public static void main(String[] args) {
		
//		String str = "Hello"; " " => 상수문자열 문자의 공간이 계속 만들어 지는게 아님, 상수를 저장하기 위한 공간이 있음 
//		String str2 = "Hello"; // 상수영역을 누가 사용하지 않아도 한번 만들어지면 소프트웨어 종료되기 전까지 삭제가 되지 않음
// 		참조변수와 참조변수는 주소비교, 기본형 변수는 글자비교?
//		문자열 비교 => equals - 귀찮을땐 switch문	
//		소문자와 대문자 다른 글자로 인식
		
		String str = new String("Hello"); //heap 영역에 hello의 영역이 새로 잡힌다.(공간이 따로따로 잡힘)
		String str2 = new String("HELLO"); 
		
		
		
		if (str == str2) { // 동등비교 => 주소값이 같냐고 물어보는 중
			System.out.println("주소비교 : 같다");
		} else {
			System.out.println("주소비교 : 다르다");
		}
		
		if(str.equals(str2) == true) { // str 문자와 str2 문자와 같나요? true, false
			System.out.println("문자열비교: 같다");
		} else {
			System.out.println("문자열비교: 다르다");
		}
		
		System.out.println("대소문자 관계없이 문자열 비교 : " + str.equalsIgnoreCase(str2));
		
		String[] names = {"홍길동", "윤길동", "홍길동", "박길동", "홍가네", "한길동"};
		
		System.out.println("< 전체 이름이 홍길동인 사람 출력 >");
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 성이 홍씨인 사람 출력 >");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름이 길동인 사람 출력 >");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름에 홍이 포함된 사람 출력 >");
		for(String name : names) {
			if(name.contains("홍")) { //contains : 어딘가에 "a"가 있는 문장 출력
				System.out.println(name);
			}
		}
		
		
		str = "apple";
		str2 = "banana";
		
		int compare = str.compareTo(str2);
		if(compare == 0) {
			System.out.println(str + " == " + str2);
		} else if (compare > 0) {
			System.out.println(str + " > " + str2);
		} else { //compare < 0
			System.out.println(str + " < " + str2);
		}
	}
}
