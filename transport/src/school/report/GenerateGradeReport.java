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
		
	}

}
