package basic.ch02;

public class DiscountCalculator {
	public static void main(String[] args) {
		final double NORMAL_COAST = 59.99;
		final double DISCOUNT_VALUE = 0.3;
		
		int discounted_price = (int)(NORMAL_COAST*(1-DISCOUNT_VALUE));
		System.out.println(discounted_price);
		System.out.println(NORMAL_COAST*(1-DISCOUNT_VALUE));
		
	}
}
