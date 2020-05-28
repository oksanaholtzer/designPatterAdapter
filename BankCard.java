package designPatternAdapter;

public class BankCard {
	public String accountNumber;
	
	public BankCard(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public void startTransactionWithBank () {
		System.out.println ("start transaction ");
	}

}
