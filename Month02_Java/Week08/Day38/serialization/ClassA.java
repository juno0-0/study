package serialization;

import java.io.Serializable;

//����ȭ �� Ŭ����
//����ȭ �Ϸ��� Serializable�� �����Ѵ�.
public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;//transient : ����ȭ�� �����ϰ� ���� ��� ����ϴ� Ű����
	
}
