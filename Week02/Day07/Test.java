package p1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� ���� �����
		String[][] game = new String[15][15];
		//�����ǿ� 0�ֱ�
		for(int i=0;i<game.length;i++) {
			for(int j=0;j<game.length;j++) {
				game[i][j]="0";
			}
		}
		
		
		int cnt=1;
		while(true) {
			System.out.print("�� �Է� : ");
			int y = sc.nextInt();
			System.out.print("�� �Է� : ");
			int x = sc.nextInt();
			for(int i=0;i<game.length;i++) {
				for(int j=0;j<game.length;j++) {
					if(cnt%2==0) {
						game[y][x] = "��";
					}else {
						game[y][x] = "��";
					}
						cnt++;
				}
			}
			
			for(String[] i : game) {
				for(String j : i) {
					System.out.printf("%2s",j);				
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		//���� ���߱� ���� �����
		//���� ���� ���� ��ġ ==> �Է�
		//�Է¹��� ĭ�� ���ڸ� �����ش�.
		//���� �� �ֳ���(Y/N)
		//Y�̸� � �ܾ��ΰ��� : �Է�
		//Ʋ�Ƚ��ϴ�.
		//�ݺ�
	}
}
