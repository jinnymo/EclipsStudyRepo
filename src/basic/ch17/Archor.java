package basic.ch17;

public class Archor  extends Hero {

	public Archor(String name, int hp) {
		super(name,hp);//부모 생성자 호출
	}
	@Override
	public void attack() {
		System.out.println("아처가 기본공격을 합니다.");
	}
	public void fireArrow(){
		System.out.println("불화살 공격");
	}

}
