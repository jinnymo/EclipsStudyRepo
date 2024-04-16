package basic.ch09_1;

public class Archor {

	
	int health;
	int attackPower;
	
	
	public Archor(int he, int at) {
		health = he;
		attackPower = at;
	}
	
	public void archorGA(String name, int ap) {//GetAttak ,//attak power
		health -= ap;
		System.out.println("궁수가 " +name+"에게" +ap+"데미지를 입었습니다.");
		System.out.println("아처 남은 체력 : " + health);
	}
}
