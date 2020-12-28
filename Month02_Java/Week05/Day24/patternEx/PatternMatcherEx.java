package patternEx;

import java.util.regex.Pattern;

public class PatternMatcherEx {
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[a-zA-Z][a-zA-Z_0-9]{7,11}";//{7,11} 7글자부터 11글자가 들어간다.
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("가능");
		}else {
			System.out.println("불가능");
		}
	}
}
