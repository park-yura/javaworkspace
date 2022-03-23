package kr.ac.kopo.day10.inter;

public class SamsungTV implements TV {

	public SamsungTV() {
		System.out.println("삼성티비를 구매했습니다");
	}
	
	@Override
	public void powerOn() {
		System.out.println("POWER ON");

	}

	@Override
	public void powerOff() {
		System.out.println("POWER OFF");

	}

	@Override
	public void channelUp() {
		System.out.println("CHANNEL UP");

	}

	@Override
	public void channelDown() {
		System.out.println("CHANNEL DOWN");

	}

	@Override
	public void volumeUp() {
		System.out.println("VOLUM UP");

	}

	@Override
	public void volumeDown() {
		System.out.println("VOLUM DOWN");

	}

	@Override
	public void mute() {
		System.out.println("MUTE");

	}

}
