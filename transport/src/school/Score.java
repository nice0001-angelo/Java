/*점수를 관리하는 클래스로써 학번,과목,점수가 관리된다
학생과 과목의 매칭점수가 나온다
*/

package school;

public class Score {
	//클래스 필드
	int studentId; //학번
	Subject subject;  //과목 
	int point; //점수
	
	
	//생성자  studentId, subject, point
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	
	
	
	
	//toString() 메소드 재정의
	public String toString() {
		return "학번"+studentId+","+subject.getSubjectName()+":"+point;
	}
	
	
	
	//studentId getter
	public int getStudentId() {
		return studentId;
	}
	
	//studentId setter
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	//subject getter
	public Subject getSubject() {
		return subject;
	}
	
	//subject setter
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	//point getter
	public int getPoint() {
		return point;
	}
	
	//point setter
	public void setPoint(int point) {
		this.point = point;
	}
	
	

}
