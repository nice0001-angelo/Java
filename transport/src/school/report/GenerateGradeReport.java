package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.MajorEvaluation;
import grade.GradeEvaluation;

import school.Student;
import school.Subject;
import school.Score;
import school.School;

import utils.Define;

public class GenerateGradeReport {
	School school = School.getInstnace();
	public static final String TITLE = "수강생 학점 \t\t\n";
	public static final String HEADER = "이름 | 학번 | 필수과목 | 점수 \n";
	public static final String LINE = "------------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		
		for(Subject subject : subjectList) {
			makeHeader(subject);
			makebody(subject);
			makefooter();
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
	
}
