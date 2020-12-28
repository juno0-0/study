package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx02 {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("사용방법은 java 파일명input.txt");
			System.exit(0);
		}
		Properties pro = new Properties();
		String inputFile = args[0];
		
		try {
			pro.load(new FileInputStream(inputFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("지정된 파일을 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		} 
		
	}
}
