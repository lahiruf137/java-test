package com.example.lib_distributed_execution;
import javax.jmdns.ServiceEvent;

import com.example.dnssd.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        Thread server=new Thread(new SampleServer());
        server.start();
        System.out.println("test");
        new ServiceDiscovery("_example._tcp.local.",new Test1());
        Thread.sleep(30000);
        System.out.println("ok");
        System.exit(0);
    }
    
    static class Test1 extends SimpleListener{
    	@Override
    	public void serviceResolved(ServiceEvent event) {
    		System.out.println("Found the service");
   		 }
    	
    }
    
    static class SampleServer implements Runnable {
		public void run() {
			 new ServiceRegistration();
		}
	}
}
