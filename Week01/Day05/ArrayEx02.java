package P1;

public class ArrayEx02 {
	public static void main(String[] args) {
		//int 배열 선언 --> 7 요소(7칸)
		//배열의 default 값 알기
		int[] arInt;
		arInt = new int[7];
		
		for(int i : arInt) {
			System.out.println("i => "+i);
		}
		System.out.println();
		for(int i=0;i<arInt.length;i++) {
			System.out.println("i => "+arInt[i]);
		}
		System.out.println();
		//boolean 배열을 선언하고 배열의 요소 3을 준다. 그리고 출력한 뒤 초기값이 false인지 확인
		boolean[] arBoolean = new boolean[3];
		for(boolean b : arBoolean) {
			System.out.println("b => "+b);//false
		}
		System.out.println();
		//클래스 배열을 선언하고 배열의 요소 3을 준다. 그리고 출력한 뒤 초기값이 null인지 확인
		String[] arString = new String[3];
		for(String s : arString) {
			System.out.println("s => "+s);//null
		}
		System.out.println();
		Student1[] arTest = new Student1[3];
		for(Student1 t : arTest) {
			System.out.println("t => "+t);//null
		}
		System.out.println();
		//InterEx 인터페이스를 만들고 배열로 선언하고 배열 요소 2개로 준다.
		InterEx[] arInter = new InterEx[2];
		for(InterEx in : arInter) {
			System.out.println("in => "+in);
		}
		
		//초기값 넣는 방법1 - new 연산자를 이용
		//초기값 넣는 방법2 - 선언하자마자 바로 넣기
		int[] intArray2 = {1,2,3,4,5};
		double[] doubleArray2 = {1.1, 2.2, 3.3};
		
		System.out.println(intArray2.length);
		System.out.println(doubleArray2.length);
		
		 
	}
}

class Student1{
	
}

interface InterEx{
	
}
