package test;

public class School {
	String subject;
	int score;//гу
	int midterm;
	int finals;
	int performance;
	
	public School() {}
	
	public School(String subject, int midterm, int finals, int performance) {
		this.subject = subject;
		this.midterm = midterm;
		this.finals = finals;
		this.performance = performance;
		score=midterm+finals+performance;
	}
	
	
}
