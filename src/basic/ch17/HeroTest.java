package basic.ch17;

public class HeroTest {

	public static void main(String[] args) {

		Warrior warrior = new Warrior("전사", 100);
		Archor archor = new Archor("궁수", 100);
		Wizard wizard = new Wizard("법사", 100);
		
		warrior.attack();
	}
}
