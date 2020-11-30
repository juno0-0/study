package P1;

public class ReferenceAddressEx01 {
	public static void main(String[] args) { 
		Object1 refVal1 = new Object1();
		//new Object1 = Heap영역에 Object1을 올림 = 주소가 생김 = refVal1에 주소를 담음
		Object2 refVal2 = new Object2();
		//new Object2 = Heap영역에 Object2를 올림 = 주소가 생김 = refVal2에 주소를 담음
		Object2 refVal3 = new Object2();
		//new Object3 = Heap영역에 Object3를 올림 = 주소가 생김 = refVal3에 주소를 담음
		
		if(refVal1.irum1.equals(refVal2.irum2))
			System.out.println("같은 이름입니다.");
		else
			System.out.println("다른 이름입니다.");
		if(!(refVal1.equals(refVal2)))
			System.out.println("다른 주소입니다.");
		else
			System.out.println("같은 주소입니다.");
		if(!(refVal2.equals(refVal3)))
			System.out.println("다른 주소입니다.");
		else
			System.out.println("같은 주소입니다.");
		if(!(refVal2.equals(refVal3)))
			System.out.println("다른 주소입니다.");
		else
			System.out.println("같은 주소입니다.");
		
		String name1 = "방준호";
		String name2 = "방준호";
		if(name1==name2)
			System.out.println("같은 이름");
		else 
			System.out.println("다른 이름");
		
		String name3 = new String("방준호");
		String name4 = new String("방준호");
		
		if(name3==name4)//문자열리터럴이 동일하다면 String 객체의 주소를 공유한다.
			System.out.println("같은 이름");
		else 
			System.out.println("다른 이름");
		
		if(name3.equals(name4))//name3의 주소로 가면 있는 값과 name4의 주소로 가면 있는 값이 같은지 비교
			System.out.println("같은 이름");
		else 
			System.out.println("다른 이름");
		
		
	}
}

class Object1{
	String irum1 = "방준호";
}
class Object2{
	String irum2 = "방준호2";
}
class Object3{
	//객체3
	
}