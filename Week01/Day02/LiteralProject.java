package P1;
//���������� '\n'
public class LiteralProject {
	public static void main(String[] args) {
		char char_value1 = 'A';
		char char_value2 = '\n';
		char char_value3 = '\t';
		/*
		System.out.print(char_value1);
		System.out.print(char_value2);
		System.out.print(char_value3);
		System.out.print("B");
		C������ System.out.printf("%c %c %c %c",char_value1,char_value2,char_value3,'B');
		System.out.print(char_value1 + char_value2 + char_value3 + 'B');
		 */		
		//System.out.println();�ȿ� + ��ȣ�� ���� ����
		//�ƽ�Ű�ڵ�� 'A' = 65 \n = 10	\t = 9	'B' = 66
		//char�� ��� ���ϱ�
		int a=10;
		int b=20;
		String word = "bangjunho";
		String word2 = "Hi!";
		System.out.println(a + b + word + (a + b));//���ڿ��� + ������ => ���ڿ���
		System.out.println(word2 + " " + word);
		
		boolean boolean1 = true;	//booleanŸ�Կ��� true, false�� �� �� �ִ�.(0,1�� �ȵȴ�.)
		boolean boolean2 = false;
		
		boolean1 = 100 < 110;
		boolean2 = true && true;
		System.out.println(boolean1 + "   " + boolean2);
		
		//�ڷ��� �⺻�� : ������ - int long byte short �Ǽ��� - float double ������ - char ���� - boolean
		//String�� �⺻���� �ƴϰ� ������������ �⺻���� ������ ����� ���� �� �ִ�.)
		//	      ������ : String Ŭ������ ��������
		
		//���ͷ� ���� 10���� : 123456 8���� : 073 041 �տ� 0�ٰ̺� 0~7����  16���� : 0xfc 0xa3 0~f����
		//     �Ǽ� �Ҽ��� : 3.14f 3.14 ������ : 0.3E-7(0.3*10^-7)
		//     ������ : 'a' ' ' '\n' 2byte
		//     ���� : true,false
		//     ���ڿ� : "korea"
		
		
		
		
	}
}
