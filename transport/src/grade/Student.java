package grade;

import java.util.ArrayList;

public class Student {
	
	private int studetnId;         //학생 번호
	private String studentName;    //학생 이름
	private Subject majorSubject;  //전공
	
	// 과목별 점수
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	//생성자 : 학생번호 학생명 전공
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studetnId = studetnId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
