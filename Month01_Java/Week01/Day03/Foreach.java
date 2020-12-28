package P1;

public class Foreach {

	public static void main(String[] args) {
		//향상된 for문 설명
		int[] number = {1,2,3,4,5};
		for(int n_value:number) {
			System.out.println(n_value);
		}
		
		double[] dnumber = {1.1,3.3,6.6,7.7};
		for(double d_value:dnumber) {
			System.out.println(d_value);
		}
	}

}
