package basic.ch12;

public class Card {

	private int cardNum = 1000;
	private int userId;

	public Card(int id) {
		this.userId = id;
		cardNum += id;
	}

	
	public void ShowInfo() {
		System.out.println(this.userId + "///" + this.cardNum);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Card card = new Card(i);
			card.ShowInfo();
			
		}
		

	}
}
w