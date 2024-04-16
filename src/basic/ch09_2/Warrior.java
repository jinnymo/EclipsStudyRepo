package basic.ch09_2;

public class Warrior {
	
	int health;
	int attackPower;
	
	
	public Warrior(int he, int at) {
		health = he;
		attackPower = at;
	}
	
	public void warriorGA(String name, int ap) {//GetAttak ,//attak power
		health -= ap;
		System.out.println("전사가 " +name+"에게" +ap+"데미지를 입었습니다.");
		System.out.println("전사 남은 체력 : " + health);
	}
	
	
	
}
