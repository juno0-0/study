package P1;

public class While {
	public static void main(String[] args) {
		//do-while
		//1. 100~1���� ����ϱ� 1�ٿ� 20�� ����ϱ�
		//2. 5�� ����� ������� �ʱ� 
		//		5�� ����� ���ϴ� ��� : ���Ϸ��� �� % 5 == 0
		//3. 5�� ����� ������� �ʰ� 10�� ����� ����ϱ�
		int i = 101;
		int cnt = 0;
		boolean flag = true;
		do {
			i--;//100	
			if(i%5==0&&i%10!=0)continue; 
			System.out.printf("%5d",i);
			cnt++;
			if(cnt ==20) {
				System.out.println();
				cnt=0;
			}
//			if(i==1)flag = false;
		}while(false);//1���� ������ ����.
				
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
				*/
		

	}

}
