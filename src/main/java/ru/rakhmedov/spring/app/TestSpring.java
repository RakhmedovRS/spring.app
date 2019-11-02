package ru.rakhmedov.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.rakhmedov.spring.beans.MusicPlayer;

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
			MusicPlayer firstPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
			MusicPlayer secondPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
			System.out.println(firstPlayer == secondPlayer);
			System.out.println(firstPlayer);
			System.out.println(secondPlayer);

			firstPlayer.setVolume(10);
			System.out.println(firstPlayer.getVolume());
			System.out.println(secondPlayer.getVolume());
		}
	}
}
