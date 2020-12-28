package p2;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[][] score = new int[5][];
		score[0] = new int[4];	//얘는 밑에 있는게 들어와서 Garvage
		score[4] = new int[3];
		score[0] = new int[5];	//무조건 나중에 입력한게 들어감
		
		int[][] score1 = {{1,2},{3,4,5},{6},{7},{8,9}};
		//각 열의 시작주소가 각 행에 들어가고 행의 시작주소가 score1에 들어간 것
//		int[][] score1 = new int[5][]{{1,2},{3,4,5},{6},{7},{8,9}}; 이건 안된다.
//		int[][] score1 = new int[][]{{1,2},{3,4,5},{6},{7},{8,9}}; 이건 된다.
		
		String[] strArray = new String[4];
		
		strArray[0] = "Java";//값을 넣는게 아니라 heap영역에 있는 Java의 주소를 strArray[0]에 넣어주는 것
		strArray[1] = new String("C++");
		strArray[2] = new String("C++");
		strArray[3] = new String("Java");
		//String은 예외적으로 값이 같고 new가 없으면 주소를 공유한다.
		
		for(String a : strArray) {
			System.out.println(a);
		}
		
		//== 연산자로 비교하기
		//strArray[0]이 가지고 있는 주소와 strArray[3]이 가지고 있는 주소가 같은지 비교
		if(strArray[0]==strArray[3]) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		System.out.println(strArray[1]==strArray[2]);
		
		//참조변수가 가르키는 값이 같은지 비교하기 .equals()
		System.out.println(strArray[0].equals(strArray[3]));
		
		//Student 클래스를 배열에 넣기
		Student[] studentArray = new Student[4];
		
		studentArray[0] = new Student();
		studentArray[1] = new Student();
		
		//== 연산자로 [0][1]이 같은지 비교하기
		System.out.println(studentArray[0]==studentArray[1]);
		
		//[0],[1]의 주소로 들어가면 있는 sa 변수의 값으로 비교하기
		System.out.println(studentArray[0].sa==studentArray[1].sa);
	}
}

class Student{
	int sa = 10;
}
