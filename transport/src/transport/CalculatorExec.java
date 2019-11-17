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
		
		System.out.println("==========================");
		
		double result3 = mycal.areaRectangle(20);
		System.out.print("정사각형의 넓이는:"+result3+"입니다\n");
		
		double result4 = mycal.areaRectangle(20,40);
		System.out.print("직사각형의 넓이는:"+result4+"입니다");
	}
}
