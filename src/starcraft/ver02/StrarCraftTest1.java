package starcraft.ver02;

public class StrarCraftTest1 {

	public static void main(String[] args) {
		
		//질럿 두마리 생서
		//마리2
		//저글링2마리
		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");

		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린1");
		
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");
		
		for (int i = 0; i < 15; i++) {
			//zealot1.attackMarine(marine2);
		}
		marine2.showInfo();
	}

}
