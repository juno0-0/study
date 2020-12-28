package mathClassEx;

public class MathEx {
	public static void main(String[] args) {
		System.out.println(Math.min(10, 20));
		System.out.println(Math.max(30, 100));
		System.out.println(Math.random());
		int a = (int)(Math.random()*10)+1;
		System.out.println(a);
		int cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0,cnt6=0;
		for (int i = 0; i < 1000; i++) {
			int dice = (int)(Math.random()*6)+1;
			if(dice==1) {
				cnt1++;
			}else if(dice==2) {
				cnt2++;
			}else if(dice==3) {
				cnt3++;
			}else if(dice==4) {
				cnt4++;
			}else if(dice==5) {
				cnt5++;
			}else {
				cnt6++;
			}
		}
		System.out.println("dice1 : "+cnt1);
		System.out.println("dice2 : "+cnt2);
		System.out.println("dice3 : "+cnt3);
		System.out.println("dice4 : "+cnt4);
		System.out.println("dice5 : "+cnt5);
		System.out.println("dice6 : "+cnt6);		
	}
}
