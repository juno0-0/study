package p2;

public class AnimalMain {
	public static void main(String[] args) {
		//������Ŭ���� ��üȭ
		Dog d = new Dog();
		
		//�����Ŭ���� ��üȭ
		Cat c = new Cat();
		
		//������Ŭ���� ������
		Animal dog = new Dog();
		
		//�����Ŭ���� ������
		Animal cat = new Cat();
		
		//����Ŭ���� ��üȭ
		//Animal a = new Animal();
		
		//��� ����̴� �߿˾߿��ϰ� ��ϴ�. ����̴� ���� ���ϴ�. �������� �۸۸۸��ϰ� ¢���ϴ�. �������� ���� ���ϴ�.
		Cat nabi = (Cat)cat;
		
		System.out.print(cat+"�� ");
		cat.sound();
		System.out.println("�ϰ� ��ϴ�.");
		System.out.print(cat+"�� ");
		cat.breathe();
		
		System.out.print(dog.kind+"�� ");
		dog.sound();
		dog.sound();
		System.out.println("¢���ϴ�.");
		System.out.print(dog.kind+"�� ");
		dog.breathe();
				
	}
}
