package com.example.dnssd;

import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

public class SimpleListener implements ServiceListener {
	public void serviceAdded(ServiceEvent event) {
		System.out.println("Found the service");
	}
     public void serviceRemoved(ServiceEvent event) {
    	 System.out.println("Found the service");
     }
	 public void serviceResolved(ServiceEvent event) {
		 System.out.println("Found the service");
	 }
	
}
