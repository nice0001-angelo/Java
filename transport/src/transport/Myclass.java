package transport;

public class MyClass {
	// field
	RemoteControl rc = new Television();

	// constructor
	MyClass() {
	}

	// constroctor with parameter
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}

	// local valuable
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}

		//method
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
