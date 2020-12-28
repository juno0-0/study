package threadGroupEx;

import java.util.Map;
import java.util.Set;

import daemonEx.AutoSaveThread;

public class ThreadInfoEx {
	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setName("AutoSaveThread");//������ �̸� �ֱ�
		ast.setDaemon(false);//���󽺷��� �����
		//�����带 ���۽�Ű�� RUNNABLE ���·� �����
		ast.start();
		
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();//���μ����� ��� ������ ��Ȳ�� �����ִ� �޼ҵ�
		Set<Thread> threads = map.keySet();//map�迭���� key������ ������ �ִ� �޼ҵ�
		
		for(Thread t : threads) {
			System.out.println("Name : "+t.getName() + (t.isDaemon()?"����":"��"));
			System.out.println("\t�Ҽ� �׷� : "+t.getThreadGroup().getName());
		}
	}
}
