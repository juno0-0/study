package threadEx;

public class PriorityEx {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread t = new CalcThread("thread"+i);
			if(i!=10) {
				t.setPriority(Thread.MIN_PRIORITY);//1~9까지 우선순위를 1로 주기
			}else {
				t.setPriority(Thread.MAX_PRIORITY);//10은 우선순위를 마지막으로 주기
			}
			t.start();//Runnable 상태로 넣기 --> 스케쥴링(운영체제) --> Running 
		}
		
	}
}
