package streamPipelines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipelinesEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student(1,100,90),
										   new Student(2,80,100),
										   new Student(1,70,50),
										   new Student(2,85,100));
		
		int s = list.stream().filter(a->a.getClassNum()==Student.one).mapToInt(Student::getKor).sum();
		System.out.println("1반의 국어 점수 합계 : "+s);
		int ss = list.stream().filter(a->a.getClassNum()==Student.two).mapToInt(Student::getEng).sum();
		System.out.println("2반의 영어 점수 합계 : "+ss);
		int sss = list.stream().mapToInt(Student::getKor).sum();
		System.out.println("수학 점수 합계 : "+sss);
		int ssss = list.stream().mapToInt(Student::getEng).sum();
		System.out.println("영어 점수 합계 : "+ssss);
		
	}
}
class Student{
	public static int one = 1;
	public static int two = 2;
	private int classNum;
	private int kor;
	private int eng;
	
	public Student(int classNum, int kor, int eng) {
		this.classNum = classNum;
		this.kor = kor;
		this.eng = eng;
	}

	public int getClassNum() {
		return classNum;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}
	
	
	
	
}