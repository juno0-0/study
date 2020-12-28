package poly;
//메인
public class Main {
	public static void main(String[] args) {
		/*
		//CaptionTV(자식클래스1) 인스턴스화 하기
		CaptionTV ctv = new CaptionTV();
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		//AITV(자식클래스2) 인스턴스화 하기
		AITV atv = new AITV();
		atv.channelDown();
		System.out.println(atv.channel);
		
		//TV(부모클래스) 인스턴스화 하기
		TV tv = new TV();
		tv.channelUp();
		System.out.println(tv.channel);
		//여기까지는 자기의 인스턴스는 자기의 타입으로 받았음
		*/
		
		//부모 참조변수 = new 자식();
		//자식이 힙영역에 올라갈 때 부모를 먼저 올리고 올라감
		//자식의 인스턴스화를 부모가 받는 것 = 다형성
		TV ctv = new CaptionTV();//이 모습이 다형성, 작은게 큰걸로 들어갈 때 자동형변환(up-casting)이 된다.
		TV atv = new AITV();
		
		//부모가 힙영역에 올라갈 때 자식은 올라가지 않은 상태라서 오류
		//힙영역에는 TV() 부모 클래스만 있는데 참조변수는 자식 클래스를 가르켜야 하기 때문에
//		CaptionTV cttv = new TV();
//		AITV aitv = new TV();
		
		
		//부모 필드, 메소드 모두 사용할 수 있다.
		ctv.power=true;
		atv.channel=7;
		atv.channelUp();
		atv.channelDown();
		System.out.println(atv.channel);
		
		//부모의 메소드가 아니라 자식의 메소드가 실행되야 할 경우
		//방법1. Override된 것은 자식의 메소드가 수행된다.
		//부모타입으로 참조변수를 받았지만 재정의한 경우 재정의된 메소드가 출력
		ctv.channelUp();
		ctv.channelDown();
		
		//방법2. 자식의 순수한 메소드를 수행하고 싶을 때
		//ctv.text = "홍길동";(X)
		//ctv는 부모타입의 참조변수
		//=ctv에 가면 TV가 있다.
		//=메모리에는 자식클래스가 있지만 참조변수는 TV를 가르키고 있어서 TV에 text가 없기 때문에 못쓴다.
		//자식타입		      부모타입을 자식타입으로 형변환
		CaptionTV ct = (CaptionTV)ctv;
		//ctv의 주소를 ct에 넣어준다.
		//여기서 클래스타입이 다르기 때문에 형변환을 한다.
		ct.text="홍길동";
		ct.captionTVMethod();
		System.out.println(ct.text);
		
		
		//여기서 실행이 안되는 이유는
		//tv3에는 TV의 인스턴스의 주소가 들어가기 때문에
		//힙메모리에는 CaptionTV가 없다.
		//그런데 ct2에 tv3의 주소를 넘겼는데 주소를 따라 가도 힙메모리에는 CaptionTV가 없기 때문에 ct2의 멤버를 사용할 수 없다.
		TV tv3 = new TV();		
//		CaptionTV ct2 = (CaptionTV)tv3;
		System.out.println(tv3 instanceof TV);
		System.out.println(atv instanceof CaptionTV);
		System.out.println(atv instanceof AITV);
		System.out.println(atv instanceof TV);
		System.out.println(ctv instanceof TV);
		
//		if(ct2 instanceof CaptionTV) {
//			ct2.text = "이순신";
//			ct2.captionTVMethod();
//			System.out.println(ct2.text);			
//		}
		
		
		
		
		
	}
}
