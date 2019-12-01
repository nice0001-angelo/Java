package grade;

import java.util.ArrayList;

public class Student {
	
	private int studetnId;         //학생 번호
	private String studentName;    //학생 이름
	private Subject majorSubject;  //전공
	
	// 과목별 점수 : 학생이 수강한 과목의 점수 리스트
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	//생성자 : 학생번호 학생명 전공
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studetnId = studetnId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	//점수 추가
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	//학생번호 가져오기
	public int getStudentId() {
		return studentId;
	}
	
	//학생번호 세팅하기 메소드
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	//학생이름 가져오기 메소드
	public String getStudentName() {
		return studentName;
	}
	
	//학생이름 세팅하기 메소드
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//전공 세팅하기 메소드
	public Subject getMajorSubject() {
		return majorSubject;
	}
	
	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}
	
	public ArrayList<Score> getScoreList(){
		return scoreList;
	}
}
