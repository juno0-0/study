package P3;

public class ArrayEx01 {

	public static void main(String[] args) {
		//배열 선언 초기값을 넣기
		int[] intArray = null; 
		char[] charArray = null;
		short shortArray[] = null;	//[]는 타입뒤, 변수명뒤 상관 없다.
		short[] shortArray1 = null;
		long[] longArray = null;
		byte[] byteArray = null;
		
		Student[] studentArray;	//Student 클래스의 배열
		
		//사용하려면 힙메모리에 올려야 합니다.
		intArray = new int[5];
		charArray = new char[5];
		shortArray = new short[5];
		shortArray1 = new short[5];
		longArray = new long[5];
		byteArray = new byte[5];
		studentArray = new Student[5];
		
		//배열을 선언하면서 동시에 힙메모리에 올리기 실수형 배열 3요소
		float[] floatArray = new float[3];
		double[] doubleArray = new double[3];
		String[] stringarray = new String[3];
		
		//배열명을 출력하기 = hashCode(주소)가 출력 된다.
		//배열명만 출력하면 뒤에 toString()메소드가 자동으로 붙여서 호출된다.
		//toString() : 현재 자료를 문자열로 출력하세요.
		System.out.println(intArray);
		System.out.println(charArray.toString());
		System.out.println(shortArray);
		System.out.println(shortArray1);
		System.out.println(longArray);
		System.out.println(byteArray.toString());
		System.out.println(studentArray);
		System.out.println(floatArray);
		System.out.println(doubleArray);
		System.out.println(stringarray.toString());
		
		
		
	}

}
class Student{
	
}
