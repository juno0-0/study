package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\Obj2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//각 클래스의 필드에 값 넣기
		ClassA a = new ClassA();
		a.field1 = 1;
		a.field2.field1 = 1;//ClassB의 field1에 1을 넣은 것
		a.field3 = 2;//static
		a.field4 = 3;//transient
		
		ClassC c = new ClassC();
		c.fieldC1 = 100;
		c.fieldC2 = 1000;
		
		oos.writeObject(c);
		oos.flush();
		oos.close();
		fos.close();

		
	}
}
