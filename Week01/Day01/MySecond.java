package p01;

public class MySecond {
	//������ ���� ����� ���ͷ�
	static byte byte_value = -128;//������ �ʱ�ȭ	�ʵ�	-128 ~ 127������ ���� ǥ��
	static short short_value = 100;//2����Ʈ ǥ������ -32768 ~ 32767
	static int int_value = 2147483647;//4����Ʈ�̹Ƿ� ǥ������ -21474863648 ~ 21474863647
	static long long_value = 0xadL;//a=10, b=11, c=12, d=13, e=14, f=15		L : long type�̶�� ��
	static char char_value = 97;//�ƽ�Ű�ڵ� ���� ������ �ڵ� ���ڸ� ����Ѵ�.
	
	//�Ǽ��� ���� ����� ���ͷ�
	static float float_value = 3.12345678901f, float_value2 = -5.2f;	//�Ǽ��� 4����Ʈ �Ҽ��� 7�ڸ������� ���
	static double double_value = 3.12345678901234567, double_value2 = 5E7;	//�Ǽ��� 8����Ʈ �⺻��. �ε��Ҽ��� ǥ�����
	
	//������
	static char char_value1 = 'A';
	static char char_value2 = '\n';//�����
	static char char_value3 = '\t';
	static char char_value4 = '\'';// \������ Ư�����ڸ� ����Ϸ��� �� �� �����
	
	
/*																			
 * F2 = Rename
 * �� ���Ͽ��� 3���� class�� �ִ� ��
 */
	public static void main(String[] args) {
		
		System.out.println(char_value1 + char_value2 + "����" + char_value3 + char_value4);
		
		System.out.printf("%d\n",byte_value);//10������ ���
		System.out.printf("%o\n",int_value);//8������ ���
		System.out.printf("%x\n",long_value);//16������ ���
		System.out.println(char_value);
		System.out.println(short_value);
		System.out.println(float_value + " "+float_value2);
		System.out.println(double_value + " "+double_value2);
		
		
	}
}

class Student{
	
	
}

class Teacher{
	
	
}