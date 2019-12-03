package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.*;
import utils.Define;

public class TestMain {

	School goodSchool = School.getInstnace();
	Subject korean;
	Subject math;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();

	}

}
