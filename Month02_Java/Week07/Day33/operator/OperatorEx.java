package operator;

import java.util.function.*;

public class OperatorEx {
	private static int[] scores = {92,95,87,85};
	
	private static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);//1. 92,92 2.92,95 3.95,87
		}
		return result;
	}
	
	private static int minOrMax(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score:scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	private static int notMinandMax(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score:scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	private static int midValue(IntBinaryOperator operator) {
		int[] result = new int[5];
		result[0]=scores[0];
		for(int score:scores) {
			result[0]=operator.applyAsInt(result[0], score);
		}
		return result[0];
	}
	
	public static void main(String[] args) {
		int max = maxOrMin((a,b)->{
			if(a>=b)return a;
			else return b;
		});
		System.out.println(max);
		
		int min = minOrMax((a,b)->{
			if(a>=b)return b;
			else return a;
		});
		System.out.println(min);
		
		
		int mid = notMinandMax((a,b)->{
			if(max!=a&&a!=min)return a;
			else return b;
		});
		System.out.println(mid);
		
		int mid2 = notMinandMax((a,b)->{
			if(max!=a&&a!=min&&a!=mid)return a;
			else return b;
		});
		System.out.println(mid2);
		
		
	}
}
