package P3;

import java.util.Scanner;

public class OperatorEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		//1�� ���� 
		//2+3-4  = 1 2 + 3 * 4 =14 2 * 3 / 4 = 1.5 4 / 3 ���� 1  4/3�� ��������

		System.out.println(2+3-4);
		System.out.println(2+3*4);
		System.out.println(2*3/4.0);
		System.out.println(4/3);//��
		System.out.println(4%3);//������
		
		//2�� ����
		//�ǽ� 2���� �Է¹޾� ��������ϼ���(+, - , * , /, %)
		
		System.out.print("1�� : ");
		int num1 = sc.nextInt();
		System.out.print("2�� : ");
		int num2 = sc.nextInt();
		System.out.print("+,-,*,/,% : ");
		String choice = sc.next();
		
		switch(choice) {
			case "+":
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case "-":
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case "*":
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case "/":
				System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
				break;
			case "%":
				System.out.println(num1+"%"+num2+"="+(num1%num2));
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
		}
		
		
		//3�� ����
		//������ȯ ���α׷�
		//�Էµ� �׼���ŭ 500��, 100�� 50�� 10��¥�� �������� ��ȯ�� �ִ� ���α׷��� �ۼ�
		//���� ) ������ �Ѱ����� �ּ�ȭ�Ѵ�, ����� ������ �켱������ ��ȯ�� �ش�
		int coin500=0, coin100=0, coin50=0, coin10=0, coin=0;
		
		System.out.print("�ݾ� �Է� : ");
		int money = sc.nextInt();
		
		coin500 = money/500;
		money -= coin500*500;
		coin100 = money/100;
		money -= coin100*100;
		coin50 = money/50;
		money -= coin50*50;
		coin10 = money/10;
		money -= coin10*10;
		coin = money;
		
		System.out.println("500��¥�� ==>"+coin500);
		System.out.println("100��¥�� ==>"+coin100);
		System.out.println("50��¥�� ==>"+coin50);
		System.out.println("10��¥�� ==>"+coin10);
		System.out.println("�ٲ��� ���� �ܵ� ==>"+coin);
		
		
		//4�� ����
		//���������α׷�
		//����) ������ 4�� ������ �������� 100���� ������ �������� ������ �����̴�. 
		//40���� ������ �������� �ص� ���⿡ ���Եȴ�.
		System.out.print("�⵵ �Է� : ");
		int year = sc.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}
		
		
		//5�� ����
		//ǥ�� �Է����� �� �Ǽ��� �Է� �޾� ��, ����� ���Ͽ� ����ϴ� ���α׷� �հ� ��� ��� �Ǽ��� ���
		System.out.print("�Ǽ� 1 : ");
		double d_num1 = sc.nextDouble();
		System.out.print("�Ǽ� 2 : ");
		double d_num2 = sc.nextDouble();
		double sum = d_num1+d_num2;
		double avg = sum/2;
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);
		
		
		//6�� ����
		//ǥ�� �Է����� �� �Ǽ��� ��� ������ ��ȯ�Ͽ� �հ� ��� ��� �Ǽ�
		System.out.println("�Ǽ� 1 : ");
		double d_num3 = sc.nextDouble();
		System.out.println("�Ǽ� 2 : ");
		double d_num4 = sc.nextDouble();
		int a = (int)d_num3;
		int b = (int)d_num4;
		System.out.println("�հ� : "+(double)(a+b));
		System.out.println("��� : "+(a+b)/2.0);
		
		
		//7�� ����
		//������ ������ ų�α׷�(kg)�� �Ҽ��� �Է� �޾� �Ŀ��� ����Ͽ� �Ҽ��� 3�ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		//1�Ŀ��� 0.453592ų�α׷�
		System.out.print("���Ը� �Է� : ");
		double w = sc.nextDouble();
		double p = w*0.453592;
		System.out.printf("�Ŀ�� : %.3lf",p);
		
		
		//8�� ����
		//���� �ϳ��� �µ��� �Ǽ����� �Է� �޾� ���ڰ� F�� f�̸� �Է¹��� ���� ȭ���� �����Ͽ� ������ �ٲٰ� 
		//�Է� ���� ���ڰ� C�� c�̸� �Է¹��� ���� ������ �����Ͽ� ȭ���� �ٲ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.print("���� : ");
		String s = sc.next();
		System.out.print("�µ� : ");
		double d_num5 = sc.nextDouble();
		switch(s){
			case "F":
			case "f":
				System.out.println((d_num5-32)/1.8);
				break;
			case "C":
			case "c":
				System.out.println(d_num5*1.8+32);
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
		}
		
		
		//9�� ����
		//õ�� ������ ���� �ϳ��� �Է� �޾� �츮�� ����ϴ� ������ ��, õ, ��, ��, �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		//�� �Է��� 2347653�̸� "234�� 7õ 6�� 5�� 3�Դϴ�."�� ����ϼ���
		int a1,a2,a3,a4,a5;
		System.out.println("7�ڸ� �̳� ���� : ");
		int n = sc.nextInt();
		a1=n/10000;
		n-=a1*10000;
		a2=n/1000;
		n-=a2*1000;
		a3=n/100;
		n-=a3*100;
		a4=n/10;
		n-=a4*10;
		a5=n;
		System.out.println(a1+"��"+a2+"õ"+a3+"��"+a4+"��"+a5+"�Դϴ�.");
		
		
		//10�� ����
		//���ǿ����ڸ� �̿��Ͽ� ������ ���� �Է¹޾� �̴��� ��ݱ��̸� "��ݱ��Դϴ�"�� 
		//�Ϲݱ��̸� "�Ϲݱ� �Դϴ�"�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.print("�� : ");
		int month = sc.nextInt();
		System.out.println(month>6?"�Ϲݱ�":"��ݱ�");
		
		
		//11�� ����
		//������ �Է¹޾� ���� ū ���� ���ϴ� ���α׷��� ���� �����ڸ� �̿��Ͽ� �ۼ��Ͻÿ�.
		System.out.print("1�� : ");
		int num_1 = sc.nextInt();
		System.out.print("2�� : ");
		int num_2 = sc.nextInt();
		System.out.print("3�� : ");
		int num_3 = sc.nextInt();
		
		if(num_1>num_2&&num_1>num_3) {
			System.out.println("���� ū �� : "+num_1);
		}else if(num_2>num_1&&num_2>num_3){
			System.out.println("���� ū �� : "+num_2);
		}else {
			System.out.println("���� ū �� : "+num_3);
		}
		
		
		//12�� ����
		//ǥ�� �Է����� Ű�� �����Ը� �Ǽ��� �Է� �޾� ���� ������ �̿��Ͽ� ��������, ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		System.out.print("Ű : ");
		int cm = sc.nextInt();
		System.out.print("������ : ");
		int kg = sc.nextInt();
		if(kg<=(cm-100)*0.9) {
			System.out.println("����");
		}else {
			System.out.println("��");
		}
		
		
		//13�� ����
		//�ʸ� �Է¹޾� �� �� �ʷ� ����Ͽ� ����ϴ� ���α׷�
		System.out.print("�� : ");
		int second = sc.nextInt();
		int hour = second/3600;
		second -= hour*3600;
		int minute = second/60;
		second -= minute*60;
		System.out.println(hour+"��"+minute+"��"+second+"��");
		
		
		//14�� ����
		//534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �� �� �л��� ��� ���� �� �ְ� ���������� ��� ������ ���ϴ� ���α׷�
		System.out.print("���� �� : ");
		int p = sc.nextInt();
		int stu = p/30;
		int rem = p%30;
		System.out.println("�� ���� �� : "+p);
		System.out.println("1�δ� : "+stu+"��\n"+"������ : "+rem+"��");
		
		
		//15�� ����
		//���� �ڸ� ���ϸ� ������ �ڵ� ���� ��� 356�̸� 300�� ���� �� �ֵ��� �ϴ� ���α׷�
		System.out.print("�� �Է� : ");
		int v = sc.nextInt();
		System.out.println((v/100)*100);
		 */
		
		
	}

}
