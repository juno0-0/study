package properties;

import java.util.*;

public class PropertiesEx {
	public static void main(String[] args){
		Properties pro = new Properties();//��ü ����
		//Ű, �� �ֱ�
		pro.setProperty("timeout", "30");//put()�� ����ص� �ǰ� setProperty()�� ����ص� �ȴ�.
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
		while(e.hasMoreElements()) {//Iterator�� hasNext()�� ���� ����
			String element = (String)e.nextElement();//Iterator�� next()�� ���� ����
			System.out.println(pro.getProperty(element));
		}
	}
}
