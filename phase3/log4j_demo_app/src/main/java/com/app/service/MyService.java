package com.app.service;

import org.apache.log4j.Logger;

public class MyService {
	private static Logger log=Logger.getLogger(MyService.class); 
	
	public void helloMyService(String name) {
		log.info("Hello "+name+" from helloMyService()");
		log.info("Bye Bye from helloMyService()");
	}
}
