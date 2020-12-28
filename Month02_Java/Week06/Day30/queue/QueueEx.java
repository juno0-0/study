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
//선입선출, 선착순 구조의 프로그램 작성에 사용
public class QueueEx {
	public static void main(String[] args) {
		Queue<Message> mq = new LinkedList<>();
		
		Collection<Message> temp = Collections.synchronizedCollection(mq);
		Set<Message> mset= new HashSet<Message>();//동기화가 안된 자료
		Set<Message> synset = Collections.synchronizedSet(mset);//동기화된 자료
		Map<String, Integer> ccmap = new ConcurrentHashMap<String, Integer>();
		ccmap.put("a", 1);//병렬처리됨
		Queue<Message> ccLQ = new ConcurrentLinkedQueue<Message>();
		mq.offer(new Message("sendMail","홍길동"));
		mq.offer(new Message("sendSMS","신용권"));
		mq.offer(new Message("sendKakaotalk","홍두께"));
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