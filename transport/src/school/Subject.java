package school;

import java.util.ArrayList; //배열을 관리하기 위해 임포트 받음
import utils.Define; //프로그램 전반에서 사용하는 상수 클래스

public class Subject {
	private String subjectName;  //과목명
	private int subjectId;  	//과목번호
	private int gradeType;		//과목타입
	
	
	// 이 과목을 수강한 신청한 학생 리스트 register() 메소드를 호출하면 이 리스트에 추가됨 
	// <E> 의 E 파라미터는 저장되는 객체를 E 타입으로 하겠다는 것임
	// 아래에서는 Student 타입으로 배열을 저장하겠다는 의미
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	//생성자	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE; //학점평가정책은 기본으로 A,B 방식
	}
	
	//과목명 가져오기 메소드
	public String getSubjectName() {
		return subjectName;
	}
	
	//과목명 세팅 메소드
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	//과목번호 가져오기 메소드
	public int getSubjectId() {
		return subjectId;
	}
	
	//과목번호 세팅 메소드
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	//학생점수 가져오기 메소드
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	//학생점수 세팅 메소드
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	//그레이드타입 가져오기 메소드
	public int getGradeType() {
		return gradeType;
	}
	
	//그레이드타입  세팅 메소드
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	
	//수강신청 메소드
	public void register(Student student) {
		studentList.add(student);
	}
}
