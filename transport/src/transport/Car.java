package transport;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
	
	//Constructor
	public Car() {
	}

	//Constructor
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//Constructor
	public Car(String model, String color, int maxSpeed, int speed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
	//Method
	int getSpeed() {
		return speed;
	}
	
	//Method
	void keyTurnOn() {
		System.out.println("Turn on the key");
	}
	
	//Method
	void run() {
		for(int i=10 ; i <=250 ; i += 10 ) {
			this.speed = i;
			System.out.print("Running(speed :"+this.speed+"km/h)\n");
		}
	}
	
}
