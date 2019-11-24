package transport;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV Turn On.");
	}	
	public void turnOff() {
		System.out.println("TV Turn Off.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(" TV Volume is : " + this.volume);
	}
	
	public void search(String url) {
		System.out.println(url + " Searching ");
	}
}
