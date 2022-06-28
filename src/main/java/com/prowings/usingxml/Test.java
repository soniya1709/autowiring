package com.prowings.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext cts=new ClassPathXmlApplicationContext("applicationContext.xml");
	Mobile mob=(Mobile) cts.getBean("mob");
	System.out.println("Autowiring using ByType"+mob);
	Mobile mob1=(Mobile) cts.getBean("mob1");
	System.out.println("Autowiring using ByName"+mob1);
}
}
