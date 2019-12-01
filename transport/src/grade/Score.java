package grade;

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
	
	public int getStudentId() {
		return studentId;
	}
}
