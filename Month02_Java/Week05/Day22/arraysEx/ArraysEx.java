package arraysEx;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		char[] charArr1 = {'J','A','V','A'};
		byte[] byteArr1 = {1,0,1};
		double[] doubleArr1 = {1.1,2.2,3.3,4.4,5.5};
		Car[] carArr1 = {new Car(), new Car()};
		
		int[] intArr1 = new int[3];
		intArr1[0] = 1;
		intArr1[1] = 2;
		intArr1[2] = 3;
		//int[] intArr1 = {1,2,3};
	
		char[] charArr2 = Arrays.copyOf(charArr1, 4);
		byte[] byteArr2 = Arrays.copyOf(byteArr1, 3);
		byte[] copyByte = Arrays.copyOf(byteArr1, 2);
		double[] doubleArr2 = Arrays.copyOf(doubleArr1, 3);
		Car[] carArr2 = Arrays.copyOf(carArr1, 2);
		int[] intArr2 = Arrays.copyOf(intArr1, 3);
		
		for(char c : charArr1) {
			System.out.println(c+" ");
		}
		System.out.println("copy자료");
		for(char c : charArr2) {
			System.out.println(c+" ");
		}
		System.out.println();
		for(byte b : copyByte) {
			System.out.println(b);
		} 
		System.out.println();
		for(byte b : byteArr2) {
			System.out.println(b);
		}
		System.out.println();
		double[] dcor = Arrays.copyOfRange(doubleArr1, 2, 4);
		for(double d : dcor) {
			System.out.println(d);
		}
		System.out.println();
		char[] arr4 = new char[charArr1.length];//요소가 4개
		char[] arr5 = {'P','r','o'};
		System.arraycopy(charArr1, 0, arr4, 0, charArr1.length);
		for(char a : arr4) {
			System.out.println(a);
		}
		char[] arr6 = new char[8];
		System.out.println();
		System.arraycopy(arr4, 0, arr6, 0, 4);
		System.arraycopy(arr5, 0, arr6, 4, 3);
		for(char c : arr6) {
			System.out.print(c+"");
		}
		System.out.println();
		String[] test = new String[10];
		String[] arS = {"T","h","i","s","i","s","a","b","o","o","k"};
		System.arraycopy(arS, 2, test, 0, 2);
		System.arraycopy(arS, 8, test, 2, 2);
		System.arraycopy(arS, 0, test, 4, 2);
		for(String s : test) {
			System.out.println(s);
		}
		
	}
	

}
class Car{
	
}

//This is a book ==> isooT








