package miniTest;

public class double_for_star {

	public static void main(String[] args) {

		int a = 1;
		for (int i = 0; i < 4; i++) {
			for (int ii = 0; ii < a; ii++) {
				System.out.print("*");
			}
			System.out.println();
			a++;
		}

		System.out.println("----------------------------");

		a = 1;
		for (int i = 0; i < 4; i++) {
			for (int ii = 0; ii < a; ii++) {
				System.out.print("*");
			}
			System.out.println();
			a += 2;
		}

		System.out.println("----------------------------");

		a = 1;
		for (int i = 0; i < 4; i++) {
			for (int ii = 5; ii > a; ii--) {
				System.out.print("*");
			}
			System.out.println();
			a++;
		}

	}

}//https://www.notion.so/for-7232f374e816480fb757ef0710da361b
