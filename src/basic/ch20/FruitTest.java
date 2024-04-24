package basic.ch20;

public class FruitTest {

	public static void main(String[] args) {

		// 다형성
		// 다양한 형태로 클래스(데이터 타입을) 바라 볼 수 있다.

//		Fruit fruit1 = new Banana();
//		Fruit fruit2 = new Peach();
//		
		// fruit1.showInfo();
		// fruit2.showInfo();

		// 다형성을 사용하면 코드를 유연하게 작성할수 있다.

		Banana fruit1 = new Banana();
		Peach fruit2 = new Peach();

		Fruit[] fruits = new Fruit[3];
		fruits[0] = fruit1;
		fruits[1] = fruit2;
		fruits[2] = fruit1;

		System.out.println(((Banana) fruits[2]).origin);
		((Banana) fruits[2]).saleBanana();
		System.out.println(((Banana) fruits[2]).price);
		System.out.println("------------");

		// 배열은 반복문과 함께 많이 사용된다.

		// 0->바나나
		// 1-> 복숭아
		// instanceof 연산자를 알아야 해결 가능
		// instanceof -->
		//실행 시점에 객체가 특정 클래스의 인스턴스인지 확인하는 키워드
		
		for (int i = 0; i < fruits.length; i++) {

			//방어적 코드 ...
			
			if (fruits[i] instanceof Banana) {
				((Banana) fruits[i]).saleBanana();
			} else {
				fruits[i].showInfo();
			}
		}

		
		System.out.println(((Banana) fruits[2]).price);
	}// end of main

}// end of class
