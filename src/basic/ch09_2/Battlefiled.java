package basic.ch09_2;

import java.util.Scanner;

public class Battlefiled {
	
	

	public static void main(String[] args) {
		
		Warrior[] warrior = new Warrior[5];
		for (int i = 0; i < warrior.length; i++) {
			
			System.out.println(warrior[i]);
			warrior[i] = new Warrior(10,10);
			System.out.println(warrior[i]);
			
		}
		

	}


}
