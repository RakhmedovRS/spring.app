package ru.rakhmedov.spring.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
@Component("classicalMusic")
public class ClassicalMusic implements Music
{
	private ClassicalMusic()
	{
	}

	@PostConstruct
	public void init()
	{
		System.out.println("initialization");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("destroying");
	}

	@Override
	public String getSong()
	{
		return "Winter";
	}
}
