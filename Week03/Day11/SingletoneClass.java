package data;

public class SingletoneClass {
//	���ٱ���    static     Ŭ������		   ������ 			       �ν��Ͻ�
	private static SingletoneClass singleTone = new SingletoneClass(); 
	
	private SingletoneClass() {
		System.out.println("�̱��� Ŭ������ ������ �κ�");
	}
	
	public static SingletoneClass getInstance() {//public�� ������ ���� ��Ű�� �ȿ����� ��� ����
		return singleTone;//�������� ���� 
	}
}
