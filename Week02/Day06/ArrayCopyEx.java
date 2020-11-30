package p2;

public class ArrayCopyEx {
	public static void main(String[] args) {
		//배열 복사하기
		int[] oldIntArray = {1,2,3,4,5,6};
		int[] oldIntArray1 = {4,5,7,8};
		int[] newIntArray = new int[10];
		
		//복사 전
		for(int i : newIntArray) {
			System.out.print(i+" ");
		}System.out.println();
		
		for(int i=0;i<oldIntArray.length;i++) {
			newIntArray[i]=oldIntArray[i];
		}
		
		//복사 후
		for(int i : newIntArray) {
			System.out.print(i+" ");
		}System.out.println();
		
		//배열을 더한 후 복사하기
		//복사1 oldIntArray
		for(int i=0;i<oldIntArray.length;i++) {
			newIntArray[i]=oldIntArray[i];
		}
		//복사2 oldIntArray1
		int j=0;
		for(int i=oldIntArray.length;i<newIntArray.length;i++) {
			newIntArray[i]=oldIntArray1[j];
			j++;
		}
		
		for(int i:newIntArray) {
			System.out.print(i+" ");
		}System.out.println();
		
		int[] oA = {10,20};
		int[] nA = new int[5];
		
//						원본배열	 복사할시작인덱스    복사받을배열     복사받을인덱스    길이(몇개 할꺼?)
//		System.arraycopy(src,      srcPos,       dest,     destPos,     length);
		System.arraycopy(oA, 0, nA, 0, oA.length);
		
		for(int i : nA) {
			System.out.print(i+" ");
		}System.out.println();
		
		double[] intArray2 = {100,200};
		double[] doubleArray1 = {5.3, 4.2, 8.3};
		double[] merageArray = new double[5];
		
		System.arraycopy(intArray2, 0, merageArray, 0, intArray2.length);
		int g=0;
		for(int i=2;i>=0;i--) {
			System.arraycopy(doubleArray1, i, merageArray, intArray2.length+g, 1);
			++g;
		}
		
		for(double i:merageArray) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
