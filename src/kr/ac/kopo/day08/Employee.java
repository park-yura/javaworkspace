package kr.ac.kopo.day08;

public class Employee { 
	//사원 객체
	
	String 	name;
	int 	salary;
	String 	grade;
	static int employeeCnt;  // 총사원수
	
	//매개변수가 없는 생성자 만들어주는게 좋음
	Employee() {
		Employee.employeeCnt++;
	}
	
	//기본생성자
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		Employee.employeeCnt++;
	}
	
	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}
	
	static void employeeCntInfo() {
		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");
	}

}

// 클래스 변수, 클래스 메소드는 앞에 클래스명을 붙여주는 것이 좋다. 