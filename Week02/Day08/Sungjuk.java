package p1;

import java.util.Scanner;

public class Sungjuk {
	//필드 나열
	int number = 0;	//번호
	int kor = 0;	//국어점수
	int eng = 0;	//영어점수
	int total = 0;	//합계
	int avg = 0;	//평균
	int rank = 0;	//석차
	int[][] sungjukArray = new int[7][6];
	
	//기본 생성자
	public Sungjuk() {}
	
	//명시적 생성자
	public Sungjuk(int a, int b) {
		
	}
	
	//메서드
	void input() { 		
		//입력받는 메서드
		Scanner sc = new Scanner(System.in);
		//필드에 1개씩 입력을 받아서 2차원 배열에 넣기
		System.out.println("코리아 IT 자바반 성적 입력 화면입니다.");
		//번호 입력 받는 곳
		System.out.println("번호만 먼저 입력 하세요.");
		for(int i=0;i<sungjukArray.length-2;i++) {
			number = sc.nextInt();		//number에 안담고 바로 배열에 담아도 된다.
			sungjukArray[i][0] = number;
		}
		
		//점수 입력 받는 곳
		for(int i=0; i<sungjukArray.length-2;i++) {
			System.out.println((sungjukArray[i][0])+"번 점수입력 ==>");
				System.out.print("국어점수는 ");
				kor = sc.nextInt();
				sungjukArray[i][1] = kor; 
				System.out.print("영어점수는 ");
				eng = sc.nextInt();
				sungjukArray[i][2] = eng; 
		}
		
		//test();//배열안에 현재 상황을 보여주는 메서드
	}//end input
	
	int sum() {
		//합계 구하는 메서드
		for(int i=0;i<sungjukArray.length-2;i++) {
			total = sungjukArray[i][1]+sungjukArray[i][2];
			sungjukArray[i][3] = total;
		}
		
		return 0;
	}//end sum
	
	int avgMethod() {
		//평균 구하는 메서드
		for(int i=0;i<sungjukArray.length-2;i++) {
			avg = sungjukArray[i][3]/2;
			sungjukArray[i][4]=avg;
		}
		
		return 0;
	}//end avgMethod
	
	int rank() {
		//석차 구하는 메서드
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
		//출력하는 메서드
		for(int i=0;i<sungjukArray.length;i++) {
			if(i==5)System.out.print("       총계");
			else if(i==6)System.out.print("       평균");
			for(int j=0;j<sungjukArray[i].length;j++) {
				if(sungjukArray[i][j]==0)continue;
				System.out.printf("%5d" , sungjukArray[i][j]);
			}
			System.out.println();
		}	
	}//end output
	
	int subjectAvg() {
		//전체 평균 구하는 메서드
		for(int i=0;i<sungjukArray.length-2;i++) {
				sungjukArray[6][i]=sungjukArray[5][i]/5;
		}
		return 0;
	}//end subjectAvg
	
	int subjectSum() {
		//전체 합계 구하는 메서드
		for(int i=0;i<sungjukArray.length-2;i++) {
			for(int j=1;j<sungjukArray.length-2;j++) {
				sungjukArray[5][j]+=sungjukArray[i][j];
				
			}
		}
		
		return 0;
	}//end subjectSum
	
	
	
}//end c
