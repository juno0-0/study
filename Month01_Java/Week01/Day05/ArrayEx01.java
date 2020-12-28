package P1;

import java.util.Scanner;

public class ArrayEx01 {
	public static void main(String[] args) {
		//배열 선언
		int[] intArray;
		double[] doubleArray;
		boolean[] booleanArray;	//전부 Stack영역에 만들어지지만 주소가 들어가는 공간이 비어있음
		String[] stringArray;
		Student1[] stArray;
		
		//배열에 초기값 넣기
		intArray = null;
		doubleArray = null;
		booleanArray = null;	//주소가 들어가는 공간에 null을 넣어서 초기화
		stringArray = null;
		stArray = null;
		
		//배열을 선언하자 마자 초기값 넣기
		byte[] byteArray = null;	
		float[] floatArray = null;
		JavaB[] javaBArray = null;
		
		/*
		//실제 값을 넣기
		//1)new 이용하기
		//2)초기값으로 바로 넣기
		//1-1 ex)
		intArray = new int[] {1,2,3};//2
		doubleArray = new double[] {1.1,2.2,3.3};
		booleanArray = new boolean[] {true,true,false};
		stringArray = new String[] {"안녕","하세요"};
		stArray = new Student[] {new Student(), new Student()};//클래스배열(객체를 여러개 생성)
	
		
		//1-2 ex)
		intArray = new int[5];
		doubleArray = new double[5];
		booleanArray = new boolean[5];
		stringArray = new String[5];
		stArray = new Student[5];
		
		//키보드로 입력 받아서 배열에 값을 넣기
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<intArray.length;i++) {
			System.out.print("정수 "+(i+1)+"개 입력==>");
			intArray[i] = sc.nextInt();
		}
		
		for(int i=0;i<doubleArray.length;i++) {
			System.out.print("실수 "+(i+1)+"개 입력==>");
			doubleArray[i] = sc.nextDouble();
		}
		
		for(int i=0;i<booleanArray.length;i++) {
			System.out.print("논리 "+(i+1)+"개 입력==>");
			booleanArray[i] = sc.nextBoolean();
		}	
		
		sc.nextLine();
		
		for(int i=0;i<stringArray.length;i++) {
			System.out.print("문자열 "+(i+1)+"개 입력==>");
			stringArray[i] = sc.next();
		}
		
		//배열안에 들어 있는 자료를 출력해보기
		//방법1. for 출력
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<doubleArray.length;i++) {
			System.out.print(doubleArray[i]+" ");
		}
		System.out.println();
				
		//방법2. 향상된 for 출력(foreach)
		//for(type 변수명 : 집합(배열명,컬렉션 등))
		for(boolean b : booleanArray) {
			System.out.print(b+" ");
		}
		System.out.println();
		
		for(String s : stringArray) {
			System.out.print(s);
		}
		 */
		
		
		
		
		
		
		
	}//end main
}//end class
//class Student{
//	
//}

class JavaB{
	
}