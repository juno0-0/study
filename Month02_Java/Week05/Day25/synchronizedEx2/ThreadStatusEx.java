package synchronizedEx2;

public class ThreadStatusEx {
	public static void main(String[] args) {
		StatePrintThread spt = new StatePrintThread(new TargetThread());//NEW����
		spt.start();//RUNNABLE����
	}
}
