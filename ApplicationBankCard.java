package designPatternAdapter;

public class ApplicationBankCard {

	public static void main(String[] args) {
		BankCard bankCard = new BankCard ("123456");
		BankCardAdapter bankCardAdapter= new BankCardAdapter (bankCard);
		bankCardAdapter.connect();

	}

}
