package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

//������ȭ
public class SerializableReader {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\Temp\\Obj2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC v = (ClassC) ois.readObject();
		System.out.println("field1 : "+v.fieldC1);
		System.out.println("field2 : "+v.fieldC2);
		
		/*
		ClassA v = (ClassA)ois.readObject();
		System.out.println("field1 : "+v.field1);
		System.out.println("field2 : "+v.field2.field1);
		
		System.out.println("field3 : "+v.field3);
		//static�� ����ȭ�� ���� �ʾƼ� ����(������ȭ)�� ���� ����
		
		System.out.println("field4 : "+v.field4);
		//transient�� ����ȭ�� ���� �ʾƼ� ����(������ȭ)�� ���� ����
		*/
		ois.close();
		fis.close();
		
		
		
		
	}
}
