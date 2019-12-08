package school;

import java.util.ArrayList; //배열을 관리하기 위해 임포트 받음
import utils.Define; //프로그램 전반에서 사용하는 상수 클래스

public class Subject {
	private String subjectName;  //과목명  private로 선언했으므로 setter 와 getter가 필요함
	private int subjectId;  	//과목번호 private로 선언했으므로 setter 와 getter가 필요함
	private int gradeType;		//과목타입 private로 선언했으므로 setter 와 getter가 필요함
	
	
	// 이 과목을 수강한 신청한 학생 리스트 register() 메소드를 호출하면 이 리스트에 추가됨 
	// <E> 의 E 파라미터는 저장되는 객체를 E 타입으로 하겠다는 것임
	// 아래에서는 Student 타입으로 배열을 저장하겠다는 의미
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	
	//생성자 subjectName, subjectId	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE; //학점평가정책은 기본으로 A,B 방식으로 default 세팅
	}
	
	//수강신청 메소드 : 위에 정의한  private ArrayList<Student> studentList = new ArrayList<Student>();
	//에서 정의한 studentList에 애드온 되는 매소드 register(student 타입 메소드 어래이)
	public void register(Student student) {
		studentList.add(student);
	}
	
	//subjectName getter
	public String getSubjectName() {
		return subjectName;
	}
	
	//subjectName setter
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	//subjectId getter
	public int getSubjectId() {
		return subjectId;
	}
	
	//subjectId setter
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	

	//grdaeType getter
	public int getGradeType() {
		return gradeType;
	}
	
	//gradeType setter
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	//학생점수 getter
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	//학생점수 setter
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

}
