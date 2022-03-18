package kr.ac.kopo.day07;

public class Member {

		String name; // 멤버벼수 선언시 String name = "알수없음";써도됨, 변하지 않는 값일때
		int age;
		String bloodType;
		
		Member() {
			/*name = "알수없음";
			age = -1;
			bloodType = "알수없음";
			*/
			this("알수없음", -1, "알수없음");
		}
		
		Member(String n) {
			name = n;
			age = -1;
			bloodType = "알수없음";
		}
		
		Member(String name, int age) {
//			Member(name, age, "알수없음"); // 메소드라고 인식(new를 썼을때만 생성자라고 인식
			this(name, age, "알수없음"); //제일 첫 라인에 있어야함
			
		}
		
		Member(String name, int age, String bloodType) {
			this.name = name; //생성자 이름이 멤버변수와 같은게 좋음
			this.age = age;  // 지역변수가 우선순위가 높음
			this.bloodType = bloodType;
		}//객체명. 멤버변수 만들어주려면 this. Member class를 만들어준 멤버변수 
		 //멤버변수 - 생성자 - 메소드
		
		void info() {
			System.out.println("이름 : " + name 
					+ ", 나이 : " + age + ", 혈액형 : " + bloodType);
		}
}


