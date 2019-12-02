package school;

import java.util.ArrayList;

public class School {
	//singleton pattern
	private static School instance = new School();
	
	private static String SCHOOL_NAME = "Good school";
	private ArrayList<Student> studentList = new ArrayList<Student>(); //등록된 학생
	private ArrayList<Subject> subjectList = new ArrayList<Subject>(); //과목 리스트
	
	private School() {}
	
	public static School getInstnace() {
		if(instance == null)
			instance = new School();
		return instance;
	}
	
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
}
