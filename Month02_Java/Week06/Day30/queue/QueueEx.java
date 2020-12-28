package queue;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
//���Լ���, ������ ������ ���α׷� �ۼ��� ���
public class QueueEx {
	public static void main(String[] args) {
		Queue<Message> mq = new LinkedList<>();
		
		Collection<Message> temp = Collections.synchronizedCollection(mq);
		Set<Message> mset= new HashSet<Message>();//����ȭ�� �ȵ� �ڷ�
		Set<Message> synset = Collections.synchronizedSet(mset);//����ȭ�� �ڷ�
		Map<String, Integer> ccmap = new ConcurrentHashMap<String, Integer>();
		ccmap.put("a", 1);//����ó����
		Queue<Message> ccLQ = new ConcurrentLinkedQueue<Message>();
		mq.offer(new Message("sendMail","ȫ�浿"));
		mq.offer(new Message("sendSMS","�ſ��"));
		mq.offer(new Message("sendKakaotalk","ȫ�β�"));
		System.out.println(mq.isEmpty());
		while(!mq.isEmpty()) {
			Message m = mq.poll();
			System.out.println(m);
		}
		System.out.println(mq.isEmpty());
	}
}
class Message{
	String command;
	String to;
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	@Override
	public String toString() {
		return command+" "+to;
	}
	
}