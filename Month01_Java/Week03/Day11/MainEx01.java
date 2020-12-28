package p1;

import java.util.Calendar;

import data.SingletoneClass;
import data.SungJuk;

/*
 * 
 */
public class MainEx01 {
	public static void main(String[] args) {
		SungJuk sj = new SungJuk();
		sj.setHakbun(202010);//SungJuk클래스에 있는 메소드를 사용하려면 그 메소드를 public로 바꿔줘야 한다.
		//private이라서 객체로 필드에 접근해서 값을 넣을 수 없다.  
		System.out.println(sj.getHakbun());
		
		//객체화 하기
		//SingletoneClass s = new SingletoneClass();//생성자가 private이라서 접근 못함
		SingletoneClass singleToneAddr1 = SingletoneClass.getInstance();//클래스메소드이므로 클래스명.메소드명()으로 접근함
		SingletoneClass singleToneAddr2 = SingletoneClass.getInstance();
		SingletoneClass singleToneAddr3 = SingletoneClass.getInstance();
		//getInstance()를 받는 참조변수는 3개이지만 가지고 있는 힙메모리 주소는 같다.
		System.out.println(singleToneAddr1);
		System.out.println(singleToneAddr2);
		System.out.println(singleToneAddr3);
		
		Calendar c = Calendar.getInstance();
	}
}
