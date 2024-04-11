package basic.exercise;

public class Exercise1 {
	
	//코드의 시작점(main함수)
	public static void main(String[] args) {

		//1번
		int data1 = 10;
		int data2 = 100;
		int data3 = 100;
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);

		//2번
		int ageBox = 20;
		int ageBox2;
		//2-1 번
		ageBox2 = ageBox;
		ageBox = 30;
		System.out.println("ageBox : " + ageBox);
		System.out.println("ageBox2 : " + ageBox2);
		
		//3번
		int a = 1;
		int b = 3;
		int c = a;
		
		a = b;
		b = c;
		System.out.println("a :" + a);
		System.out.println("b :" + b);
	}//end of main

}//end of class
//https://www.notion.so/3-c8ce58429cf84aceba4a74c8caace039