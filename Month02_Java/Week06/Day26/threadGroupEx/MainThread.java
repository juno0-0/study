package threadGroupEx;

import java.util.Map;
import java.util.Set;

import daemonEx.Player;

public class MainThread {
	public static void main(String[] args) {
		ThreadGroup movieGrp = new ThreadGroup("MOVIE");//스레드 그룹 이름 만들기
		Player p = new Player();
		Video v = new Video(p);
		Music m = new Music(p);
		Thread th1 = new Thread(movieGrp,v);
		Thread th2 = new Thread(movieGrp,m);
		v.setPriority(Thread.MAX_PRIORITY);
		m.setDaemon(true);
		th1.start();
		th2.start();
		
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();//프로세스의 모든 스레드 상황을 구해주는 메소드
		Set<Thread> threads = map.keySet();//map계열에서 key값들을 리턴해 주는 메소드
		
		for(Thread t : threads) {
			System.out.println("Name : "+t.getName() + (t.isDaemon()?"데몬":"주"));
			System.out.println("\t소속 그룹 : "+t.getThreadGroup().getName());
		}
	}
	
}
