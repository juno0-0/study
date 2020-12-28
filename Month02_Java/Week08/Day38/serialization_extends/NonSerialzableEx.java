package serialization_extends;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerialzableEx {
	public static void main(String[] args) throws Exception {
		//����ȭ�ϱ�
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\nonObj.dat");//��� ��Ʈ��
		ObjectOutputStream oos = new ObjectOutputStream(fos);//���� ��� ��Ʈ�� ����
		
		Chile c = new Chile();
		c.field1 = "�θ� �̸�";
		c.field2 = "�ڽ� �̸�";
		
		oos.writeObject(c);//oos�� �ٿ����� ����� Child Ŭ������ writeObject()�� ȣ���� ��
		oos.flush();
		oos.close();
		fos.close();
		
		//������ȭ�ϱ�
		FileInputStream fis = new FileInputStream("D:\\Temp\\nonObj.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Chile child = (Chile)ois.readObject();//oos�� �ٿ����� ����� Child Ŭ������ rideObject()�� ȣ���� ��
		System.out.println(child.field1);
		System.out.println(child.field2);
		
		
		
		
	}
}
