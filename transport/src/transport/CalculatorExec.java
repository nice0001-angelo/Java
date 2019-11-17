package transport;

public class CalculatorExec {

	public static void main(String[] args) {
		Calculator mycal = new Calculator();
		mycal.powerOn();
		
		int result1 = mycal.plus(10, 20);
		System.out.println("Plus result:"+result1);
		
		double result2 = mycal.divide(50, 5);
		System.out.println("Divided result:"+result2);
		
		mycal.powerOff();

	}

}
