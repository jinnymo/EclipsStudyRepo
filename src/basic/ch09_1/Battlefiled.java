package basic.ch09_1;

import java.util.Scanner;

public class Battlefiled {
	
	static Warrior warrior = new Warrior(10000, 24);
	static Archor archor = new Archor(8000, 30);
	static Wizard wizard = new Wizard(70, 23);
	static boolean flag = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int chooseCH;
		int EMN; //
//		System.out.println("캐릭 고르세요 1.전사 2.아처 3.마법사");
//
//		chooseCH = sc.nextInt();
//		System.out.println("누구와 비교?");
//		if (chooseCH == 1) {
//			System.out.println("2.아처 3. 마법사");
//		} else if (chooseCH == 2) {
//			System.out.println("1.전사 3. 마법사");
//
//		} else if (chooseCH == 3) {
//			System.out.println("1.전사 2. 아처");
//
//		}
//		EMN = sc.nextInt();
		System.out.println("전사 아처 공격력 수정을 통한 밸런스 조절하기 ");

		// 전사를 고르고 아처와 싸운다 가정만 하고 적음
		while (flag) {
			warrior.warriorGA("아처", archor.attackPower);
			healthcheck();
			archor.archorGA("전사", warrior.attackPower);
			healthcheck();

		}

	}

	public static void healthcheck() {
		if (warrior.health <= 0) {
			System.out.println("전사 패배 ");
			flag = false;
		} else if (archor.health <= 0) {
			System.out.println("아처 패배 ");
			flag = false;
		}
	}

}
