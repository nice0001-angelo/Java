/*학교는 유일한 객체이므로 싱글톤 패턴으로 구현한다.
즉 객체생성할 일이 없다는 이야기다 모두 private으로 세팅한다
*/

package school;

import java.util.ArrayList;

public class School {
	//singleton pattern
	private static School instance = new School();
	
	private static String SCHOOL_NAME = "Good school";
	private ArrayList<Student> studentList = new ArrayList<Student>(); //등록된 학생
	private ArrayList<Subject> subjectList = new ArrayList<Subject>(); //과목 리스트
	
	//생성자
	private School() {}
	
	
	// School getInstance()
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
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
	public ArrayList<Subject> getSubjectList(){
		return subjectList;
	}
	
	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
}
