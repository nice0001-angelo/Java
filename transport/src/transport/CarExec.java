package transport;

public class CarExec {
	public static void main(String[] args) {
		//��ü ����
		Car myCar = new Car();
		
		//�ʵ� �� �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
		
		//�ʵ� �� ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
		
		//�ʵ� �� ����
		myCar.company = "Benz";
		System.out.println("������ ȸ���: " + myCar.company);
	}
}
