package poly;
//����
public class Main {
	public static void main(String[] args) {
		/*
		//CaptionTV(�ڽ�Ŭ����1) �ν��Ͻ�ȭ �ϱ�
		CaptionTV ctv = new CaptionTV();
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		//AITV(�ڽ�Ŭ����2) �ν��Ͻ�ȭ �ϱ�
		AITV atv = new AITV();
		atv.channelDown();
		System.out.println(atv.channel);
		
		//TV(�θ�Ŭ����) �ν��Ͻ�ȭ �ϱ�
		TV tv = new TV();
		tv.channelUp();
		System.out.println(tv.channel);
		//��������� �ڱ��� �ν��Ͻ��� �ڱ��� Ÿ������ �޾���
		*/
		
		//�θ� �������� = new �ڽ�();
		//�ڽ��� �������� �ö� �� �θ� ���� �ø��� �ö�
		//�ڽ��� �ν��Ͻ�ȭ�� �θ� �޴� �� = ������
		TV ctv = new CaptionTV();//�� ����� ������, ������ ū�ɷ� �� �� �ڵ�����ȯ(up-casting)�� �ȴ�.
		TV atv = new AITV();
		
		//�θ� �������� �ö� �� �ڽ��� �ö��� ���� ���¶� ����
		//���������� TV() �θ� Ŭ������ �ִµ� ���������� �ڽ� Ŭ������ �����Ѿ� �ϱ� ������
//		CaptionTV cttv = new TV();
//		AITV aitv = new TV();
		
		
		//�θ� �ʵ�, �޼ҵ� ��� ����� �� �ִ�.
		ctv.power=true;
		atv.channel=7;
		atv.channelUp();
		atv.channelDown();
		System.out.println(atv.channel);
		
		//�θ��� �޼ҵ尡 �ƴ϶� �ڽ��� �޼ҵ尡 ����Ǿ� �� ���
		//���1. Override�� ���� �ڽ��� �޼ҵ尡 ����ȴ�.
		//�θ�Ÿ������ ���������� �޾����� �������� ��� �����ǵ� �޼ҵ尡 ���
		ctv.channelUp();
		ctv.channelDown();
		
		//���2. �ڽ��� ������ �޼ҵ带 �����ϰ� ���� ��
		//ctv.text = "ȫ�浿";(X)
		//ctv�� �θ�Ÿ���� ��������
		//=ctv�� ���� TV�� �ִ�.
		//=�޸𸮿��� �ڽ�Ŭ������ ������ ���������� TV�� ����Ű�� �־ TV�� text�� ���� ������ ������.
		//�ڽ�Ÿ��		      �θ�Ÿ���� �ڽ�Ÿ������ ����ȯ
		CaptionTV ct = (CaptionTV)ctv;
		//ctv�� �ּҸ� ct�� �־��ش�.
		//���⼭ Ŭ����Ÿ���� �ٸ��� ������ ����ȯ�� �Ѵ�.
		ct.text="ȫ�浿";
		ct.captionTVMethod();
		System.out.println(ct.text);
		
		
		//���⼭ ������ �ȵǴ� ������
		//tv3���� TV�� �ν��Ͻ��� �ּҰ� ���� ������
		//���޸𸮿��� CaptionTV�� ����.
		//�׷��� ct2�� tv3�� �ּҸ� �Ѱ�µ� �ּҸ� ���� ���� ���޸𸮿��� CaptionTV�� ���� ������ ct2�� ����� ����� �� ����.
		TV tv3 = new TV();		
//		CaptionTV ct2 = (CaptionTV)tv3;
		System.out.println(tv3 instanceof TV);
		System.out.println(atv instanceof CaptionTV);
		System.out.println(atv instanceof AITV);
		System.out.println(atv instanceof TV);
		System.out.println(ctv instanceof TV);
		
//		if(ct2 instanceof CaptionTV) {
//			ct2.text = "�̼���";
//			ct2.captionTVMethod();
//			System.out.println(ct2.text);			
//		}
		
		
		
		
		
	}
}
