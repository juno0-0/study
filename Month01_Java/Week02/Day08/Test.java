package p1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] student = new int[7][5];
		//�� = 1,2,3,4,5 ��ü�հ� ��ü���
		//�� = �� �� �� �� ��
		
		//�������� �������� �հ� ���
		for(int i=0;i<student[i].length-3;i++) {
			for(int j=0;j<student.length-2;j++) {
				if(i==0)System.out.print("���� : ");
				else System.out.print("���� : ");
				student[j][i]=sc.nextInt();
				student[j][2]+=student[j][i];
				student[j][3]=student[j][2]/2;
			}
		}
		//����
		for(int i=0;i<student[i].length;i++) {
			student[i][4]=1;
			for(int j=0;j<student[i].length;j++) {
				if(student[i][2]<student[j][2]) {
					student[i][4]++;
				}
			}
		}
		
		//��ü
		for(int i=0;i<student[i].length;i++) {
			for(int j=0;j<student[i].length-1;j++) {
				student[5][j]+=student[i][j];
				student[6][j]=student[5][j]/5;
			}
		}
		System.out.println("             ����    ����    �հ�    ���    ����");
		for(int i=0;i<student.length;i++) {
			if(i<5) System.out.print((i+1)+"�� : ");
			else if(i==5)System.out.print("�հ� : ");
			else System.out.print("��� : ");
			for(int j=0;j<student[i].length;j++) {
				if(student[i][j]==0)continue;
				System.out.printf("%4d ",student[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}//main
}//class
