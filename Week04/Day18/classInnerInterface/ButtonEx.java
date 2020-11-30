package classInnerInterface;

public class ButtonEx {
	int a = 20;
	static int sa = 30;
	void aMethod() {}
	static void saMethod() {
		new onClickListener() {
			@Override
			public void off() {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void on() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	
	interface onClickListener{
		default void dMethod() { 
			//System.out.println(a=a+10);
			System.out.println(sa=sa+20);
			//aMethod();
			saMethod();
		}
		void off();
		void on();
	}
	
	
	public static void main(String[] args) {
		ButtonEx b = new ButtonEx();
		ButtonEx.onClickListener o = new onClickListener() {
			
			@Override
			public void on() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void off() {
				// TODO Auto-generated method stub
				
			}
			
		};
		o.dMethod();
	}
	
	
}
