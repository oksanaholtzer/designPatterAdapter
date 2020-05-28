package designPatternAdapter;

public class ApplicationBankCard {

	public static void main(String[] args) {
		BankCard bankCard = new BankCard ("123456");
		BankCardAdapter bankCardAdapter= new BankCardAdapter (bankCard);
		bankCardAdapter.connect();
		
		CardReaderProxy cardReader=new CardReaderProxy();
		cardReader.setCard(bankCard);
		for (int i =0;i<6;i++) {
		cardReader.startTransaction(bankCard);
		}

	}

}
