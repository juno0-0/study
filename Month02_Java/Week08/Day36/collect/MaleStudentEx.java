package collect;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MaleStudentEx {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(new Student("ȫ�浿",10,Student.Sex.MALE),
				  new Student("�����",6,Student.Sex.FEMALE),
				  new Student("�ſ��",10,Student.Sex.MALE),
				  new Student("�ڼ���",6,Student.Sex.FEMALE));
		/*�� ����Ÿ�� �ܰ躰��
		//��ä �л� List���� �������� ��Ʈ�� ���(�̱۽�����)
		//Stream<Student> totalStream = totalList.stream();		
		//��ä �л� List���� �������� ��Ʈ�� ���(��Ƽ������)
		Stream<Student> totalStream = totalList.parallelStream();
		//���л��� ���͸��ؼ� �߰� ó�� ��Ʈ�� ���
		Stream<Student> maleStream = totalStream.filter(s->s.getSex()==Student.Sex.MALE);
		//Supplier�� ���л� ��ü ����
		Supplier<MaleStudent> supplier = ()->new MaleStudent();
		//MaleStudent�� accumulate()�� Student ��ü�� �����ϴ� BiConsumer�� ���
		BiConsumer<MaleStudent, Student> accumulate = (m,s)->m.accumulate(s);
		//MaleStudent�� �Ű������� �޾� combine()���� �����ϴ� BiConsumer�� ���
		BiConsumer<MaleStudent, MaleStudent> combine = (m1,m2)->m1.combine(m2);
		//Supplier�� �����ϴ� MaleStudent�� accumulate�� Student�� �����ؼ� ���� ���ϵ� MaleStudent�� ���
		MaleStudent maleStudent = maleStream.collect(supplier, accumulate, combine);
		*/
		
		/*���ٽ����� ǥ��
		//MaleStudent maleStudent = totalList.stream().filter(s->s.getSex()==Student.Sex.MALE)
		//		.collect(()->new MaleStudent(), (m,s)->m.accumulate(s),(m1,m2)->m1.combine(m2));
		MaleStudent maleStudent = totalList.parallelStream().filter(s->s.getSex()==Student.Sex.MALE)
				.collect(()->new MaleStudent(), (m,s)->m.accumulate(s),(m1,m2)->m1.combine(m2));
		System.out.println(maleStudent);
		*/
		
		//�޼ҵ� ������ ǥ��
		//MaleStudent maleStudent = totalList.stream().filter(s->s.getSex()==Student.Sex.MALE)
		//		.collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
		MaleStudent maleStudent = totalList.parallelStream().filter(s->s.getSex()==Student.Sex.MALE)
				.collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
		maleStudent.getList().stream().forEach(s->System.out.println(s.getName()));
		
		
	}
}
