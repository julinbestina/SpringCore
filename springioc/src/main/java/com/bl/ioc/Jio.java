package com.bl.ioc;


public class Jio implements Sim{

	@Override
	public void calling() {
	    System.out.println("Calling using jio sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using jio sim");
		
	}
}
