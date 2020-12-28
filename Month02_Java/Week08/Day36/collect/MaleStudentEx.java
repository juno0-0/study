package collect;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MaleStudentEx {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(new Student("홍길동",10,Student.Sex.MALE),
				  new Student("김수애",6,Student.Sex.FEMALE),
				  new Student("신용권",10,Student.Sex.MALE),
				  new Student("박수미",6,Student.Sex.FEMALE));
		/*각 리턴타입 단계별로
		//전채 학생 List에서 오리지널 스트림 얻기(싱글스레드)
		//Stream<Student> totalStream = totalList.stream();		
		//전채 학생 List에서 오리지널 스트림 얻기(멀티스레드)
		Stream<Student> totalStream = totalList.parallelStream();
		//남학생만 필터링해서 중간 처리 스트림 얻기
		Stream<Student> maleStream = totalStream.filter(s->s.getSex()==Student.Sex.MALE);
		//Supplier로 남학생 객체 생성
		Supplier<MaleStudent> supplier = ()->new MaleStudent();
		//MaleStudent의 accumulate()로 Student 객체를 수집하는 BiConsumer를 얻기
		BiConsumer<MaleStudent, Student> accumulate = (m,s)->m.accumulate(s);
		//MaleStudent를 매개값으로 받아 combine()으로 결합하는 BiConsumer를 얻기
		BiConsumer<MaleStudent, MaleStudent> combine = (m1,m2)->m1.combine(m2);
		//Supplier가 제공하는 MaleStudent에 accumulate가 Student를 수집해서 최종 리턴된 MaleStudent를 얻기
		MaleStudent maleStudent = maleStream.collect(supplier, accumulate, combine);
		*/
		
		/*람다식으로 표현
		//MaleStudent maleStudent = totalList.stream().filter(s->s.getSex()==Student.Sex.MALE)
		//		.collect(()->new MaleStudent(), (m,s)->m.accumulate(s),(m1,m2)->m1.combine(m2));
		MaleStudent maleStudent = totalList.parallelStream().filter(s->s.getSex()==Student.Sex.MALE)
				.collect(()->new MaleStudent(), (m,s)->m.accumulate(s),(m1,m2)->m1.combine(m2));
		System.out.println(maleStudent);
		*/
		
		//메소드 참조로 표현
		//MaleStudent maleStudent = totalList.stream().filter(s->s.getSex()==Student.Sex.MALE)
		//		.collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
		MaleStudent maleStudent = totalList.parallelStream().filter(s->s.getSex()==Student.Sex.MALE)
				.collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
		maleStudent.getList().stream().forEach(s->System.out.println(s.getName()));
		
		
	}
}
