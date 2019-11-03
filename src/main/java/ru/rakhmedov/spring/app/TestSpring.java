package ru.rakhmedov.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.rakhmedov.spring.beans.Computer;

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
			Computer computer = applicationContext.getBean("computer", Computer.class);
			System.out.println(computer);
		}
	}
}
