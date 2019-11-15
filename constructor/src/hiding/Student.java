package hiding;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	private String address;



public String getStudentName() {
	return studentName;
	}

public void setStudentName(String studentName) {
	this.studentName = studentName;
	}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
}