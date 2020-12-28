package function;

import java.util.*;
import java.util.function.*;

public class FunctionEx {
	//배열을 넣으면 크기가 고정된 List타입이 나옴
	private static List<Student> list = Arrays.asList(new Student("홍길동",90,96,true)
													 ,new Student("신용권",95,93,false));
	
	//Student가 들어가면 String이 나온다
	private static void printString(Function<Student, String> f) {//Function<T,R>
		for(Student s:list) {
			//R apply(T t); T가 들어가면 R이 나옴
			System.out.println(f.apply(s));
			
			//f.apply(student)이걸 풀어서 쓰면
			
			//String apply(Student student){
			//   return student.getName();
			//}이런 구조가 되는 것
			
		}
	}
	
	private static void printInt(ToIntFunction<Student> tif) {//ToIntFunction<T>
		for(Student s: list) {
		    //int applyAsInt(T value); T가 들어가면 int가 나옴
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
		System.out.println(bf.apply("소나타", 300));
	}
	
	private static void printTDBF(ToDoubleBiFunction<Integer, Double> t) {
		System.out.println(t.applyAsDouble(10, 20.5));
	}
	
	public static void main(String[] args) {
		System.out.println("학생이름");
		printString(f->f.getName());//매개변수 f를 주면 f는 Student고 리턴타입은 String이니까
		System.out.println("영어점수");//Student가 가진 getName()을 호출하는 것
		printInt(tif->tif.getEng());
		System.out.println("수학점수");
		printInt(tif->tif.getMath());
		printDouble(tbf->tbf.getEng());
		printLong(tlf->tlf.getMath());
		printBoolean(b->b.isCheck());
		printBiFu((t,v)->t+" "+v+"만원");
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