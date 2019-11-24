package transport;

public class Television implements RemoteControl {
	//valueable
	private int volume;
	
	//turnOn() 
	public void turnOn() {
		System.out.println("TV Turn On.");
	}	
	//turnOff() 
	public void turnOff() {
		System.out.println("TV Turn Off.");
	}
	//setVolume() 
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("TV Voulume is : " + this.volume);
	}
}

