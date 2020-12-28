package stringEx;

public class StringCharAtEx {
	public static void main(String[] args) {
		String ssn1 = "010624-1230123";
		String ssn2 = "010624-1230123";//위에 ssn1이랑 hashCode가 같으므로 동등객체
		String ssn3 = new String("010624-1230123");
		//※hashCode는 주소를 이용해 만들기 때문에 주소가 같으면 hashCode도 같다.
		
		if(ssn1==ssn2) {//ssn1의 주소와 ssn2의 주소가 같니? = true
			System.out.println("같은 주민번호");
		}else {
			System.out.println("다른 주민번호");
		}
		
		if(ssn1==ssn3) {//ssn1의 주소와 ssn3의 주소가 같니? = false
			System.out.println("같은 주민번호");
		}else {
			System.out.println("다른 주민번호");
		}
		
		if(ssn1.equals(ssn2)) {//ssn1의 주소의 값과 ssn2의 주소의 값이 같니?
			System.out.println("같은 주민번호");
		}else {
			System.out.println("다른 주민번호");
		}
		
		if(ssn1.equals(ssn3)) {//ssn1의 주소의 값과 ssn2의 주소의 값이 같니?
			System.out.println("같은 주민번호");
		}else {
			System.out.println("다른 주민번호");
		}
		
		/*charAt(index)
		char s = ssn1.charAt(7);
		System.out.println(s);
		char s1 = ssn1.charAt(0);
		char s2 = ssn1.charAt(1);
		//System.out.println(s1+s2);//아스키코드로 출력이되서 97이 나옴
		System.out.print(s1);
		System.out.println(s2);
		*/
		
		
		
		
		
	}
}
