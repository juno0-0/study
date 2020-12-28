package data;

public class SungJuk {
//멤버 필드는 외부에서 직접 접근하게 하면 보안에 취약하기 때문에 private로 막는다.
	private int hakbun;//학번
	private String name;//이름
	private String dept;//학과
	private int kor;//국어점수
	private int eng;//영어점수
	private int total;//합계
	private double avg;//평균
	private int rank;//석차

	
	//멤버에 값을 넣을 때 외부에서 메소드를 호출해서 넣기 
	//메소드명 이름을 지을 때
	//메소드명에 set변수명이면 변수명이란 변수에 값을 넣는다는 의미
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	
	//메소드명에 get변수명이면 변수명이란 변수를 출력한다는 의미 
	public int getHakbun() {
		return hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	
	
	
	
}
