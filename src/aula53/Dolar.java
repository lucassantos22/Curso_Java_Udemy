package aula53;

public class Dolar {
	
	public static double conversor(double dollarsPrice, double dollarsBought) {
		double amountToBePaid = dollarsPrice * dollarsBought;
		return amountToBePaid + (amountToBePaid*6)/100;
	}

}
