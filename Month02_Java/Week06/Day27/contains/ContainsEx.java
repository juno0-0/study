package contains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainsEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("�����");
		list.add("����");
		list.add("�����");
		list.add("������");
		list.add("�����");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� �̸� >>> ");
		String name = sc.next();
		
		if(list.contains(name)) {
			System.out.println("�츮�� �л��Դϴ�.");
		}else {
			System.out.println("�츮�� �л��� �ƴմϴ�.");
		}
	}
}
