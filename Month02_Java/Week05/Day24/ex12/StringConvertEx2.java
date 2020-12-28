package ex12;

public class StringConvertEx2 {
	public static void main(String[] args) {
		String strData1 = "200";
		int i = Integer.parseInt(strData1);
		int j = 150;
		String strData2 = String.valueOf(j);
		String strData3 = j+"";
		System.out.println(strData3);
	}
}
