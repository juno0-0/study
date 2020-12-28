package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) throws Exception {
		InetAddress local = InetAddress.getLocalHost();
		String ip = local.getHostAddress();
		System.out.println("郴 IP林家 : "+ip);
		
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress iaA : iaArr) {
			System.out.println("naver IP林家甸 : "+iaA.getHostAddress());
		}
	}
}
