package transport;

public interface RemoteControl {
	//상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상화 메소드
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}
