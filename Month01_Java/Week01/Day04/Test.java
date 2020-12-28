package P1;

public class Test {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i==3)continue;//자기가 속해 있는 반복문에서 아래 부분을 하지 않고 다시 증감식으로 올라간다.
			for(int j=0;j<5;j++) {
				if(j==3)continue;//어디로 나갑니까? 자기가 속한 반복문을 탈출
				System.out.println("안쪽 반복문입니다."+j);
			}
			System.out.println("바깥쪽 반복문입니다."+i);
		}
	}

}
