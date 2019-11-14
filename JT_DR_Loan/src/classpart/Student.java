package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo(){
		System.out.println(studentName + "," + address);  // Name, Address Print
		return;
	}
	
	public String getStudentName() {
		return studentName;
	}	
	
	public void setStudentName(String name){
		studentName = name;
		return;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "Angelo Nam"; 
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		return;
	}
}
