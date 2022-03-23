package kr.ac.kopo.day10.inter;

public interface TV { //가지고 있는 메소드는 다 추상메소드
	// is a 패턴이나 kind a 패턴을 만족시킬수 없음 => 이거는 class도 아니고 기능에 대한 인터페이스이기 때문 

	int MIN_VOULUME_SIZE = 0;
	/*public static final*/ int MAX_VOULUME_SIZE = 50;
	
	/**
	 * 전원을 켜는 기능
	 */
	void powerOn();
	/* public abstract */ void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
	
}
