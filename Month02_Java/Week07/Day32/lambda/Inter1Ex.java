package lambda;

public class Inter1Ex {
	public static void main(String[] args) {
		Inter1 i1 = new Inter1() {
			
			@Override
			public void inter1Method() {
				System.out.println("�͸� ���� ��ü ǥ���ϱ�");
			}
		};
		
		Inter1 i2 = ()->{System.out.println("�͸� ���� ��ü ǥ���ϱ�");
						 System.out.println("��ü���� ������ ���");};
						 //���๮�� 1���� { }���� ����
		i1.inter1Method();
		i2.inter1Method();
	}
}
