package dateClassEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		System.out.println(now);
		
		//�ڷ� ������ �����ִ� ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String time = sdf.format(now);
		System.out.println(time);
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMM dd��, EEE����, ''yy��");
		String time2 = sdf2.format(now);
		System.out.println(time2);
		//365�� �߿��� ������ ����°?
		SimpleDateFormat sdf3 = new SimpleDateFormat("365�� �߿��� ���� D��° �Դϴ�.");
		String time3 = sdf3.format(now);
		System.out.println(time3);
		
		
	}
}
