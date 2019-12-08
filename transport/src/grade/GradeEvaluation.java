package grade;


//여러평가방법이 있으므로 인터페이스로 정의함
//BasicEvaluation(기본과목), MajorEvaluation(전공과목), PassFailEvaluation(Pass Fail 과목)
public interface GradeEvaluation {
	public abstract String getGrade(int point);
}
