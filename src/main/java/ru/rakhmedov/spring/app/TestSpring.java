package ru.rakhmedov.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.rakhmedov.spring.beans.ClassicalMusic;

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
			System.out.println(applicationContext.getBean("classicalMusic", ClassicalMusic.class).getSong());
		}
	}
}
