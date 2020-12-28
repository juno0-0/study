package staticInner;

import staticInner.OutterStatic.InnerStatic;

public class OutterStaticMain {
	public static void main(String[] args) {
		InnerStatic is = new InnerStatic();
		OutterStatic.InnerStatic ois = new OutterStatic.InnerStatic();
		ois.iia = 300;
		ois.iiaMethod();
		ois.iisa=300;
		ois.iisaMethod();
		//¶Ç´Â
		OutterStatic.InnerStatic.iisa=20;
		OutterStatic.InnerStatic.iisaMethod();
	}
}
