package ru.rakhmedov.spring.beans;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
@Component("classicalMusic")
public class ClassicalMusic implements Music
{
	private static List<String> musicList;
	private static Random random;

	static
	{
		musicList = Arrays.asList("Winter", "Spring", "Summer");
		random = new Random();
	}

	private ClassicalMusic()
	{
	}

	@PostConstruct
	public void init()
	{
		System.out.println(this.getClass().getCanonicalName() + "initialization");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println(this.getClass().getCanonicalName() + "destroying");
	}

	@Override
	public String getSong()
	{
		return musicList.get(random.nextInt(musicList.size()));
	}
}
