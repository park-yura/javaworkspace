package kr.ac.kopo.day08.extend;


// 관리자(Manager)는 사원(Employee)의 한 형태다라는 조건을 부합 => 상속관계 표현
public class Manager02 extends Employee {

	Employee[] empList; // 관리사원 목록
	
	Manager02() {} //기본생성자
	
	Manager02(String name, int salary, String grade, Employee[] empList){
//부모에만 있으면 this, 부모 자식 다 있으면 super로 구분
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	
	}
	
	@Override // 코드주석. 여기나와있는 메소드는 부모꺼 가져온거야!
	void info() {
		super.info();
		//그냥 info를 적으면 본인의 info를 가져옴 -> 메소드 오버라이딩 발생
		//부모 클래스에 있는거 가져오면 super
		//name, salary, grade는 Employee에 있음 
		
		System.out.println("---------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("---------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("---------------------------");
	}
}
