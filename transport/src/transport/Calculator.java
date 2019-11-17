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
	
	void powerOn() {
		System.out.println("Power on");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("Power off");
	}
}
