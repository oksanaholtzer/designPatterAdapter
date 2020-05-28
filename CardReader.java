package designPatternAdapter;

public class CardReader implements TransactInfo{
	BankCard card;
	public CardReader () {
		
	}
	public BankCard getCard() {
		return card;
	}
	public void setCard(BankCard card) {
		this.card = card;
	}
 public void startTransaction (BankCard card) {
	 System.out.println ("Start transaction card number ");
	 card.startTransactionWithBank();;
	 
 }
}
