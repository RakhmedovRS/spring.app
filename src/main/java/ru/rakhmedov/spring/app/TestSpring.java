package ru.rakhmedov.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RakhmedovRS
 * @created 30-Oct-19
 */
public class TestSpring
{
	public static void main(String[] args)
	{
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"))
		{
			TestBean testBean = applicationContext.getBean("testBean", TestBean.class);
			System.out.println(testBean.getName());
		}
	}
}
