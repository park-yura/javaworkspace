package kr.ac.kopo.day10.inter;

public class LGTV implements TV{ //LGTV는 추상메소드 상속받음 -> 오버라이딩 해줘야함 

	private boolean power;
	private int volumeSize;
	private int channelNo;
	private static final int MAX_CHANNEL_SIZE = 100; // 0 ~ 99, static은 class명. 하고 써주는게 좋음
//	protected~~ 산하의 lgtv 하위 클래스들은 모두 같은 채널 사이즈를 갖는다.(상속 관계에서 사용)
	
	public LGTV() {
		System.out.println("LGTV를 구매했습니다");
		power = false;
		volumeSize = 10;
		channelNo = 3;
	}
	
	@Override // 매개변수, 리턴타입이 무조건 동일해야함 그래야 묵시적 형변환했을 때 자식을 데리고 올 수 있음..?
	public void powerOn() {
		power = true;
		System.out.println("전원을 켭니다");
		info();
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("전원을 끕니다");
	}

	@Override
	public void channelUp() {
		channelNo = ++channelNo % LGTV.MAX_CHANNEL_SIZE; 
		System.out.println("채널을 올립니다");
		info();
	}

	@Override
	public void channelDown() {
		if(channelNo == 0)
			channelNo = LGTV.MAX_CHANNEL_SIZE;
		channelNo--;
		System.out.println("채널을 내립니다");
		info();
	}

	@Override
	public void volumeUp() {
		if(volumeSize < TV.MAX_VOULUME_SIZE)
			volumeSize++;
		System.out.println("음량을 높입니다");
		info();	
	}

	@Override
	public void volumeDown() {
		if(volumeSize > TV.MIN_VOULUME_SIZE) 
			volumeSize--;
		System.out.println("음량을 낮춥니다");
		info();
	}

	@Override
	public void mute() {
		volumeSize = TV.MIN_VOULUME_SIZE;
		System.out.println("음소거중입니다");
		info();
	} 

	public void info() {
		System.out.println("채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}
}
