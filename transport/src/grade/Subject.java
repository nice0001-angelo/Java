package grade;

import java.util.ArrayList;
import utils.Define;

public class Subject {
	private String subjectName;  //과목명
	private int subjectId;  	//과목번호
	private int gradeType;		//과목타입
	
	private ArrayList<Student> studentList = new ArrayList<Sutdent>();
	
	//생성자	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE; //학점평가정책은 기본으로 A,B 방식 
	}

}
