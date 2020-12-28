package wildCard;

import java.util.Arrays;

public class WildCardEx {
	
	public static void registerCourse(Course<?> course) {// Course의 모든 타입
		System.out.println(course.getName() + " 수강생 : "+Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : "+Arrays.toString(course.getStudents()));		
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : "+Arrays.toString(course.getStudents()));				
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정",5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정",5);
		workerCourse.add(new Worker("직장인"));
		//workerCourse.add(new Student("학생"));
		//workerCourse.add(new Person("일반인")); //직장인이나 직장인의 자손클래스만 가능
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));//학생의 자손클래스라 가능
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		
		//Course<? extends Student>라서 Student와 Student의 자식클래스만 가능
		//registerCourseStudent(personCourse);
		//registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		
		//Course<? super Worker>라서 Worker와 Worker의 부모클래스만 가능
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);
		
		
		
	}
}
