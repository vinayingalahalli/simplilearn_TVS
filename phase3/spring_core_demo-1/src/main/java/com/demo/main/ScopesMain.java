package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.HiScope;

public class ScopesMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("scopesdemo.xml");
		HiScope h1=(HiScope) context.getBean("h1");
		System.out.println("Message from h1(singleton) : "+h1.getMessage());
		System.out.println("Hashcode of h1(singleton) : "+System.identityHashCode(h1));
		
		HiScope h2=(HiScope) context.getBean("h2");
		System.out.println("Message from h2(prototype) : "+h2.getMessage());
		System.out.println("Hashcode of h2(prototype) : "+System.identityHashCode(h2));
		
		
		HiScope h11=(HiScope) context.getBean("h1");
		System.out.println("Message from h11(which is of bean id h1)(singleton) : "+h11.getMessage());
		System.out.println("Hashcode of h11 (which is of bean id h1)(singleton): "+System.identityHashCode(h11));
		
		HiScope h22=(HiScope) context.getBean("h2");
		System.out.println("Message from h22(of bean h2) (prototype) : "+h22.getMessage());
		System.out.println("Hashcode of h22 (of bean h2) (prototype): "+System.identityHashCode(h22));
	}

}
