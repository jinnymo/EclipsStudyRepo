package basic.ch20;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("---------------");
		
		Animal animal2 = new Tiger();
		animal2.move();
		animal2.eating();
		System.out.println("---------------");
		
		Animal animal3 = new Human();
		animal3.move();
		((Human)animal3).readBooks();

		
	}

}
