package properties;

import java.util.*;

public class PropertiesEx {
	public static void main(String[] args){
		Properties pro = new Properties();//객체 생성
		//키, 값 넣기
		pro.setProperty("timeout", "30");//put()을 사용해도 되고 setProperty()를 사용해도 된다.
		pro.setProperty("language", "kr");
		pro.setProperty("size", "10");
		pro.setProperty("capacity", "10");
		pro.put("a", "100");
		pro.put("b", "1000");
		pro.put("c", "20");
		pro.put("d", "2200");
		pro.put("e", "10000");
		pro.put("f", "30000");
		pro.put("g", "2000");
		
		//System.out.println(pro.get("a"));
		Enumeration e = pro.propertyNames();
		while(e.hasMoreElements()) {//Iterator의 hasNext()와 같은 역할
			String element = (String)e.nextElement();//Iterator의 next()와 같은 역할
			System.out.println(pro.getProperty(element));
		}
	}
}
