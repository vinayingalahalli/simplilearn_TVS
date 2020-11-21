package com.soap.consumer;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.service.CalculatorService;

public class ConsumerMain {

	public static void main(String[] args) {
		String url="http://localhost:1000/calci?wsdl";
		try {
			URL serviceUrl=new URL(url);
			QName qName=new QName("http://impl.service.com/", "CalculatorServiceImplService");
			Service service=Service.create(serviceUrl,qName);
			CalculatorService calculatorService=service.getPort(CalculatorService.class);
			System.out.println(calculatorService.sayHello("Rajesh"));
			System.out.println("Add : "+calculatorService.add(100, 222));
			System.out.println("Sub : "+calculatorService.sub(100, 222));
			System.out.println("Multiply : "+calculatorService.multiply(100, 222));
			System.out.println("Divide : "+calculatorService.div(100, 222));
			
		} catch (MalformedURLException e) {
			System.out.println(e);
		}
	}

}
