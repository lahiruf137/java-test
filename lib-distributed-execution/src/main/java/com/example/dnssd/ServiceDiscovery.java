package com.example.dnssd;

import java.net.InetAddress;
import javax.jmdns.JmDNS;

public class ServiceDiscovery {
	
	public ServiceDiscovery(String Servicetype,SimpleListener simpleListener) {
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			jmdns.addServiceListener("_http._tcp.local.", simpleListener);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ServiceDiscovery() {
		this("example-service.local.",new SimpleListener());
	}
	

}
