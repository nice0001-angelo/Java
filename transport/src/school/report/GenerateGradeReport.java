/*title : GenerateGradeReport Class
field : SCHOOL_NAME
array : Student, ArrayList<Student> setter : 과목별 학생을 배열로 저장한다 : 교재에는 없었지만 내가 추가 했다
array : Subject, ArrayList<Subject> setter : 학교에 있는 과목을 배열로 저장한다
method : addStudent : 학생을 배열에 add하는 메소드 
method : addSubject : 과목을 배열에 add하는 메소드
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
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		
		for(Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();
	}

	
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t"+subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}

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
			
			getScoreGrade(student, subject.getSubjectId());
			
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	public void getScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList =student.getScoreList();
		int majorId = student.getMajorSubject().getSubjectId();
	
	
	//학점 평가 클래스
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


	public void makeFooter() {
		buffer.append("\n");
	}
}