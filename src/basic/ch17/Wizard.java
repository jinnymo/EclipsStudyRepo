package basic.ch17;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name,hp);//부모 생성자 호출
	}
	@Override
	public void attack() {
		System.out.println("법사가 기본공격을 합니다.");
	}
	public void freezing() {
		System.out.println("동결 공격");
	}
}
