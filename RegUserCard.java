package designPatternAdapter;

public class RegUserCard implements Card{

	@Override
	public void connect() {
		System.out.println( "connected");
		
	}

}
