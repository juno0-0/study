package p2;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[][] score = new int[5][];
		score[0] = new int[4];	//��� �ؿ� �ִ°� ���ͼ� Garvage
		score[4] = new int[3];
		score[0] = new int[5];	//������ ���߿� �Է��Ѱ� ��
		
		int[][] score1 = {{1,2},{3,4,5},{6},{7},{8,9}};
		//�� ���� �����ּҰ� �� �࿡ ���� ���� �����ּҰ� score1�� �� ��
//		int[][] score1 = new int[5][]{{1,2},{3,4,5},{6},{7},{8,9}}; �̰� �ȵȴ�.
//		int[][] score1 = new int[][]{{1,2},{3,4,5},{6},{7},{8,9}}; �̰� �ȴ�.
		
		String[] strArray = new String[4];
		
		strArray[0] = "Java";//���� �ִ°� �ƴ϶� heap������ �ִ� Java�� �ּҸ� strArray[0]�� �־��ִ� ��
		strArray[1] = new String("C++");
		strArray[2] = new String("C++");
		strArray[3] = new String("Java");
		//String�� ���������� ���� ���� new�� ������ �ּҸ� �����Ѵ�.
		
		for(String a : strArray) {
			System.out.println(a);
		}
		
		//== �����ڷ� ���ϱ�
		//strArray[0]�� ������ �ִ� �ּҿ� strArray[3]�� ������ �ִ� �ּҰ� ������ ��
		if(strArray[0]==strArray[3]) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		System.out.println(strArray[1]==strArray[2]);
		
		//���������� ����Ű�� ���� ������ ���ϱ� .equals()
		System.out.println(strArray[0].equals(strArray[3]));
		
		//Student Ŭ������ �迭�� �ֱ�
		Student[] studentArray = new Student[4];
		
		studentArray[0] = new Student();
		studentArray[1] = new Student();
		
		//== �����ڷ� [0][1]�� ������ ���ϱ�
		System.out.println(studentArray[0]==studentArray[1]);
		
		//[0],[1]�� �ּҷ� ���� �ִ� sa ������ ������ ���ϱ�
		System.out.println(studentArray[0].sa==studentArray[1].sa);
	}
}

class Student{
	int sa = 10;
}
