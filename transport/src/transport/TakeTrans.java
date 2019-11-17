package transport;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentAngelo = new Student("Angelo", 5000);
		Student studentYoonji = new Student("Yoonji", 1000);
		
		Bus bus100 = new Bus(100);
		studentAngelo.takeBus(bus100);
		studentAngelo.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("Green Number 2");
		studentAngelo.takeSubway(subwayGreen);
		studentAngelo.showInfo();
		subwayGreen.showInfo();
	}

}