package transport;

public class CarExec {
	public static void main(String[] args) {
		//��ü ����
		Car myCar1 = new Car();
		
		//�ʵ� �� �б�
		System.out.println("����ȸ��: " + myCar1.company);
		System.out.println("�𵨸�: " + myCar1.model);
		System.out.println("����: " + myCar1.color);
		System.out.println("�ְ�ӵ�: " + myCar1.maxSpeed);
		System.out.println("����ӵ�: " + myCar1.speed);
		
		//�ʵ� �� ����
		myCar1.speed = 60;
		System.out.println("������ �ӵ�: " + myCar1.speed);
		
		//�ʵ� �� ����
		myCar1.company = "Benz";
		System.out.println("������ ȸ���: " + myCar1.company);
		
		
		// �ʵ尪 ���� mycar2		
		Car myCar2 = new Car("GLE450","���", 200);
		System.out.println("---------------------------");
		System.out.println("�����ȸ𵨸�:" + myCar2.model);
		System.out.println("������������:" + myCar2.color);
		System.out.println("�������ְ��ǵ�:" + myCar2.maxSpeed);
		
		
		// �ʵ尪 ���� mycar3		
		Car myCar3 = new Car("GLE450","���", 200,100);
		System.out.println("---------------------------");
		System.out.println("�����ȸ𵨸�:" + myCar3.model);
		System.out.println("������������:" + myCar3.color);
		System.out.println("�������ְ��ǵ�:" + myCar3.maxSpeed);
		System.out.println("���������罺�ǵ�:" + myCar3.speed);
		
		
		System.out.println("---------------------------");
		Car myCar4 = new Car("GLE450");
		myCar4.keyTurnOn();
		myCar4.run();
		}
}
