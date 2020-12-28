package getBytes;

import java.io.UnsupportedEncodingException;

public class UnsupportedEncodingEx {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���.";
		//indexOf("")
		int i = str.indexOf("��");
		System.out.println(i);
		int j = str.indexOf("��");
		System.out.println(j);
		int k = str.indexOf("��");
		if(k==-1) {
			System.out.println("�ش� ���ڴ� �����ϴ�.");
		}else {
			System.out.println(k);			
		}
		//replace('','')
		String rstr = str.replace('��', '��');
		System.out.println(rstr);
		//replaceAll("","")
		String rastr = str.replaceAll("�ȳ�", "����");
		System.out.println(rastr);
		//substring(index)
		String s1 = str.substring(2);
		System.out.println(s1);
		//substring(index1, index2)
		String s2 = str.substring(0, 1);//0������ 1�� �̸�����
		System.out.println(s2);
		//trim()
		System.out.println("ȣ��");
		String strr = "    ��� ����    ";
		System.out.println(strr.length());
		String trimS1 = strr.trim();
		System.out.println(strr.length());		
		System.out.println(trimS1);
		//valueOf
		int ii = 10;
		double dd = 10.24;
		Car c = new Car();
		//���������� �ڷ����� String���� �ٲٱ�
		String sc = String.valueOf(c);
		System.out.println(sc);
		String sii = String.valueOf(ii);//10 --> "10"
		System.out.println(sii);
		String sdd = String.valueOf(dd);//10.24 --> "10.24"
		System.out.println(sdd);
		System.out.println("=================");
		System.out.println(ii+dd);//���ڴϱ� ������ ��
		System.out.println(sii+sdd);//���ڴϱ� ������ ��
		
		//�⺻���ڼ�
		//2���� �迭�� �ٲ� ���� �ý��� ���Ϸ� ����ų� ��Ʈ��ũ�� ���� �� 
		byte[] bytes1 = str.getBytes();//���ڵ� 10���� --> 2���� byte[]
		System.out.println(bytes1.length);//�ѱ� 1���ڰ� 2byte�� 11byte�� ����
		for(byte b : bytes1) {//�ȳ��ϼ��䰡 2������ �ٲ� ��
			System.out.println(b);
		}
		
		String str1 = new String(bytes1);//���ڵ� 2���� �迭 --> 10����
		System.out.println(str1);
		
		//�ѱ� �ϼ�������
		//���ۿ� ���ڼ� �˻��ϸ� ���󺰷� �ش��ϴ� ���ڼ��� ���´�.
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
			for(byte b:bytes2) {
				System.out.println(b);
			}
			String str2 = new String(bytes2, "EUC-KR");//���ڵ� 2���� �迭 --> 10����
			System.out.println(str2);
		} catch (UnsupportedEncodingException e) {}
		
		//UTF-8��(�����ڵ�)
		//UTF-8�� 3byte��
		try {
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(bytes3.length);
			for(byte b:bytes3) {
				System.out.println(b);
			}
			String str3 = new String(bytes3, "UTF-8");//���ڵ� 2���� �迭 --> 10����
			System.out.println(str3);
		} catch (UnsupportedEncodingException e) {}
		
		
		
		
		
		
	}
}

class Car{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car";
	}
}
