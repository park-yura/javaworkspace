package kr.ac.kopo.day10.inter;

public class UserMain {

	public static void main(String[] args) {
		
//		TV tv = new SamsungTV();
		TV tv = new LGTV(); //묵시적 형변환 : 자식의 메서드를 실행
		tv.powerOn();
		tv.channelDown();
		tv.channelUp();
		tv.volumeUp();
		tv.powerOff();
		
	}
}
