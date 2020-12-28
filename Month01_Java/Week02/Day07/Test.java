package p1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//오목 게임 만들기
		String[][] game = new String[15][15];
		//오목판에 0넣기
		for(int i=0;i<game.length;i++) {
			for(int j=0;j<game.length;j++) {
				game[i][j]="0";
			}
		}
		
		
		int cnt=1;
		while(true) {
			System.out.print("행 입력 : ");
			int y = sc.nextInt();
			System.out.print("열 입력 : ");
			int x = sc.nextInt();
			for(int i=0;i<game.length;i++) {
				for(int j=0;j<game.length;j++) {
					if(cnt%2==0) {
						game[y][x] = "■";
					}else {
						game[y][x] = "□";
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
		
		
		
		
		
		
		
		
		//글자 맞추기 게임 만들기
		//보고 싶은 글자 위치 ==> 입력
		//입력받은 칸의 글자를 보여준다.
		//맞출 수 있나요(Y/N)
		//Y이면 어떤 단어인가요 : 입력
		//틀렸습니다.
		//반복
	}
}
