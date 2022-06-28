package com.prowings.usingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext cts=new ClassPathXmlApplicationContext("applicationContextforAnnotaton.xml");
	MobileforAnnotation mob=cts.getBean(MobileforAnnotation.class);
	System.out.println(mob);
}
}
