package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OjbectInputOutputStreamEx {
	public static void main(String[] args) throws Exception {
		//직렬화된 모습
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\obj1.dat");//출력 기반 스트림
		ObjectOutputStream oos = new ObjectOutputStream(fos);//보조 기반 스트림
		
		oos.writeObject(new Integer(100));//객체 사용
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new String("아이유"));
		
		oos.flush();
		oos.close();
		fos.close();
		
		//역직렬화된 모습
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
