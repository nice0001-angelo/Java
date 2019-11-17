package transport;

public class Calculator {
	
	String CalMaker;
	int CalModelNum;
	String CalOwner;
	
	public Calculator() {
		
	}
	
	public Calculator(String CalMaker, int CalModelNum) {
		this.CalMaker = CalMaker;
		this.CalModelNum = CalModelNum;
	}
	
	public Calculator(String CalMaker, int CalModelNum, String CanOwner) {
		this.CalMaker = CalMaker;
		this.CalModelNum = CalModelNum;
		this.CalOwner = CalOwner;
	}

}
