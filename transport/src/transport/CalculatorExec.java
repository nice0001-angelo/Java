package transport;

public class CalculatorExec {
	public static void main(String[] args) {
		Calculator mycal = new Calculator();
		mycal.powerOn();
		
		// plus �޼ҵ带 static���� ���������Ƿ� ��üȭ ���� �ʰ� ���� ���� ��������
		int result1 = Calculator.plus(10, 20);
		System.out.println("Plus result:"+result1);
		
		double result2 = mycal.divide(50, 5);
		System.out.println("Divided result:"+result2);
		
		mycal.powerOff();
		
		System.out.println("==========================");
		
		double result3 = mycal.areaRectangle(20);
		System.out.print("���簢���� ���̴�:"+result3+"�Դϴ�\n");
		
		double result4 = mycal.areaRectangle(20,40);
		System.out.print("���簢���� ���̴�:"+result4+"�Դϴ�");
	}
}
