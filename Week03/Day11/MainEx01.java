package p1;

import java.util.Calendar;

import data.SingletoneClass;
import data.SungJuk;

/*
 * 
 */
public class MainEx01 {
	public static void main(String[] args) {
		SungJuk sj = new SungJuk();
		sj.setHakbun(202010);//SungJukŬ������ �ִ� �޼ҵ带 ����Ϸ��� �� �޼ҵ带 public�� �ٲ���� �Ѵ�.
		//private�̶� ��ü�� �ʵ忡 �����ؼ� ���� ���� �� ����.  
		System.out.println(sj.getHakbun());
		
		//��üȭ �ϱ�
		//SingletoneClass s = new SingletoneClass();//�����ڰ� private�̶� ���� ����
		SingletoneClass singleToneAddr1 = SingletoneClass.getInstance();//Ŭ�����޼ҵ��̹Ƿ� Ŭ������.�޼ҵ��()���� ������
		SingletoneClass singleToneAddr2 = SingletoneClass.getInstance();
		SingletoneClass singleToneAddr3 = SingletoneClass.getInstance();
		//getInstance()�� �޴� ���������� 3�������� ������ �ִ� ���޸� �ּҴ� ����.
		System.out.println(singleToneAddr1);
		System.out.println(singleToneAddr2);
		System.out.println(singleToneAddr3);
		
		Calendar c = Calendar.getInstance();
	}
}
