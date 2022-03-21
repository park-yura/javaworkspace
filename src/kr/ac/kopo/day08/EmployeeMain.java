package kr.ac.kopo.day08;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		
//		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");
		Employee.employeeCntInfo(); 
		
		Employee e = new Employee("홍길동", 3300, "사원");
		Employee e2 = new Employee("강길동", 3800, "대리");
		
		//e.name()같은 경우는 같은 class 내에서만 써주는게 좋음
		
		e.info();
		e2.info();
		Employee.employeeCntInfo(); //전체 사원수
		
	}
}
