package p2;

public class ClassEx02 {
	public static void main(String[] args) {
		//Student Ŭ������ ��� ������ ����ϰ� �ʹ�.
		//(Ŭ�������� �ٸ� Ŭ������ ���� ���� ����ϰ� �ʹ�.)
		//����Ϸ��� �� �޸𸮿� �ø���.
		Student st = new Student();
		st.hackbun=202001;
		st.name="ȫ�浿";
		st.tel="12345";
		st.teacherName="������";

		//�ʵ忡 ���� �����Ѵ�.
		st.name="�̼���";
		st.hackbun+=10;
		
		//�ʵ忡 ���� �����
		st.name=null;
		
		//�ٸ� Ŭ������ �ִ� �ʵ带 ���
		System.out.println(st.hackbun);
		System.out.println(st.name);
		System.out.println(st.dept);
		System.out.println(st.tel);
		System.out.println(st.teacherName);
		
		//�޼��� ȣ���ϱ�
		//�Է� �޼��带 ȣ���ؼ� ���� �ֱ�
		st.input();//"�ֹ̼�"
		st.output();
		
		
	}

}
