package serialization_extends;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerialzableEx {
	public static void main(String[] args) throws Exception {
		//직렬화하기
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\nonObj.dat");//기반 스트림
		ObjectOutputStream oos = new ObjectOutputStream(fos);//보조 기반 스트림 연결
		
		Chile c = new Chile();
		c.field1 = "부모 이름";
		c.field2 = "자식 이름";
		
		oos.writeObject(c);//oos를 붙였지만 사실은 Child 클래스의 writeObject()를 호출한 것
		oos.flush();
		oos.close();
		fos.close();
		
		//역직렬화하기
		FileInputStream fis = new FileInputStream("D:\\Temp\\nonObj.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Chile child = (Chile)ois.readObject();//oos를 붙였지만 사실은 Child 클래스의 rideObject()를 호출한 것
		System.out.println(child.field1);
		System.out.println(child.field2);
		
		
		
		
	}
}
