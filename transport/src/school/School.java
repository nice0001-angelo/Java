/*title : School Class
field : SCHOOL_NAME
array : Student, ArrayList<Student> setter : 과목별 학생을 배열로 저장한다 : 교재에는 없었지만 내가 추가 했다
array : Subject, ArrayList<Subject> setter : 학교에 있는 과목을 배열로 저장한다
*/

/*학교는 유일한 객체이므로 싱글톤 패턴으로 구현한다.
즉 객체생성할 일이 없다는 이야기다 모두 private으로 세팅한다
싱글톤 패턴은 객체를 여러개 생성할 필요가 없는 것이다
가령 공장이 한개이고 공장의 생선 번호가 유일하려면 객체가 여러번 생성되면 안된다.
*/

package school;

import java.util.ArrayList;

public class School {
	
	//singleton pattern
	// 정적 필드 선언 : 자신의 객체를 생성해서 초기화함
	private static School instance = new School();
	

	//생성자 : 싱글톤 패턴은 아래와 같이 private 클래스() {}로 선언함
	private School() {}
	
	
	// School getInstance()
	// 외부에서 싱글턴 객체를 얻는 유일한 방법임
	public static School getInstnace() {
		if(instance == null)
			instance = new School();
		return instance;
	}
    
	// 싱글톤 필드가 아닌 일반필드 및 객체 선언...
	private static String SCHOOL_NAME = "Good school";
	private ArrayList<Student> studentList = new ArrayList<Student>(); //등록된 학생
	private ArrayList<Subject> subjectList = new ArrayList<Subject>(); //과목 리스트
	
	
	// addStudent
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	// addSubject
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
	// ArrayList<Student> getter 
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	// ArrayList<Subject> getter
	public ArrayList<Subject> getSubjectList(){
		return subjectList;
	}
	
	// ArrayList<Student> setter
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	// ArrayList<Subject> setter
	public void setSubjectList(ArrayList<Subject> subjectList) {
			this.subjectList = subjectList;
	}
}
