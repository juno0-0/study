package P1;

public class Test {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i==3)continue;//�ڱⰡ ���� �ִ� �ݺ������� �Ʒ� �κ��� ���� �ʰ� �ٽ� ���������� �ö󰣴�.
			for(int j=0;j<5;j++) {
				if(j==3)continue;//���� �����ϱ�? �ڱⰡ ���� �ݺ����� Ż��
				System.out.println("���� �ݺ����Դϴ�."+j);
			}
			System.out.println("�ٱ��� �ݺ����Դϴ�."+i);
		}
	}

}
