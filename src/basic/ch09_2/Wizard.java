package basic.ch09_2;

public class Wizard {
	
	int health;
	int attackPower;
	
	
	public Wizard(int he, int at) {
		health = he;
		attackPower = at;
	}
	
	public void warriorGA(String name, int ap) {//GetAttak ,//attak power
		health -= ap;
		System.out.println("마법사가 " +name+"에게" +ap+"데미지를 입었습니다.");
		System.out.println("남은 체력 : " + health);
	}
}
