package p2;

import java.util.Scanner;

public class ArrayEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		//1번
		//배열의 모든 요소를 더해서 총점과 평균을 구하기
		//10개의 정수를 입력 받아서 배열에 넣고 총점과 평균을 구하여 출력하세요
		int[] iNum = new int[10];
		int sum=0;
		double avg = 0.0;
		System.out.println("정수 10개 : ");
		for(int i=0;i<iNum.length;i++) {
			iNum[i] = sc.nextInt();
		}
		
		for(int i=0;i<iNum.length;i++) {
			sum += iNum[i];
		}
		avg = sum/iNum.length;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
		
		//2번
		//int max = -999;
		//int min = 999;
		//10개 입력받고 처음에 들어온게 max보다 크면 max에 첫번째 수를 넣기
		//계속 진행하면 max에는 제일 큰 값이 들어있음
		double[] dNum = new double[10];
		double max = -999;
		double min = 999;
		System.out.println("실수 10개 : ");
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
		System.out.println("최고값 : "+max);
		System.out.println("최소값 : "+min);
		
		
		//3번
		//2차원배열
		//국어,영어점수를 입력받고 합계, 평균을 구한 뒤 배열에 넣어주고
		//합계 : 1행과 2행을 더해서 3행에 넣어라
		//평균 : 3행 나누기 2해서 4행에 넣기 (정수로 하기)
		//등수 : Rank배열 만들고 나보다 크면 rank++;
		int[][] score = new int[6][5];
		
		//번호
		for(int i=0;i<score[0].length;i++) {
			score[0][i]=i+1;
		}
		
		//점수 입력
		for(int i=1;i<3;i++) {
			if(i==1) {
				System.out.println("국어점수 : ");
			}else {
				System.out.println("영어점수 : ");
			}
			for(int j=0;j<score[0].length;j++) {
				score[i][j]= sc.nextInt();
			}
		}
		
		//합계 
		for(int i=0;i<score[0].length;i++) {
			score[3][i]=score[1][i]+score[2][i];
		}
		
		//평균
		for(int i=0;i<score[0].length;i++) {
			score[4][i]=score[3][i]/2;
		}
		
		//석차
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
				System.out.println("번호 : ");
			}else if(i==1) {
				System.out.println("국어점수 : ");
			}else if(i==2) {
				System.out.println("영어점수 : ");
			}else if(i==3) {
				System.out.println("합계 : ");
			}else if(i==4) {
				System.out.println("평균 : ");
			}else {
				System.out.println("석차 : ");
			}
			for(int j=0;j<score[0].length;j++) {
				System.out.println(score[i][j]);
			}
			System.out.println();
		}
	
	
		//4번
		//빈도수 구하기
		//문자를 15자로 입력하세요==> javajspspringaa
		//15자 입력 -> a 몇개 b 몇개 나오게 하기
		char[] c = new char[26];
		int[] count = new int[26];
	
		for(int i=0;i<c.length;i++) {
			c[i]=(char)(97+i);
		}
		
		System.out.print("15자 입력 : ");
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
		
		//5번
		//배열을 하나 줌
		//랜덤하게 숫자가 나와야함
		//if(배열[i]==나온숫자 비교)continue; 배열=(int)(Math.random()*45)+1 -> 6번 
		int[] choice = new int[6];
		int[] lotto = new int[7];
		
		System.out.print("로또 입력(1~46) : ");
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
		System.out.print("내가 찍은 번호 : ");
		for(int i=0;i<choice.length;i++) {
			System.out.print(choice[i]+" ");
		}
		System.out.println();
		System.out.print("당첨 번호 : ");
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		System.out.println("당첨된 수 : "+k+"개");
		
		
	}
}
