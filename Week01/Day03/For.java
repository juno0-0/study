package P1;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//12�� ����
		int cnt=0;
		int result;
		int com = (int)(Math.random()*100)+1;
		System.out.println("0~100 ���� �Է� : ");
		while(true) {
			result = sc.nextInt();
			if(result>com) {
				System.out.println("down");
				cnt++;
			}else if(result<com) {
				System.out.println("up");
				cnt++;
			}else {
				cnt++;
				System.out.println("����");
				System.out.println(cnt);
				break;
			}
		}
		
		
		
		
		
		
		/*
		//2�� Ǯ��
		System.out.print("n:");
		int n = sc.nextInt();
		int i,j;//i�� ���� ÷�� ����, j�� ���� ÷�� ����
		for(i=0; i<n; i++) {
			for(j=n; j>=-n; j--) {//7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
				if(Math.abs(j)>i) System.out.print(' ');
				else System.out.printf("%d",Math.abs(j));
			}
			System.out.println();
		}
		*/
		
		
		
		/*
		//5������
		//���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//������ 1,000,000�� ���, ��ġ �Ⱓ�� 1�⿡�� 10����� �ų� ���� ���� �� �ݾ��� ���
		//�� ���� �ܸ����� = ���� * ����(4.5%) * ��(��ġ�Ⱓ)
		//���� �� �� ���ɾ�(�⸮ ����) = ����(1+ ����(4.5%) * ��(��ġ�Ⱓ)
		int money = 1000000;
		double full = 0;
		for(int i=1;i<=10;i++) {
			if(i==10) {
				full = (money*0.045)*i+money;
				break;
			}
			double dNum = (money*0.045)*i;
			System.out.println(i+"�� �ܸ����� : "+(int)dNum );
			System.out.println(i+"�� �� �ݾ� : "+(int)(dNum+money));
		}
		System.out.println("����� �� ���ɾ� :"+(int)full);
		
		
		
		
		
		
		
		
		//11�� ����
		//���� = �������� ���� ��
		//					   Ŭ������.�޼����()
		//�⺻�� 0.0 <= Math.random() < 1.0
		//1~3���� �����ϰ� ������ ���� ����� ����
		//1�ܰ� ���ϴ� ���� ���� ū���� ���� 
		//0.0*3 <= Math.random()*3 < 1.0*3
		//0.0 <= Math.random()*3 < 3.0
		//2�ܰ� ���������� ����ȯ�Ѵ�.
		//(int)0.0 <= (int)Math.random()*3 < (int)3.0
		//0 <= (int)Math.random()*3 < 3
		//3�ܰ� ������ 1�� ���Ѵ�. (���ϸ� 1~3�� �ƴ϶� 0~2�� ���´�.)
		//0+1 <= (int)Math.random()*3+1 < 3+1
		//1 <= (int)Math.random()*3+1 < 4
		double double_random = Math.random();
		int win=0;
		int lose=0;
		int draw=0;
		for(int i=0;i<10;i++) {
			System.out.print("����(1), ����(2) ��(3)�� �ϳ��� �Է��ϼ��� : ");
			int n = sc.nextInt();
			int com = (int)(Math.random()*3)+1;
			switch(n) {
			case 1:
				if(com>n) {
					System.out.println(n);
					System.out.println(com);
					System.out.println("��");
					lose++;
				}else if(com<n){
					System.out.println(n);
					System.out.println(com);
					System.out.println("�̱�");
					win++;
				}else {
					System.out.println(n);
					System.out.println(com);
					System.out.println("���");
					draw++;
				}break;
			case 2:
				if(com>n) {
					System.out.println(n);
					System.out.println(com);
					System.out.println("��");
					lose++;
				}else if(com<n){
					System.out.println(n);
					System.out.println(com);
					System.out.println("�̱�");
					win++;
				}else {
					System.out.println(n);
					System.out.println(com);
					System.out.println("���");
					draw++;
				}break;
			case 3:
				if(com>n) {
					System.out.println(n);
					System.out.println(com);
					System.out.println("��");
					lose++;
				}else if(com<n){
					System.out.println(n);
					System.out.println(com);
					System.out.println("�̱�");
					win++;
				}else {
					System.out.println(n);
					System.out.println(com);
					System.out.println("���");
					draw++;
				}break;
			}
			
		}
		System.out.println("�� : "+win);
		System.out.println("�� : "+lose);
		System.out.println("�� : "+draw);
		
		//1������ 100������ ����
		//0.0*100<=Math.random()*100<1.0*100
		//0<=(int)(Math.random()*100)<100
		//1<=(int)(Math.random()*100)+1<101
		
		
		
		
		
		//1�� ����
		// 1���� 100������ ���� �߿��� 2, 3, 5, 7�� ����� ������ ���� ���࿡ 10���� ����ϼ���.
		int cnt = 0;
		for(int i=1;i<101;i++) {
			if(i%2==0||i%3==0||i%5==0||i%7==0)continue;
			System.out.printf("%2d ",i);
			cnt++;
			if(cnt%10==0) {
				System.out.println();
			}
		}
		
		//2�� ����
		//������ ����ϴ� ���α׷��� ��ø�� for���� �̿��Ͽ� �ۼ��Ͻÿ�
		//��Ʈ ) Math.abs( ) : ���밪�� ���ϴ� �żҵ� ��) -7�̸�
		System.out.print("n:");
		int n = sc.nextInt();
		for(int i=1;i<n+1;i++) {	//��
			for(int j=n-1;j+1>i;j--) {	//����
				System.out.print(" ");
			}
			for(int j=-i+1;j<i;j++) {	//����
				System.out.print(Math.abs(j));
			}
			System.out.println();
		}
	
		//3�� ����
		//ǥ�� �Է����� �Է��� �������� ������ �ڸ��� �ش��ϴ� ���� �ݴ�� ����ϴ� ���α׷��� do~while���� �̿��Ͽ� �ۼ��Ͻÿ�
		//1234 ������ 4321������ �迭 �Ⱦ���
		boolean flag = true;
		System.out.print("1 : ");
		int b1 = sc.nextInt();
		System.out.print("2 : ");
		int b2 = sc.nextInt();
		System.out.print("3 : ");
		int b3 = sc.nextInt();
		
		do {
			System.out.println(b3);
			System.out.println(b2);
			System.out.println(b1);
			flag = false;
		}while(flag);
		
		//4�� ����
		//���� ���İ� ������ ����� �ش��ϴ� x�� y���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//y = 4*x^3 + 5*x^2 + x + 2, x�� 5���� 10���� 0.5�� �����ϵ���
		//�������� ���ϴ� ���α׷�
		//������ �˰��򿡼� �������� �����Ͽ� �н��ϴ� ������ �����
		//�����͸� ���� �ΰ����� ���α׷��� �н��� ��Ŵ
		double y;
		for(double x=5; x<=10;x+=0.5) {
			y = 4*x*x*x + 5*x*x +x+2;
			System.out.println("x="+x +"  "+ "y="+y);
		}
		
		//7�� ����
		//1���� n���� �� �߿��� 5000�� ���� �ʴ� ���� ū �հ� �׶��� n�� ���ϴ� ���α׷� �ۼ��Ͻÿ�
		int total=0;
		int end=0;
		System.out.print("n�� �Է� : ");
		int n = sc.nextInt();
		for(int i=1;i<n;i++) {
			total += i;
			end = i;
			if(total>=4950) {
				break;
			}
			
		}
		System.out.println("n : "+end);
		System.out.println("���� ū �� : "+total);
		
		//8�� ����
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("%3d x %3d = %3d",j,i,i*j);
			}
			System.out.println();
		}
		
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i+"x"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
		
		
		//9�� ����
				//[1, 1] [1, 2] [1, 3] [1, 4] [1, 5]
				//[2, 1] [2, 2] ...................... [2, 5]
				for(int i=1;i<6;i++) {
					for(int j=1;j<6;j++) {
						System.out.print("["+i+","+j+"]");
					}
					System.out.println();
				}
		
		//10�� ����
			[1,1]
			[2,2]
			[3,3]
			[4,4]
			[5,5]
		for(int i=1;i<6;i++) {
			System.out.println("["+i+","+i+"]");
		}
		
		//14�� ����
		System.out.print("���ڸ� �Է��ϼ���.(��:12345) : ");
		String str = sc.next();
		//"12345" ---> 12345
		int num = Integer.parseInt(str);
		int sum=0;
		while(num>0) {
			sum += num%10;
			System.out.println("sum= "+sum+"  num= "+num);
			num/=10;
		}
		
		
		
//		for(�ʱ갪;���ǽ�;������){
//			������ ���� �� ó���� ����
//		}
		/*
		int i=1,j=100;
		for(;;) {
			if(!(i<101&&j>10))break;//���ǽ��� ���ε� !�� ������ ����, �����ε� !�� ������ ��
			System.out.printf("i= %3d,\n j=%3d",i,j);
			
			i++;
			j+=10;
		}
		*/

	}

}
