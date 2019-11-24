package transport;

public class RemoteControlExec {

	public static void main(String[] args) {
		
		RemoteControl rc;
		
		//다형성 콜소스는 그대로 둔체 구현체만 바꿔가면서 선택
		//rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
