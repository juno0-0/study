package P2;

public class ArrayEx03 {
	public static void main(String[] args) {
		int temperature[];//int temperature[5];
		//스택공간에는 참조변수만 들어가서 공간은 쓸 수 없다.
		int input[];//int input(3);
		//()는 메소드를 뜻하고 요소를 넣을 수 없다.
		int[] data = new int[3];//int[3] data = new int[];
		//요소는 new로 만든 힙메모리 공간에 넣는다.
		double score[] = {3.1, 4.5};//int score[2] = {3.1, 4.5};
		//타입을 double로 바꾸고 요소가 몇개인지 초기값을 넣었기 때문에 좌변에 요소를 지운다.
		double values[][];//double values[3][4];
		//스택공간에는 참조변수만 들어가서 공간은 쓸 수 없다.
		double[][] eval;//double[3] eval[4];
		//스택공간에는 참조변수만 들어가서 공간은 쓸 수 없다.
		double unit[][] = {{1.1 , 2.3},  {3.4 , 4.5}};//double unit[2][2] = {1.1  2.3  3.4  4.5};
		//이미 초기값으로 몇칸 만들지 알기 때문에 요소를 지우고 2차원 배열이기 때문에 중괄호로 한번 더 묶는다.
		double price[] = {2.3, 3.4, 5.6, 2.1};
		//double price[];
		//price = {2.3, 3.4, 5.6, 2.1};
		//선언을 먼저하고 나중에 초기값을 넣는 경우는 new를 사용해야 한다. 아니면 선언과 동시에 초기값을 넣어야 한다
		double amount[][];
		amount = new double[][] {{3.1,5.4,7.3},{4.3}};
		//double amount[][];
		//amount = {{3.1, 5.4, 7.3}  {4.3}};
		//선언을 먼저하고 나중에 초기값을 넣는 경우는 new를 사용해야 한다. 아니면 선언과 동시에 초기값을 넣어야 한다
		double time[][] = {{6.1, 7.2}, {3.4, 5.6}, {3.9}};
		//double time[2][] = {{6.1, 7.2}, {3.4, 5.6}, {3.9}};
		//스택공간에는 참조변수만 들어가서 공간은 쓸 수 없다.
		
		//double 형 배열 real을 선언하면서 값 2.13, 5.71, 2.87, 7.89를 초기화하는 문장
		double[] real = {2.13, 5.71, 2.87, 7.89};
		
		//1차원 int 배열 ary를 원소 수 12로 선언 및 생성 문장과 세 번째 원소에 10을 저장하는 문장
		int[] ary = new int[12];
		ary[2] = 10;
		
		//int 형 배열 cnt에서 원소 20개를 생성하여 모든 원소 값이 0이 저장되도록 하는 문장
		int[] cnt = new int[20];
		for(int a : cnt) {
			System.out.println(a);
		}
		
		
		
		
	}
}
