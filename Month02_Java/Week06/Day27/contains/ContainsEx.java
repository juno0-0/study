package contains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainsEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("강경오");
		list.add("고희광");
		list.add("김상윤");
		list.add("김이준");
		list.add("문우경");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 이름 >>> ");
		String name = sc.next();
		
		if(list.contains(name)) {
			System.out.println("우리반 학생입니다.");
		}else {
			System.out.println("우리반 학생이 아닙니다.");
		}
	}
}
