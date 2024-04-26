package basic.ch21;

public class ComputerMainTest {

	public static void main(String[] args) {

		MyNoteBook myNB = new MyNoteBook();
		DeskTop dT = new DeskTop();

		((Computer)myNB).turnOn();
	}
}
