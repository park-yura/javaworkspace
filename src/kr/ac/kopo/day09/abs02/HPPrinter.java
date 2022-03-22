package kr.ac.kopo.day09.abs02;

public class HPPrinter extends Printer{

	public void hpPrint() {
		System.out.println("HP프린터에서 출력중...");
	}

	//무조건 강제성 부여 print라는 메소드도 만들어라! => 표준화 시켜면서 변화에 둔감하게 만들어줌
	@Override
	public void ptint() {
		System.out.println("HP프린터에서 출력합니다...");
		
	}
}
