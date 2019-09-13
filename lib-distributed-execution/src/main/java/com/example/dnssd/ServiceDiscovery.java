package com.example.dnssd;

import java.net.InetAddress;
import javax.jmdns.JmDNS;

public class ServiceDiscovery {
	
	public ServiceDiscovery(String servicetype,SimpleListener simpleListener) {
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			jmdns.addServiceListener(servicetype, simpleListener);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ServiceDiscovery() {
		this("example-service.local.",new SimpleListener());
	}
	

}
