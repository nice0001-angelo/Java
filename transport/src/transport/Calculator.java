package transport;

public class Calculator {
	
	String CalMaker;
	int CalModelNum;
	String CalOwner;
	
	//Conductor
	public Calculator() {
	}
	
	//Conductor
	public Calculator(String CalMaker, int CalModelNum) {
		this.CalMaker = CalMaker;
		this.CalModelNum = CalModelNum;
	}
	
	//conductor
	public Calculator(String CalMaker, int CalModelNum, String CanOwner) {
		this.CalMaker = CalMaker;
		this.CalModelNum = CalModelNum;
		this.CalOwner = CalOwner;
	}
	
	//Method powerOn()
	void powerOn() {
		System.out.println("Power on");
	}
	
	//Method Plus()
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	//Method divide()
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	//Method powerOff()
	void powerOff() {
		System.out.println("Power off");
	}
	
	//정사각형 넓이 계산 Method
	double areaRectangle(double width) {
		double result = width*width;
		return result;
	}
	
	//사각형 넓이 계산 Method(areaRectangel overloading)
	double areaRectangle(double height, double width) {
		double result = height*width;
		return result;
	}
}
