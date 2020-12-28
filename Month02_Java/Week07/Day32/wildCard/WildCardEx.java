package wildCard;

import java.util.Arrays;

public class WildCardEx {
	
	public static void registerCourse(Course<?> course) {// Course�� ��� Ÿ��
		System.out.println(course.getName() + " ������ : "+Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������ : "+Arrays.toString(course.getStudents()));		
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������ : "+Arrays.toString(course.getStudents()));				
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���",5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���",5);
		workerCourse.add(new Worker("������"));
		//workerCourse.add(new Student("�л�"));
		//workerCourse.add(new Person("�Ϲ���")); //�������̳� �������� �ڼ�Ŭ������ ����
		
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));//�л��� �ڼ�Ŭ������ ����
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		
		//Course<? extends Student>�� Student�� Student�� �ڽ�Ŭ������ ����
		//registerCourseStudent(personCourse);
		//registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		
		//Course<? super Worker>�� Worker�� Worker�� �θ�Ŭ������ ����
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);
		
		
		
	}
}
