package test;

public class Middle extends School{
	String teacherName;
	int checkScore;
	int serviceScore;
	
	public Middle() {}
	
	public Middle(String subject, int midterm, int finals, int performance,int checkScore, int serviceScore) {
		super(subject, midterm, finals, performance);
		this.checkScore=checkScore;
		this.serviceScore=serviceScore;
		super.score+=checkScore+serviceScore;
	}
}
