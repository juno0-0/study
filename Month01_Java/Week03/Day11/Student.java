package ex;

public class Student {
	private String dept;
	private int num;
	
	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public static void main(String[] args) {
		Student s = new Student();
		s.dept="컴퓨터학과";
		s.num=202010;
		System.out.println(s.dept);
		System.out.println(s.num);

		Student s1 = new Student();
		s1.setDept("식음료학과");
		s1.setNum(202011);
		System.out.println(s1.getDept());
		System.out.println(s1.getNum());
		
	}
}
