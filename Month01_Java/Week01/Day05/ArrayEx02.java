package P1;

public class ArrayEx02 {
	public static void main(String[] args) {
		//int �迭 ���� --> 7 ���(7ĭ)
		//�迭�� default �� �˱�
		int[] arInt;
		arInt = new int[7];
		
		for(int i : arInt) {
			System.out.println("i => "+i);
		}
		System.out.println();
		for(int i=0;i<arInt.length;i++) {
			System.out.println("i => "+arInt[i]);
		}
		System.out.println();
		//boolean �迭�� �����ϰ� �迭�� ��� 3�� �ش�. �׸��� ����� �� �ʱⰪ�� false���� Ȯ��
		boolean[] arBoolean = new boolean[3];
		for(boolean b : arBoolean) {
			System.out.println("b => "+b);//false
		}
		System.out.println();
		//Ŭ���� �迭�� �����ϰ� �迭�� ��� 3�� �ش�. �׸��� ����� �� �ʱⰪ�� null���� Ȯ��
		String[] arString = new String[3];
		for(String s : arString) {
			System.out.println("s => "+s);//null
		}
		System.out.println();
		Student1[] arTest = new Student1[3];
		for(Student1 t : arTest) {
			System.out.println("t => "+t);//null
		}
		System.out.println();
		//InterEx �������̽��� ����� �迭�� �����ϰ� �迭 ��� 2���� �ش�.
		InterEx[] arInter = new InterEx[2];
		for(InterEx in : arInter) {
			System.out.println("in => "+in);
		}
		
		//�ʱⰪ �ִ� ���1 - new �����ڸ� �̿�
		//�ʱⰪ �ִ� ���2 - �������ڸ��� �ٷ� �ֱ�
		int[] intArray2 = {1,2,3,4,5};
		double[] doubleArray2 = {1.1, 2.2, 3.3};
		
		System.out.println(intArray2.length);
		System.out.println(doubleArray2.length);
		
		 
	}
}

class Student1{
	
}

interface InterEx{
	
}
