package starcraft.ver04;

public class StarcaraftTest1 {
	public static void main(String[] args) {
		
		Unit zealot1 = new Zealot("질럿1");
		Unit marine1 = new Marine("마린1");
		Unit zergling1 = new Zergling("저글링1");
		
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
		System.out.println("-----------------------");
		zealot1.attack(marine1);
		zergling1.attack(marine1);
		marine1.showInfo();
	}
}
