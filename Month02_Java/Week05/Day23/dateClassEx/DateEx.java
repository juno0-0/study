package dateClassEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		System.out.println(now);
		
		//자료 형식을 맞춰주는 것
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String time = sdf.format(now);
		System.out.println(time);
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMM dd일, EEE요일, ''yy년");
		String time2 = sdf2.format(now);
		System.out.println(time2);
		//365일 중에서 오늘이 몇일째?
		SimpleDateFormat sdf3 = new SimpleDateFormat("365일 중에서 오늘 D일째 입니다.");
		String time3 = sdf3.format(now);
		System.out.println(time3);
		
		
	}
}
