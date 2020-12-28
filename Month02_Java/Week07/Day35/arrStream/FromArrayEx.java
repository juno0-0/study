package arrStream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

//배열로 오리지널 스트림 얻기
public class FromArrayEx {
	public static void main(String[] args) {
		//1단계 배열 만들기
		String[] strArray = {"홍길동", "신용권", "김미나"};
		//2단계 오리지널 스트림 얻기
		//Stream<String> strStream = Arrays.stream(strArray);
		Stream<String> strStream = Stream.of(strArray);
		
		//3단계 최종 스트림 출력하기
		strStream.forEach(a->System.out.println(a));
		//strStream.forEach(a->System.out.println(a));
		//최종 스트림을 2번 실행하면 런타임오류 발생
		//이미 첫번째 최종 스트림에서 가지고 있는 값을 모두 소진했기 때문에
		//두번째 최종 스트림에선 가지고 있는게 없기 때문이다.
		
		double[] doubleArray = {1.1,2.2,3.3};
		//DoubleStream doubleStream = Arrays.stream(doubleArray);
		Stream<double[]> dd = Stream.of(doubleArray);
		dd.forEach(a->System.out.println(a));
		
	}
}
