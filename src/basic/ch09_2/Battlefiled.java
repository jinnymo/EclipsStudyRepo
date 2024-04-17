package basic.ch09_2;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Battlefiled {
	static String[][] field = new String[4][10];

	public static void main(String[] args) {

		Random random = new Random();
		int posA;
		int posB;

		Warrior[][] warrior = new Warrior[2][10]; // 5개의 warrior 인스턴스 공간을 스택메모리에 만듬
		Archor[][] archor = new Archor[2][10];

		makeField();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {

//				System.out.println(warrior[i]);
				warrior[j][i] = new Warrior(100, 10);// 위에서 미리선언한 5개의 인스턴스에 값을 넣어 주면서 heap 메모리 공간에 데이터 저장
				archor[j][i] = new Archor(100, 10);

			}

		}

		boolean flag = true;
		while (flag) {
			posA = random.nextInt(2);
			posB = random.nextInt(10);
			flag = !(warrior[posA][posB].getIsDie());// 살아있는 여부 가져와서 저장
			if (flag == true) {
				warrior[posA][posB].warriorGA("아처", 10, posA, posB);
				break;
			}
			// System.out.println(posA +"a"+ posB );
		}

	}

	static void makeField() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {

				field[j][i] = new String("[o]");
				System.out.print(field[j][i]);

			}
			System.out.print("\t\t");
			for (int j = 0; j < 2; j++) {

				field[j + 2][i] = new String("[*]");
				System.out.print(field[j + 2][i]);

			}

			System.out.println();
		}
	}

}
