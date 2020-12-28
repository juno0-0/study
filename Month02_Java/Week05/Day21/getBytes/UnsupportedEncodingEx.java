package getBytes;

import java.io.UnsupportedEncodingException;

public class UnsupportedEncodingEx {
	public static void main(String[] args) {
		String str = "안녕하세요.";
		//indexOf("")
		int i = str.indexOf("하");
		System.out.println(i);
		int j = str.indexOf("요");
		System.out.println(j);
		int k = str.indexOf("정");
		if(k==-1) {
			System.out.println("해당 문자는 없습니다.");
		}else {
			System.out.println(k);			
		}
		//replace('','')
		String rstr = str.replace('안', '감');
		System.out.println(rstr);
		//replaceAll("","")
		String rastr = str.replaceAll("안녕", "수고");
		System.out.println(rastr);
		//substring(index)
		String s1 = str.substring(2);
		System.out.println(s1);
		//substring(index1, index2)
		String s2 = str.substring(0, 1);//0번부터 1번 미만까지
		System.out.println(s2);
		//trim()
		System.out.println("호옹");
		String strr = "    띄어 쓰기    ";
		System.out.println(strr.length());
		String trimS1 = strr.trim();
		System.out.println(strr.length());		
		System.out.println(trimS1);
		//valueOf
		int ii = 10;
		double dd = 10.24;
		Car c = new Car();
		//참조변수의 자료형을 String으로 바꾸기
		String sc = String.valueOf(c);
		System.out.println(sc);
		String sii = String.valueOf(ii);//10 --> "10"
		System.out.println(sii);
		String sdd = String.valueOf(dd);//10.24 --> "10.24"
		System.out.println(sdd);
		System.out.println("=================");
		System.out.println(ii+dd);//숫자니까 연산이 됨
		System.out.println(sii+sdd);//문자니까 연결이 됨
		
		//기본문자셋
		//2진수 배열로 바꾼 것은 시스템 파일로 만들거나 네트워크로 보낼 때 
		byte[] bytes1 = str.getBytes();//인코딩 10진수 --> 2진수 byte[]
		System.out.println(bytes1.length);//한글 1글자가 2byte라서 11byte가 나옴
		for(byte b : bytes1) {//안녕하세요가 2진수로 바뀐 것
			System.out.println(b);
		}
		
		String str1 = new String(bytes1);//디코딩 2진수 배열 --> 10진수
		System.out.println(str1);
		
		//한글 완성형으로
		//구글에 문자셋 검색하면 나라별로 해당하는 문자셋이 나온다.
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
			for(byte b:bytes2) {
				System.out.println(b);
			}
			String str2 = new String(bytes2, "EUC-KR");//디코딩 2진수 배열 --> 10진수
			System.out.println(str2);
		} catch (UnsupportedEncodingException e) {}
		
		//UTF-8로(유니코드)
		//UTF-8은 3byte씩
		try {
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(bytes3.length);
			for(byte b:bytes3) {
				System.out.println(b);
			}
			String str3 = new String(bytes3, "UTF-8");//디코딩 2진수 배열 --> 10진수
			System.out.println(str3);
		} catch (UnsupportedEncodingException e) {}
		
		
		
		
		
		
	}
}

class Car{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car";
	}
}
