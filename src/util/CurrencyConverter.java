package util;

public class CurrencyConverter {

	public static double iof = 0.06;
	
	public static double totalPrice(double price, double amount) {
		return price * amount * (1.0 + iof);
	}
}
