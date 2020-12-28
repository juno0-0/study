package threadGroupEx;

import daemonEx.Player;

public class Video extends Thread{
	Player p;
	
	public Video(Player p) {
		this.p = p;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			p.video();
		}
	}
}
