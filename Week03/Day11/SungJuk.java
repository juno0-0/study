package data;

public class SungJuk {
//��� �ʵ�� �ܺο��� ���� �����ϰ� �ϸ� ���ȿ� ����ϱ� ������ private�� ���´�.
	private int hakbun;//�й�
	private String name;//�̸�
	private String dept;//�а�
	private int kor;//��������
	private int eng;//��������
	private int total;//�հ�
	private double avg;//���
	private int rank;//����

	
	//����� ���� ���� �� �ܺο��� �޼ҵ带 ȣ���ؼ� �ֱ� 
	//�޼ҵ�� �̸��� ���� ��
	//�޼ҵ�� set�������̸� �������̶� ������ ���� �ִ´ٴ� �ǹ�
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	
	//�޼ҵ�� get�������̸� �������̶� ������ ����Ѵٴ� �ǹ� 
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
