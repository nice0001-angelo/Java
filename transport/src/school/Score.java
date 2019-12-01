package school;

public class Score {
	//클래스 필드
	int studentId; //학번
	Subject subject;  //과목 
	int point; //점수
	
	
	//생성자
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	
	//학생번호 가져오기 메소드
	public int getStudentId() {
		return studentId;
	}
	
	//학생번호 세팅하기 메소드
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	//과목 가져오기 메소드
	public Subject getSubject() {
		return subject;
	}
	
	//과목 세팅하기 메소드
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	//점수가져오기 메소드
	public int getPoint() {
		return point;
	}
	
	//점수 세팅하기 메소드
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String toString() {
		return "학번"+studentId+","+subject.getSubjectName()+":"+point;
	}
}
