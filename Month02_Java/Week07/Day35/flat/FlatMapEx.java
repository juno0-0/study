package flat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class FlatMapEx {
	static double sum=0;
	public static void main(String[] args) {
		List<String> list = Arrays.asList("2020/10/05", "1999/05/25");
		list.stream().flatMap(data->Arrays.stream(data.split("/")))
		.forEach(word->System.out.println(word));
		
		List<String> dList = Arrays.asList("1.1","2.2","3.3","4.4","5.5");
		dList.stream().flatMapToDouble(data->
		{
			String[] strArr = data.split(",");
			double[] doubleArr = new double[strArr.length];
			for(int i=0;i<strArr.length;i++) {
				doubleArr[i] = Double.parseDouble(strArr[i].trim());
			}
			return Arrays.stream(doubleArr);
		}).forEach(n->System.out.printf("%.2f ",(sum+=n)));
		
		
		
	}
}
