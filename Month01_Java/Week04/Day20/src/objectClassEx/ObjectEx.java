package objectClassEx;

public class ObjectEx {
	public static void main(String[] args) {
		//�̸��� ���̰� ������ ���� ������� �Ǵ��ϱ�
		Value v1 = new Value("ȫ�浿",10);
		Value v2 = new Value("ȫ�浿",10);
		Value v3 = new Value("�̼���",20);
		if(v1.equals(v2)) {//v1�� �ּҿ� v2�� �ּҰ� �ٸ��� => new�� �ؼ�
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		if(v1.equals(v3)) {//v1�� �ּҿ� v2�� �ּҰ� �ٸ��� => new�� �ؼ�
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		
		
	}

}



class Value{
	String name;
	int age;
	public Value(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value) {
			Value v = (Value)obj;
			if(name.equals(v.name)&&age==v.age) {
				return true;
			}
		}
		return false;
	}
	
}
