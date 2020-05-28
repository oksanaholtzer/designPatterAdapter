package designPatternAdapter;

public class BankCardAdapter implements Card{

	BankCard bankCard;
	
	public BankCardAdapter(BankCard bankCard) {
		this.bankCard=bankCard;
	}
	
	
	
	public void connect() {
		System.out.println( "connected avec card number " +bankCard.accountNumber);
		
	}

}
