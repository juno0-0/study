package serialization_extends;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Chile extends Parent implements Serializable{
	public String field2;
	
	//�ڽ� ��ü�� ����ȭ�� �� �ڵ�ȣ�� �ȴ�.
	//�θ� Ŭ������ �ʵ带 ���� �ҷ�����
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.writeUTF(field1);//�θ� ��ü�� �ʵ尪�� ���
		oos.defaultWriteObject();//�ڽ� ��ü�� �ʵ尪�� ���
	}
	
	//�ڽ� ��ü�� ������ȭ�� �� �ڵ�ȣ�� �ȴ�.
	private void readObject(ObjectInputStream ois) throws Exception{
		field1 = ois.readUTF();//�θ� ��ü�� �ʵ尪�� �о��
		ois.defaultReadObject();//�ڽ� ��ü�� �ʵ尪�� �о��
	}
	
}
