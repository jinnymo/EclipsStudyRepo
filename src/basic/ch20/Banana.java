package basic.ch20;

public class Banana extends Fruit {

	String origin;

	public Banana() {
	name = "춘식이바나나";
	price = 5000;
	origin = "한국";
	}
	public void saleBanana() {
		System.out.println("바나나가격할인");
		price -= 1000;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
}
