package p1;

public class ArrayEx {
	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		//10 20 30 ... 값 넣기
		int number=10;
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				scores[i][j]=number;
				number+=10;
			}
		}
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] arr = new int[][] {{100,200,300},{400,500,600}};
		int[][] arr1 = {{1000,2000,3000},{4000,5000,6000}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//향상된 for로
		int n=0;
		for(int[] farr1 : arr1) {
			for(int ffarr1 : farr1) {
				System.out.print(ffarr1+" ");
			}
			System.out.println();
		}
		
//		int[][][] a = {{{65,66},{67,68},{69,70}},{{71,72},{73,74},{75,76}}};
		int[][][] arrr = new int[2][3][2];
		for(int i=0;i<arrr.length;i++) {
			for(int j=0;j<arrr[i].length;j++) {
				for(int k=0;k<arrr[i][j].length;k++) {
					arrr[i][j][k]=65+n++;
				}
			}
		}
		int i=0;
		for(int[][] a2: arrr) {
			System.out.println(i +"면");
			i++;
			for(int[] a1:a2) {
				for(int a : a1) {
					System.out.print((char)a+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
	}//end main
}//end class
