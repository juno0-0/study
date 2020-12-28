package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OjbectInputOutputStreamEx {
	public static void main(String[] args) throws Exception {
		//����ȭ�� ���
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\obj1.dat");//��� ��� ��Ʈ��
		ObjectOutputStream oos = new ObjectOutputStream(fos);//���� ��� ��Ʈ��
		
		oos.writeObject(new Integer(100));//��ü ���
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new String("������"));
		
		oos.flush();
		oos.close();
		fos.close();
		
		//������ȭ�� ���
		FileInputStream fis = new FileInputStream("D:\\Temp\\obj1.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer)ois.readObject();
		Double obj2 = (Double)ois.readObject();
		int[] obj3 = (int[])ois.readObject();
		String obj4 = (String)ois.readObject();
		
		ois.close();
		fis.close();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0]+" "+obj3[1]+" "+obj3[2]);
		System.out.println(obj4);
		
		
		
	}
}
