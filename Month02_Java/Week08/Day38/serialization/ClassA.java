package serialization;

import java.io.Serializable;

//직렬화 할 클래스
//직렬화 하려면 Serializable을 구현한다.
public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;//transient : 직렬화시 제외하고 싶은 경우 사용하는 키워드
	
}
