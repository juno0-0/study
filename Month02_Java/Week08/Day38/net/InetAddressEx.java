package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) throws Exception {
		InetAddress local = InetAddress.getLocalHost();
		String ip = local.getHostAddress();
		System.out.println("�� IP�ּ� : "+ip);
		
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress iaA : iaArr) {
			System.out.println("naver IP�ּҵ� : "+iaA.getHostAddress());
		}
	}
}
