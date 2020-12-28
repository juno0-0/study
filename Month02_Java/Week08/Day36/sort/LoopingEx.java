package sort;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * 루핑 : 요소 전체를 반복하는 것
 * 중간 처리 : peek()
 * 최종 처리 : forEach()
 */
public class LoopingEx {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		IntStream intstream = Arrays.stream(intArr).filter(a->a%2==0)
		//여기까지만 하면 최종 처리가 없어서 동작하지 않음
		.peek(a->System.out.println(a));//중간 처리
		//.forEach(System.out::println);//최종 처리
		
		//최종 처리를 추가하면 peek()가 동작한다.
		//int s = intstream.sum();//최종 처리
		//System.out.println("합계 : "+s);
		
		//최종처리를 위에서 하고 밑에서 다시 하면 이미 stream을 사용하였기 때문에 
		//IllegalStateException 발생
		double avg = intstream.average().getAsDouble();//최종 처리
		System.out.println("평균 : "+avg);
	}
}
