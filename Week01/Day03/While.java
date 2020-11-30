package P1;

public class While {
	public static void main(String[] args) {
		//do-while
		//1. 100~1까지 출력하기 1줄에 20씩 출력하기
		//2. 5의 배수는 출력하지 않기 
		//		5의 배수를 구하는 방법 : 구하려는 수 % 5 == 0
		//3. 5의 배수는 출력하지 않고 10의 배수는 출력하기
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
		}while(false);//1번은 무조건 실행.
				
				/*
				//while
				int i=0,cnt=0;
				boolean flag = true;//당장은 사용하지 않지만 나중에 사용해야할 때 boolean값을 변수에 넣어서 사용한다.
				while(flag) {//true를 넣으면 무한 반복
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
