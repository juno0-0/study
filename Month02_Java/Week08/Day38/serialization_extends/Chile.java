package serialization_extends;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Chile extends Parent implements Serializable{
	public String field2;
	
	//자식 객체를 직렬화할 때 자동호출 된다.
	//부모 클래스의 필드를 직접 불러오기
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.writeUTF(field1);//부모 객체의 필드값을 출력
		oos.defaultWriteObject();//자식 객체의 필드값을 출력
	}
	
	//자식 객체를 역직렬화할 때 자동호출 된다.
	private void readObject(ObjectInputStream ois) throws Exception{
		field1 = ois.readUTF();//부모 객체의 필드값을 읽어옴
		ois.defaultReadObject();//자식 객체의 필드값을 읽어옴
	}
	
}
