package p1;

public class ClassEx01 {
	public static void main(String[] args) {
		//Sungjuk�̶�� Ŭ������ �̿��Ͽ� ����ó���ϴ� �κ� ���(����Ͻ� ����)
		//����Ͻ� ���� -> ���ø� �ϴ� ����(�����, �Է��� ��)
		
		//Sungjuk Ŭ������ ����ϱ� ���� ���޸𸮿� �ø���
//		Sungjuk sungjuk1 = new Sungjuk(100,200);//sungjuk�̶�� ������ Ŭ������ �ּҰ� ��� �ִ�.(��������)
		Sungjuk sungjuk = new Sungjuk();
		//�Է� �޴´�
		sungjuk.input();//�Է�
		//�հ�-���-����
		sungjuk.sum();//�հ�
		sungjuk.avgMethod();//���
		sungjuk.rank();//����
		sungjuk.subjectSum();//��ü�հ�
		sungjuk.subjectAvg();//��ü���
		//����Ѵ�.
		sungjuk.output();
	}
}
