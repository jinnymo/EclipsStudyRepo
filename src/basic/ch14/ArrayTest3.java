package basic.ch14;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		char[] alpahbets = new char[26];
		char ch1 ='A';
		alpahbets[0] =ch1;
		
		char ch2 ='B';
		alpahbets[1] =ch2;
		
//		char ch26 = 'Z';
//		alpahbets[25] =ch26;
	
		//배열은 반복문과 함께 많이 사용 된다.
		int forCount = 0;
		for(int i = 0; i < alpahbets.length; i++) {
			//alpahbets[i];
			System.out.println(alpahbets[i]);
			System.out.println("배열한에 요소의 개수는? " +forCount);
			if (alpahbets[i] != 0 ) {
					forCount++;
					System.out.println("saf");
			}
		}
		System.out.println("for 동작횟수 : "+ forCount);
	}

}
