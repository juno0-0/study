package threadGroupEx;

import java.util.Map;
import java.util.Set;

import daemonEx.Player;

public class MainThread {
	public static void main(String[] args) {
		ThreadGroup movieGrp = new ThreadGroup("MOVIE");//������ �׷� �̸� �����
		Player p = new Player();
		Video v = new Video(p);
		Music m = new Music(p);
		Thread th1 = new Thread(movieGrp,v);
		Thread th2 = new Thread(movieGrp,m);
		v.setPriority(Thread.MAX_PRIORITY);
		m.setDaemon(true);
		th1.start();
		th2.start();
		
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();//���μ����� ��� ������ ��Ȳ�� �����ִ� �޼ҵ�
		Set<Thread> threads = map.keySet();//map�迭���� key������ ������ �ִ� �޼ҵ�
		
		for(Thread t : threads) {
			System.out.println("Name : "+t.getName() + (t.isDaemon()?"����":"��"));
			System.out.println("\t�Ҽ� �׷� : "+t.getThreadGroup().getName());
		}
	}
	
}
