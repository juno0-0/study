package p2;

import java.util.Scanner;

public class ArrayEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		//1��
		//�迭�� ��� ��Ҹ� ���ؼ� ������ ����� ���ϱ�
		//10���� ������ �Է� �޾Ƽ� �迭�� �ְ� ������ ����� ���Ͽ� ����ϼ���
		int[] iNum = new int[10];
		int sum=0;
		double avg = 0.0;
		System.out.println("���� 10�� : ");
		for(int i=0;i<iNum.length;i++) {
			iNum[i] = sc.nextInt();
		}
		
		for(int i=0;i<iNum.length;i++) {
			sum += iNum[i];
		}
		avg = sum/iNum.length;
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
		
		
		//2��
		//int max = -999;
		//int min = 999;
		//10�� �Է¹ް� ó���� ���°� max���� ũ�� max�� ù��° ���� �ֱ�
		//��� �����ϸ� max���� ���� ū ���� �������
		double[] dNum = new double[10];
		double max = -999;
		double min = 999;
		System.out.println("�Ǽ� 10�� : ");
		for(int i=0;i<dNum.length;i++) {
			dNum[i]=sc.nextDouble();
		}
		for(int i=0;i<dNum.length;i++) {
			if(max < dNum[i]) {
				max=dNum[i];
			}
		}
		for(int i=0;i<dNum.length;i++) {
			if(min > dNum[i]) {
				min=dNum[i];
			}
		}
		System.out.println("�ְ� : "+max);
		System.out.println("�ּҰ� : "+min);
		
		
		//3��
		//2�����迭
		//����,���������� �Է¹ް� �հ�, ����� ���� �� �迭�� �־��ְ�
		//�հ� : 1��� 2���� ���ؼ� 3�࿡ �־��
		//��� : 3�� ������ 2�ؼ� 4�࿡ �ֱ� (������ �ϱ�)
		//��� : Rank�迭 ����� ������ ũ�� rank++;
		int[][] score = new int[6][5];
		
		//��ȣ
		for(int i=0;i<score[0].length;i++) {
			score[0][i]=i+1;
		}
		
		//���� �Է�
		for(int i=1;i<3;i++) {
			if(i==1) {
				System.out.println("�������� : ");
			}else {
				System.out.println("�������� : ");
			}
			for(int j=0;j<score[0].length;j++) {
				score[i][j]= sc.nextInt();
			}
		}
		
		//�հ� 
		for(int i=0;i<score[0].length;i++) {
			score[3][i]=score[1][i]+score[2][i];
		}
		
		//���
		for(int i=0;i<score[0].length;i++) {
			score[4][i]=score[3][i]/2;
		}
		
		//����
		for(int i=0;i<score[0].length;i++) {
			int rank=1;
			for(int j=0;j<score[0].length;j++) {
				if(score[4][i]<score[4][j]) {
					rank++;
				}
				score[5][i]=rank;
			}
		}
		
		for(int i=0;i<score.length;i++) {
			if(i==0) {
				System.out.println("��ȣ : ");
			}else if(i==1) {
				System.out.println("�������� : ");
			}else if(i==2) {
				System.out.println("�������� : ");
			}else if(i==3) {
				System.out.println("�հ� : ");
			}else if(i==4) {
				System.out.println("��� : ");
			}else {
				System.out.println("���� : ");
			}
			for(int j=0;j<score[0].length;j++) {
				System.out.println(score[i][j]);
			}
			System.out.println();
		}
	
	
		//4��
		//�󵵼� ���ϱ�
		//���ڸ� 15�ڷ� �Է��ϼ���==> javajspspringaa
		//15�� �Է� -> a � b � ������ �ϱ�
		char[] c = new char[26];
		int[] count = new int[26];
	
		for(int i=0;i<c.length;i++) {
			c[i]=(char)(97+i);
		}
		
		System.out.print("15�� �Է� : ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<c.length;j++) {
				if((char)(str.charAt(i))==c[j]) {
					count[j]++;
				}
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]+" : "+count[i]);
		}
		*/
		
		//5��
		//�迭�� �ϳ� ��
		//�����ϰ� ���ڰ� ���;���
		//if(�迭[i]==���¼��� ��)continue; �迭=(int)(Math.random()*45)+1 -> 6�� 
		int[] choice = new int[6];
		int[] lotto = new int[7];
		
		System.out.print("�ζ� �Է�(1~46) : ");
		for(int i=0;i<choice.length;i++) {
			choice[i] = sc.nextInt();
		}
		
		for (int i = 0; i < lotto.length; i++) {
			if(lotto[i]!=(int)(Math.random()*45)+1) {
				lotto[i] = (int)(Math.random()*45)+1;				
			}
		}
		int k=0;
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<choice.length;j++) {
				if(choice[j]==lotto[i]) {
					k++;
				}
			}
		}
		System.out.print("���� ���� ��ȣ : ");
		for(int i=0;i<choice.length;i++) {
			System.out.print(choice[i]+" ");
		}
		System.out.println();
		System.out.print("��÷ ��ȣ : ");
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		System.out.println("��÷�� �� : "+k+"��");
		
		
	}
}
