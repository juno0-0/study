package p1;

import java.util.Scanner;

public class Sungjuk {
	//�ʵ� ����
	int number = 0;	//��ȣ
	int kor = 0;	//��������
	int eng = 0;	//��������
	int total = 0;	//�հ�
	int avg = 0;	//���
	int rank = 0;	//����
	int[][] sungjukArray = new int[7][6];
	
	//�⺻ ������
	public Sungjuk() {}
	
	//����� ������
	public Sungjuk(int a, int b) {
		
	}
	
	//�޼���
	void input() { 		
		//�Է¹޴� �޼���
		Scanner sc = new Scanner(System.in);
		//�ʵ忡 1���� �Է��� �޾Ƽ� 2���� �迭�� �ֱ�
		System.out.println("�ڸ��� IT �ڹٹ� ���� �Է� ȭ���Դϴ�.");
		//��ȣ �Է� �޴� ��
		System.out.println("��ȣ�� ���� �Է� �ϼ���.");
		for(int i=0;i<sungjukArray.length-2;i++) {
			number = sc.nextInt();		//number�� �ȴ�� �ٷ� �迭�� ��Ƶ� �ȴ�.
			sungjukArray[i][0] = number;
		}
		
		//���� �Է� �޴� ��
		for(int i=0; i<sungjukArray.length-2;i++) {
			System.out.println((sungjukArray[i][0])+"�� �����Է� ==>");
				System.out.print("���������� ");
				kor = sc.nextInt();
				sungjukArray[i][1] = kor; 
				System.out.print("���������� ");
				eng = sc.nextInt();
				sungjukArray[i][2] = eng; 
		}
		
		//test();//�迭�ȿ� ���� ��Ȳ�� �����ִ� �޼���
	}//end input
	
	int sum() {
		//�հ� ���ϴ� �޼���
		for(int i=0;i<sungjukArray.length-2;i++) {
			total = sungjukArray[i][1]+sungjukArray[i][2];
			sungjukArray[i][3] = total;
		}
		
		return 0;
	}//end sum
	
	int avgMethod() {
		//��� ���ϴ� �޼���
		for(int i=0;i<sungjukArray.length-2;i++) {
			avg = sungjukArray[i][3]/2;
			sungjukArray[i][4]=avg;
		}
		
		return 0;
	}//end avgMethod
	
	int rank() {
		//���� ���ϴ� �޼���
		for(int i=0;i<sungjukArray.length-2;i++) {
			sungjukArray[i][5]=1;
			for(int j=0;j<sungjukArray.length-2;j++) {
				if(sungjukArray[i][4]<sungjukArray[j][4]) {
					sungjukArray[i][5]++;
				}
			}
		}
		
		return 0;
	}//end rank
	
	void output() {
		//����ϴ� �޼���
		for(int i=0;i<sungjukArray.length;i++) {
			if(i==5)System.out.print("       �Ѱ�");
			else if(i==6)System.out.print("       ���");
			for(int j=0;j<sungjukArray[i].length;j++) {
				if(sungjukArray[i][j]==0)continue;
				System.out.printf("%5d" , sungjukArray[i][j]);
			}
			System.out.println();
		}	
	}//end output
	
	int subjectAvg() {
		//��ü ��� ���ϴ� �޼���
		for(int i=0;i<sungjukArray.length-2;i++) {
				sungjukArray[6][i]=sungjukArray[5][i]/5;
		}
		return 0;
	}//end subjectAvg
	
	int subjectSum() {
		//��ü �հ� ���ϴ� �޼���
		for(int i=0;i<sungjukArray.length-2;i++) {
			for(int j=1;j<sungjukArray.length-2;j++) {
				sungjukArray[5][j]+=sungjukArray[i][j];
				
			}
		}
		
		return 0;
	}//end subjectSum
	
	
	
}//end c
