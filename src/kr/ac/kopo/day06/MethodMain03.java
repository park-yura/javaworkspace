package kr.ac.kopo.day06;

class ExamMethod {    //동명의 패키지 내에서는 동명의 클래스 만들 수 없음
	
	int getSum(int a, int b) {
		return a + b;
	}
	
	int getTotal(int a, int b) {
		int s = 0;
		while (a <= b) {
			s += a++;
		}
		return s;
	}
}

public class MethodMain03 {

	public static void main(String[] args) {
		
		ExamMethod exam = new ExamMethod();
		int sum = exam.getSum(10, 20);
		System.out.println("10 + 20 = " + sum);
		
		//int total = exam.getTotal(1, 10);
		System.out.println("1 ~ 10 총합 : " + exam.getTotal(1, 10));
	}
}
