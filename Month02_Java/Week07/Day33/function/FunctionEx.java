package function;

import java.util.*;
import java.util.function.*;

public class FunctionEx {
	//�迭�� ������ ũ�Ⱑ ������ ListŸ���� ����
	private static List<Student> list = Arrays.asList(new Student("ȫ�浿",90,96,true)
													 ,new Student("�ſ��",95,93,false));
	
	//Student�� ���� String�� ���´�
	private static void printString(Function<Student, String> f) {//Function<T,R>
		for(Student s:list) {
			//R apply(T t); T�� ���� R�� ����
			System.out.println(f.apply(s));
			
			//f.apply(student)�̰� Ǯ� ����
			
			//String apply(Student student){
			//   return student.getName();
			//}�̷� ������ �Ǵ� ��
			
		}
	}
	
	private static void printInt(ToIntFunction<Student> tif) {//ToIntFunction<T>
		for(Student s: list) {
		    //int applyAsInt(T value); T�� ���� int�� ����
			System.out.println(tif.applyAsInt(s));	
		}
	}
	
	private static void printDouble(ToDoubleFunction<Student> tbf) {
		for(Student s: list) {
			System.out.println(tbf.applyAsDouble(s));
		}
	}
	
	private static void printLong(ToLongFunction<Student> tlf) {
		for(Student s:list) {
			System.out.println(tlf.applyAsLong(s));
		}
	}

	private static void printBoolean(Function<Student, Boolean> b) {
		for(Student s: list) {
			System.out.println(b.apply(s));
		}
	}
	
	private static void printBiFu(BiFunction<String, Integer, String> bf) {
		System.out.println(bf.apply("�ҳ�Ÿ", 300));
	}
	
	private static void printTDBF(ToDoubleBiFunction<Integer, Double> t) {
		System.out.println(t.applyAsDouble(10, 20.5));
	}
	
	public static void main(String[] args) {
		System.out.println("�л��̸�");
		printString(f->f.getName());//�Ű����� f�� �ָ� f�� Student�� ����Ÿ���� String�̴ϱ�
		System.out.println("��������");//Student�� ���� getName()�� ȣ���ϴ� ��
		printInt(tif->tif.getEng());
		System.out.println("��������");
		printInt(tif->tif.getMath());
		printDouble(tbf->tbf.getEng());
		printLong(tlf->tlf.getMath());
		printBoolean(b->b.isCheck());
		printBiFu((t,v)->t+" "+v+"����");
		printTDBF((t,v)->t*v);
	}
}
class Student{
	private String name;
	private int eng;
	private int math;
	private boolean check;
	
	public Student(String name, int eng, int math, boolean check) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.check = check;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
}