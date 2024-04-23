package starcraft.ver02;

import java.util.Scanner;

public class StarCraftTest2 {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;
		GateWay gateway = new GateWay(1);
		GateWay gateway2 = new GateWay(2);
		
		Zealot zealot1 = gateway.makeunits("1");
		System.out.println(gateway.getGateWN()+" : "+ gateway.getCount());
		System.out.println(gateway2.getGateWN()+" : "+ gateway2.getCount());
		
		
		
		Marine marine = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");

		Scanner sc = new Scanner(System.in);

		
		
		int unitChoice = -1;
		// while // do while
		// while --> 조건식을 확인하고 코드를 수행
		// do while --> 무조건 한번은 수행을 하고 다시 조건식을 확인하고 수행
		do {
			System.out.println("유닛을 선택하세요");
			System.out.println("1.질럿\t 2.마린\t 3.저글링\t 0.종료");
			unitChoice = sc.nextInt();
			System.out.println("값 확인 : " + unitChoice);
			
			if(unitChoice == ZEALOT){
				
			}else if(unitChoice == MARINE) {
				
			}else if(unitChoice == ZERGLING) {
				
			}else {
				System.out.println("프로그램 종료");
				unitChoice = GAME_END;
			}
		} while (unitChoice != GAME_END);

	}

}
