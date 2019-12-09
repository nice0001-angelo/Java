/*title : GenerateGradeReport Class
field : school, TITLE, HEADER, LINE, buffer
array : Student, ArrayList<Student> setter : 과목별 학생을 배열로 저장한다 : 교재에는 없었지만 내가 추가 했다
array : Subject, ArrayList<Subject> setter : 학교에 있는 과목을 배열로 저장한다
method : getReport : 리포트생성 메소드 
method : getScoreGrade : 점수별 등급을 가져오는 메소드
method : makeHeader : 리포트의 헤더 부분을 보여주는 메소드 : 제목, 타이틀(이름,학번,필수과목,점수,등급)
method : makeBody : 과목을 배열에 add하는 메소드
method : makeFooter : 과목을 배열에 add하는 메소드


*/

/*실제 서비스를 운영하는 경우 리포트프로그램이 많은 양을 차지 한다
여기서 학점리포트는 각 과목당 산출한다.
데이터베이스를 사용하는 경우에 데이터베이스로부터 값을 가져오는
쿼리문을 최적화하여 구현한다. 이 프로그램에서 대부분 처리한다
*/


package school.report;

import java.util.ArrayList;

import grade.GradeEvaluation;
import grade.BasicEvaluation;
import grade.MajorEvaluation;
import grade.PassFailEvaluation;

import school.Student;
import school.Subject;
import school.Score;
import school.School;

import utils.Define;

public class GenerateGradeReport {
	School school = School.getInstnace();
	public static final String TITLE = "수강생 학점 \t\t\n";
	public static final String HEADER = "이름 | 학번 | 필수과목 | 점수 | 등급 \n";
	public static final String LINE = "------------------------------\n";
	private StringBuffer buffer = new StringBuffer(); //StringBuffer()에서 생성한 buffer 변수  16자리 String

	
	
	
	
	// getReort() Method 
	public String getReport() {
		
		// School 클래스에서 가져온 인스턴스를 school로  객체생성(위로 7번째줄 School school = School.getInstnace();)
		// 그 뒤에 school.getSubjectList로 School 클래스의 내용을 가져옴 (과목리스트를 가져옴)
		ArrayList<Subject> subjectList = school.getSubjectList();
				
		// 향상된 for 문 subjectList 배열에서 한개씩 subject 변수로 데이터를 뽑아냄
		for(Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		// string로 변환 : StringBuffer.class에 존재하는  toString() 메소드
		// 위에서 StringBuffer() 클래스를  buffer로 생성하고 buffer.toString()으로 접근한것임
		// buffer에 담아서 String타입으로 리턴하는 것임
		return buffer.toString();
	}

	
	

	
	
	
	
	// getScoreGrade() Method 점수별 등급을 알아내기 위한 메소드
	public void getScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList =student.getScoreList();
		int majorId = student.getMajorSubject().getSubjectId(); //무슨형태인지..
	
	//학점 평가 클래스 배열로 각각의 평가값을 받음(기본, 전공, 패스페일)	
	GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};
	
	for(int i=0; i<scoreList.size(); i++) {
		Score score = scoreList.get(i);
		if(score.getSubject().getSubjectId() == subjectId) { // 학점산출할 과목 아이디
			String grade;
			
			// 과목 Id 체크
//			System.out.println("sub: " + subjectId);
		
			 //조건문에서 챙겨야 함 남진현의 전공은 국어이므로 S 등급이 나와야 함. subject.getSubject()가 왜 안먹는지?
				  if(score.getSubject().getSubjectId() == majorId) { //필수과목인 경우 
					  grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint()); } 
				  else  if(score.getSubject().getSubjectId() == majorId) {// 과목인경우 
					  grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint()); } 
				  else { 
					  grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint()); }
				  
				 
			
			
				/*
				 * if(.getGradeType() == Define.SAB_TYPE) { //필수과목인 경우 grade =
				 * gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint()); } else
				 * if(subject.getGradeType() == Define.AB_TYPE) {// 과목인경우 grade =
				 * gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint()); } else { grade =
				 * gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint()); }
				 */
			 
			
			
			buffer.append(score.getPoint());
			buffer.append("|");
			buffer.append(grade);
			buffer.append("|");
		}
	  }
    }

	
	
	
	
	
	
	
	
	// makeHeader Method : subjectList에서 뽑아낸 subjectName을 넣기 위해서 활용함
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t"+subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}

	
	
	
	
	
	
	// makeBody Method : subjectList에서 뽑아낸 studentName, studetnId, subjectName을 넣기 위해서 활용함
	public void makeBody(Subject subject) {
		ArrayList<Student> studentList = subject.getStudentList();
		
		for(int i = 0 ; i< studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append("|");
			buffer.append(student.getStudentId());
			buffer.append("|");
			buffer.append(student.getMajorSubject().getSubjectName()+"\t");
			buffer.append("|");
			
			//점수별 등급을 알아내기 위해서 호출함
			getScoreGrade(student, subject.getSubjectId());
			
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	
	
	
	
	
	
	// makeFooter Method
	public void makeFooter() {
		buffer.append("\n");
	}

}