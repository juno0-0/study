package character;

public class CharTest {
	public static void main(String[] args) {
		//do-while
		//1. 100~1���� ����ϱ� 1�ٿ� 20�� ����ϱ�
		//2. 5�� ����� ������� �ʱ� 
		//		5�� ����� ���ϴ� ��� : ���Ϸ��� �� % 5 == 0
		int i = 101;
		do {
			if(i%20==0) {
				System.out.println();
			}
			i--;//100
			if(i%5==0)continue; 
			System.out.printf("%5d",i);
		}while(i>0);
		
		
		
		
		
		/*
		//while
		int i=0,cnt=0;
		boolean flag = true;//������ ������� ������ ���߿� ����ؾ��� �� boolean���� ������ �־ ����Ѵ�.
		while(flag) {//true�� ������ ���� �ݺ�
			i++;
			if(i%2!=0) {
				System.out.printf("%5d",i);				
				cnt++;
			}
			if(cnt == 10) {
				System.out.println();
				cnt=0;
			}
			if(i==100)flag=false;
		}
		
		char char_value = 'B';//�������� : Ȱ�� ������ �ش��ϴ� �޼ҵ� �ӿ����� 
		//printBMethod() ȣ���ϱ�
		printBMethod(char_value);//�޼ҵ� ����(����)
		printBMethod(char_value);
		*/
		
	}
	/*
	//�޼ҵ� �����(�����ϱ�)		pchar_value = char_value
	static void printBMethod(char pchar_value){
		System.out.println(pchar_value);
	}
	*/
}
