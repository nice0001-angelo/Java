package grade;

public class PassFailEvaluation implements GradeEvaluation {
	
	public String getGrade(int point) {
		
		String grade;
		
		if(point >= 70 && point <= 100) {
			grade = "p";
		} else {
			grade ="F";
		}
		
		return grade;
	}

}
