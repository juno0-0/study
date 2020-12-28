package ex11;

public class StringConvertEx {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		System.out.println(obj1==obj2);
		System.out.println(obj3==obj4);//false가 나오는 이유 
		//Integer에서 값의 범위가 -128~+127까지는 ==연산자는 값을 비교, 넘어가면 주소를 비교
		//그냥 equals()로 비교하자
		System.out.println(obj3.equals(obj4));
	}
}
