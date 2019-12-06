package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.MajorEvaluation;
import grade.PassFailEvaluation;
import grade.GradeEvaluation;

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
		
			
			 //조건문에서 챙겨야 함	
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