package transport;

public class CarExec {
	public static void main(String[] args) {
		//객체 생성
		Car myCar1 = new Car();
		
		//필드 값 읽기
		System.out.println("제작회사: " + myCar1.company);
		System.out.println("모델명: " + myCar1.model);
		System.out.println("색깔: " + myCar1.color);
		System.out.println("최고속도: " + myCar1.maxSpeed);
		System.out.println("현재속도: " + myCar1.speed);
		
		//필드 값 변경
		myCar1.speed = 60;
		System.out.println("수정된 속도: " + myCar1.speed);
		
		//필드 값 변경
		myCar1.company = "Benz";
		System.out.println("수정된 회사명: " + myCar1.company);
		
		
		// 필드값 변경 mycar2		
		Car myCar2 = new Car("GLE450","흰색", 200);
		System.out.println("---------------------------");
		System.out.println("수정된모델명:" + myCar2.model);
		System.out.println("수정된차색깔:" + myCar2.color);
		System.out.println("수정된최고스피드:" + myCar2.maxSpeed);
		
		
		// 필드값 변경 mycar3		
		Car myCar3 = new Car("GLE450","흰색", 200,100);
		System.out.println("---------------------------");
		System.out.println("수정된모델명:" + myCar3.model);
		System.out.println("수정된차색깔:" + myCar3.color);
		System.out.println("수정된최고스피드:" + myCar3.maxSpeed);
		System.out.println("수정된현재스피드:" + myCar3.speed);
		
		
		System.out.println("---------------------------");
		Car myCar4 = new Car("GLE450");
		myCar4.keyTurnOn();
		myCar4.run();
		}
}
