package basic.ch22;

public class ToyRobot implements RemoteController, SoundEffect{

	int withd;
	int height;
	String color;
	
	@Override
	public void turnOff() {
		System.out.println("장남감 로봇을 킨다");
		
	}
	@Override
	public void turnOn() {
		System.out.println("장남감 로봇을 끈다.");

		
	}
	@Override
	public void soundOn() {
		System.out.println("~~~!!!~~~");
		
	}
	

}
