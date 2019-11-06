package ru.rakhmedov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.rakhmedov.spring.beans.Computer;

/**
 * @author RakhmedovRS
 * @created 30-Oct-19
 */
public class TestSpring
{
	public static void main(String[] args)
	{
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class))
		{
			Computer computer = applicationContext.getBean("computer", Computer.class);
			System.out.println(computer);
		}
	}
}
