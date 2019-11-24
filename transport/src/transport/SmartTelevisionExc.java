package transport;

public class SmartTelevisionExc {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc;
		rc = tv;
		Searchable searchable;
		searchable = tv;
		
		rc.turnOn();
		rc.setVolume(5);
		searchable.search("http://angelo.co.kr");
		rc.turnOff();
	}

}
