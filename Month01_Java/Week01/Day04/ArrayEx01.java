package P3;

public class ArrayEx01 {

	public static void main(String[] args) {
		//�迭 ���� �ʱⰪ�� �ֱ�
		int[] intArray = null; 
		char[] charArray = null;
		short shortArray[] = null;	//[]�� Ÿ�Ե�, ������� ��� ����.
		short[] shortArray1 = null;
		long[] longArray = null;
		byte[] byteArray = null;
		
		Student[] studentArray;	//Student Ŭ������ �迭
		
		//����Ϸ��� ���޸𸮿� �÷��� �մϴ�.
		intArray = new int[5];
		charArray = new char[5];
		shortArray = new short[5];
		shortArray1 = new short[5];
		longArray = new long[5];
		byteArray = new byte[5];
		studentArray = new Student[5];
		
		//�迭�� �����ϸ鼭 ���ÿ� ���޸𸮿� �ø��� �Ǽ��� �迭 3���
		float[] floatArray = new float[3];
		double[] doubleArray = new double[3];
		String[] stringarray = new String[3];
		
		//�迭���� ����ϱ� = hashCode(�ּ�)�� ��� �ȴ�.
		//�迭�� ����ϸ� �ڿ� toString()�޼ҵ尡 �ڵ����� �ٿ��� ȣ��ȴ�.
		//toString() : ���� �ڷḦ ���ڿ��� ����ϼ���.
		System.out.println(intArray);
		System.out.println(charArray.toString());
		System.out.println(shortArray);
		System.out.println(shortArray1);
		System.out.println(longArray);
		System.out.println(byteArray.toString());
		System.out.println(studentArray);
		System.out.println(floatArray);
		System.out.println(doubleArray);
		System.out.println(stringarray.toString());
		
		
		
	}

}
class Student{
	
}
