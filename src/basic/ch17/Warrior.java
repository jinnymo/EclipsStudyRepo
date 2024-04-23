package basic.ch17;

public class Warrior extends Hero {
	
	public Warrior(String name, int hp) {
		super(name, hp);//부모 생성자 호출
	}
	
	@Override
	public void attack() {
		System.out.println("전사가 기본공격을 합니다.");
	}

	public void comboAttack(){
		System.out.println(super.name+"2단 공격입니다.");
		//System.out.println(this.name+"2단 공격입니다.");
		//둘다 사용가능
		
	}

}
