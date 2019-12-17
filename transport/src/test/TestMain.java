/*title : TestMain Class
field : goodSchool, korean, math, dance.
method : createSubject : 리포트생성 메소드 
method : getScoreGrade : 점수별 등급을 가져오는 메소드
method : makeHeader : 리포트의 헤더 부분을 보여주는 메소드 : 제목, 타이틀(이름,학번,필수과목,점수,등급)
method : makeBody : 과목을 배열에 add하는 메소드
method : makeFooter : 과목을 배열에 add하는 메소드


*/
package test;

import java.util.*;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {

	School goodSchool = School.getInstnace();
	Subject korean;
	Subject math;
	Subject dance;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport(); //성적 결과 생성
		System.out.println(report);
		
		
	}
	
	//과목 지정
	public void createSubject() {
		korean = new Subject("국어", Define.KOREAN);
		math = new Subject("수학", Define.MATH);
		dance = new Subject("댄스", Define.DANCE);
		
		// 학습평가 정책 지정
		dance.setGradeType(Define.PF_TYPE);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addSubject(dance);
	}
	
	public void createStudent() {
		Student student1 = new Student(181213, "남진현", korean);
		Student student2 = new Student(181512, "김수현", math);
		Student student3 = new Student(171230, "전지현", korean);
		Student student4 = new Student(171255, "강동원", korean);
		Student student5 = new Student(171590, "김유식", math);
		Student student6 = new Student(171211, "테일러", dance);
		Student student7 = new Student(171591, "오라클", dance);
		
		
		goodSchool.addStudent(student1);
		goodSchool.addStudent(student2);
		goodSchool.addStudent(student3);
		goodSchool.addStudent(student4);
		goodSchool.addStudent(student5);
		goodSchool.addStudent(student6);
		goodSchool.addStudent(student7);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		korean.register(student6);
		korean.register(student7);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		math.register(student6);
		math.register(student7);
		
		
		dance.register(student1);
		dance.register(student2);
		dance.register(student3);
		dance.register(student4);
		dance.register(student5);
		dance.register(student6);
		dance.register(student7);
		
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);
		addScoreForStudent(student1, dance, 77);
		
		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student2, math, 95);
		addScoreForStudent(student2, dance, 36);
		
		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
		addScoreForStudent(student3, dance, 88);
		
		
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 95);
		addScoreForStudent(student4, dance, 99);
		
		addScoreForStudent(student5, korean, 85);
		addScoreForStudent(student5, math, 56);
		addScoreForStudent(student5, dance, 85);
		
		addScoreForStudent(student6, korean, 89);
		addScoreForStudent(student6, math, 95);
		addScoreForStudent(student6, dance, 99);
		
		addScoreForStudent(student7, korean, 85);
		addScoreForStudent(student7, math, 56);
		addScoreForStudent(student7, dance, 85);
	}
	
		public void addScoreForStudent(Student student, Subject subject, int point) {
			Score score = new Score(student.getStudentId(), subject, point);
			student.addSubjectScore(score);
		}
}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


















































