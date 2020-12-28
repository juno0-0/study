package ex;

import java.util.*;

public class ThreadEx {
	public static void main(String[] args) {
		Music m = new Music();
		Video v = new Video();
		
		v.setPriority(Thread.MAX_PRIORITY);
		m.setDaemon(true);
		ThreadGroup tg = new ThreadGroup("Movie");
		Thread tm = new Thread(tg, m);
		Thread tv = new Thread(tg, v);
		
		tm.start();
		tv.start();
		
		
		Map map = Thread.getAllStackTraces();
		Set<Thread> s = map.keySet();
		for(Thread th : s) {
			System.out.println(th.getName() + ((th.isDaemon()?"����":"��")));
			System.out.println("�Ҽ� �׷�"+th.getThreadGroup().getName());
		}
		
	}
}
