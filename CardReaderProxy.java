package designPatternAdapter;

public class CardReaderProxy implements TransactInfo{
	BankCard card;
	CardReader cardReader;
	public static int count=0;
	public CardReaderProxy () {
		
	}
	
	
	public CardReader getCardReader() {
		return cardReader;
	}


	public void setCardReader(CardReader cardReader) {
		this.cardReader = cardReader;
	}


	public BankCard getCard() {
		return card;
	}
	public void setCard(BankCard card) {
		this.card = card;
	}
 public void startTransaction (BankCard bankCard) {
	 
		 this.cardReader= new CardReader();
		 
	 
	 if (count<= 3) {
	 cardReader.startTransaction(bankCard);
	 count++;
	 } else {
		 System.out.println ("transaction tentetives limit reached ");
	 }
	 
 }

}
