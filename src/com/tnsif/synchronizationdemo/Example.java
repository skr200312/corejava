package com.tnsif.synchronizationdemo;
//synchronization demo

public class Example {
	synchronized static void display() {
		Thread g=Thread.currentThread();
	
		for(int i=0;i<=3;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(g.getName()+" "+i);
			}
			catch(Exception e) {
				
			}
		
	}
	 }

}
