package stringEx;

public class StringCharAtEx {
	public static void main(String[] args) {
		String ssn1 = "010624-1230123";
		String ssn2 = "010624-1230123";//���� ssn1�̶� hashCode�� �����Ƿ� ���ü
		String ssn3 = new String("010624-1230123");
		//��hashCode�� �ּҸ� �̿��� ����� ������ �ּҰ� ������ hashCode�� ����.
		
		if(ssn1==ssn2) {//ssn1�� �ּҿ� ssn2�� �ּҰ� ����? = true
			System.out.println("���� �ֹι�ȣ");
		}else {
			System.out.println("�ٸ� �ֹι�ȣ");
		}
		
		if(ssn1==ssn3) {//ssn1�� �ּҿ� ssn3�� �ּҰ� ����? = false
			System.out.println("���� �ֹι�ȣ");
		}else {
			System.out.println("�ٸ� �ֹι�ȣ");
		}
		
		if(ssn1.equals(ssn2)) {//ssn1�� �ּ��� ���� ssn2�� �ּ��� ���� ����?
			System.out.println("���� �ֹι�ȣ");
		}else {
			System.out.println("�ٸ� �ֹι�ȣ");
		}
		
		if(ssn1.equals(ssn3)) {//ssn1�� �ּ��� ���� ssn2�� �ּ��� ���� ����?
			System.out.println("���� �ֹι�ȣ");
		}else {
			System.out.println("�ٸ� �ֹι�ȣ");
		}
		
		/*charAt(index)
		char s = ssn1.charAt(7);
		System.out.println(s);
		char s1 = ssn1.charAt(0);
		char s2 = ssn1.charAt(1);
		//System.out.println(s1+s2);//�ƽ�Ű�ڵ�� ����̵Ǽ� 97�� ����
		System.out.print(s1);
		System.out.println(s2);
		*/
		
		
		
		
		
	}
}
