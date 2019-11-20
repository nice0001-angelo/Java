package transport;
import java.util.ArrayList;
import javax.security.auth.*;

public class Student {
	int studentID;
	String subjectName;
	ArrayList<Subject> subjectList;
	public String studentName;
	public int grade;
	public int money;
	
	public Student() {
	}
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
		
	}
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -=1500;
	}
	
	public void showInfo() {
		System.out.println(studentName +"is get olly "+money+"Korean Won");
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 "+studentName+"의 "+s.getName()+"과목 성적은 "+s.getScorePoint()+"입니다");
			}
	System.out.println("학생 "+studentName+"의 총점은 "+total+"입니다");
	}
}