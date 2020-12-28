package threadGroupEx;

import daemonEx.Player;

public class Music extends Thread{
	Player p;
	
	
	public Music(Player p) {
		this.p = p;
	}


	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			p.music();
		}
	}
}
