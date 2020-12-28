package anonymous1;

public class SearchRun{
	public static void main(String[] args) {	
		Searchable s = new Searchable() {
			int sss=100;
			@Override
			public void s2() {
				cc();
				s1();
				sss=sss+10;
			}
			@Override
			public void s1() {
				cc();
				sss=sss+10;
			}
			void cc() {
				s2();
			}
		};
		s.s1();
		s.s2();
		//s.cc();
		
			
	}
}
