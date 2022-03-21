package kr.ac.kopo.day08.extend;

public class Employee {

	String name;
	int salary;
	String grade;
	
	Employee() {
		//기본생성자 생성 후 매개변수 작성
	}
	
	// name, salary, grade를 초기화할 수 있는 employee 생성자
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	
	}
	
	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
	

	}
}
